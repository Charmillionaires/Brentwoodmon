/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import audio.AudioPlayer;
import environment.Environment;
import image.ResourceTools;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import map.Item;
import map.ItemEventHandlerIntf;
import map.Map;
import map.MapVisualizerDefault;
import map.Obstacle;
import map.ObstacleEventHandlerIntf;
import map.Portal;
import map.PortalEventHandlerIntf;

/**
 *
 * @author kimberlygilson
 */
public class BrentwoodEnvironment extends Environment implements PortalEventHandlerIntf, ObstacleEventHandlerIntf, ItemEventHandlerIntf {

    private Map currentMap;
    private Map bcampus;
    private Map ucampus;
    private Map dross;
    private MapVisualizerDefault mapVisualizer;

    {
        mapVisualizer = new MapVisualizerDefault(true, false);

        bcampus = MapBin.getCampusBottomMap();
        configureMap(bcampus);

        ucampus = MapBin.getCampusUpperMap();
        configureMap(ucampus);

        dross = MapBin.getDownSRossMap();
        configureMap(dross);

        Map.addPortal(bcampus, new Point(30, 19), dross, new Point(9, 9));
        Map.addPortal(dross, new Point(9, 9), bcampus, new Point(30, 19));
        Map.addPortal(dross, new Point(5, 9), bcampus, new Point(30, 19));
        Map.addPortal(bcampus, new Point(37, 0), ucampus, new Point(25, 34));
        Map.addPortal(bcampus, new Point(36, 0), ucampus, new Point(24, 34));
        Map.addPortal(ucampus, new Point(24, 34), bcampus, new Point(36, 0));
        Map.addPortal(ucampus, new Point(25, 34), bcampus, new Point(37, 0));

        currentMap = bcampus;
    }

    public BrentwoodEnvironment() {
        super();
    }

    private void configureMap(Map map) {
        map.setMapVisualizer(mapVisualizer);
        map.setPortalEventHandler(this);
        map.setObstacleEventHandler(this);
        map.setItemEventHandler(this);
    }

    public BrentwoodEnvironment(Image background) {
        super(background);
    }

    @Override
    public boolean portalEvent(Portal portal) {
        currentMap = portal.getDestinationMap();
        return true;
    }

    @Override
    public boolean obstacleEvent(Obstacle obstacle) {
        System.out.println("Obstacle " + obstacle.getLocation() + " " + obstacle.getType());
        AudioPlayer.play("/resources/water.wav");
//        AudioPlayer.
        return false;
    }

    @Override
    public void initializeEnvironment() {
//        this.setBackground(ResourceTools.loadImageFromResource("resources/bcampus_bottom.bmp"));
//        this.getParent().setSize(new Dimension(100, 100));
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.isControlDown()) {
            if (e.getKeyCode() == KeyEvent.VK_E) {
                mapVisualizer.toggleShowAllObjects();
            }
        }
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        if (e.isControlDown()) {
            currentMap.validateLocation(currentMap.getCellLocation(e.getPoint()));
        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (currentMap != null) {
            currentMap.drawMap(graphics);
        }
    }

    @Override
    public boolean itemEvent(Item item) {
        System.out.println("Item " + item.getLocation() + " " + item.getType());
        return true;
    }
}