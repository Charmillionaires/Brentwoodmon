/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import audio.AudioPlayer;
import environment.Environment;
import environment.Velocity;
import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
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

    private Hero hero;
    private Shaq shaq;
    private Snorlax snorlax;

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

        setCurrentMap(bcampus);
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

//<editor-fold defaultstate="collapsed" desc="PortalEventHandlerIntf">
    @Override
    public boolean portalEvent(Portal portal) {
        setCurrentMap(portal.getDestinationMap());
//        portal.getDestinationMap().ge
        return true;
    }
//</editor-fold>

    @Override
    public boolean obstacleEvent(Obstacle obstacle) {
        System.out.println("Obstacle " + obstacle.getLocation() + " " + obstacle.getType());
        AudioPlayer.play("/resources/water.wav");
        return false;
    }

    @Override
    public void initializeEnvironment() {
        loadCharacters();
    }

    private void loadCharacters() {
//        BufferedImage image= (BufferedImage) ResourceTools.loadImageFromResource("resources/kanto_shinies.png");
        hero = new Hero(new Point(700, 50), new Velocity(0, 0));
        getActors().add(hero);

        shaq = new Shaq(new Point(700, 100), new Velocity(0, 0));
        getActors().add(shaq);

        snorlax = new Snorlax(new Point(700, 150), new Velocity(0, 0));
        getActors().add(snorlax);
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

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            hero.setState(State.STOP);
            snorlax.setState(State.STOP);
            shaq.setState(State.STOP);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.setState(State.FRONT_WALK);
            snorlax.setState(State.FRONT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            hero.setState(State.BACK_WALK);
            snorlax.setState(State.BACK_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.setState(State.RIGHT_WALK);
            snorlax.setState(State.RIGHT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.setState(State.LEFT_WALK);
            snorlax.setState(State.LEFT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            hero.setState(State.STAND);
            snorlax.setState(State.STAND);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            shaq.setState(State.FRONT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            shaq.setState(State.BACK_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            shaq.setState(State.RIGHT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            shaq.setState(State.LEFT_WALK);
        }
        /*else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            shaq.setState(State.STAND);
        }*/
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        if (e.isControlDown()) {
            getCurrentMap().validateLocation(getCurrentMap().getCellLocation(e.getPoint()));
        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (getCurrentMap() != null) {
            getCurrentMap().drawMap(graphics);
        }
    }

    @Override
    public boolean itemEvent(Item item) {
        System.out.println("Item " + item.getLocation() + " " + item.getType());
        return true;
    }

    /**
     * @return the currentMap
     */
    public Map getCurrentMap() {
        return currentMap;
    }

    /**
     * @param map the Map to set
     */
    public void setCurrentMap(Map map) {
        currentMap = map;
    }

}
