/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import audio.AudioPlayer;
import environment.Environment;
import environment.Velocity;
import images.ResourceTools;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;
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
public class BrentwoodEnvironment extends Environment implements PortalEventHandlerIntf, ObstacleEventHandlerIntf, ItemEventHandlerIntf, ItemManagerResponseIntf, CombatResponseIntf, PlayerCustomizationIntf {

//<editor-fold defaultstate="collapsed" desc="Properties">
    private Map currentMap;
    private Map bcampus;
    private Map ucampus;
    private Map dross;
    private MapVisualizerDefault mapVisualizer;
    
    private Hero hero;
    private Shaq shaq;
    private Snorlax snorlax;
    
    private CharacterProperty myProperty;
    private String myName;
//    private ArrayList<String> dialog;
    //defalt my Image
    private Image myImage = ResourceTools.loadImageFromResource("resources/snorlax_icon.jpg");
    private Image snorlax_icon = ResourceTools.loadImageFromResource("resources/snorlax_icon.jpg");
    private Image shaq_icon = ResourceTools.loadImageFromResource("resources/shaq_icon.jpg");
    private Image hero_icon = ResourceTools.loadImageFromResource("resources/hero_icon.jpg");
    private Image charmander_icon = ResourceTools.loadImageFromResource("resources/charmander_icon.jpg");
    
    /**
     * @return the bcampus
     */
    public Map getBcampus() {
        return bcampus;
    }
    
    /**
     * @param bcampus the bcampus to set
     */
    public void setBcampus(Map bcampus) {
        this.bcampus = bcampus;
        configureMap(this.bcampus);
    }
    
    /**
     * @return the ucampus
     */
    public Map getUcampus() {
        return ucampus;
    }
    
    /**
     * @param ucampus the ucampus to set
     */
    public void setUcampus(Map ucampus) {
        this.ucampus = ucampus;
        configureMap(this.ucampus);
    }
    
    /**
     * @return the dross
     */
    public Map getDross() {
        return dross;
    }
    
    /**
     * @param dross the dross to set
     */
    public void setDross(Map dross) {
        this.dross = dross;
        configureMap(this.dross);
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
//</editor-fold>
    
    {
        
        this.myProperty = new CharacterProperty();
        
        mapVisualizer = new MapVisualizerDefault(true, false);

        setBcampus(MapBin.getCampusBottomMap());
        setUcampus(MapBin.getCampusUpperMap());
        setDross(MapBin.getDownSRossMap());

        Map.addPortal(getBcampus(), new Point(30, 19), getDross(), new Point(9, 9));
        
        Map.addPortal(getDross(), new Point(9, 9), getBcampus(), new Point(30, 19));
        Map.addPortal(getDross(), new Point(5, 9), getBcampus(), new Point(30, 19));
        
        Map.addPortal(getBcampus(), new Point(37, 0), getUcampus(), new Point(25, 34));
        Map.addPortal(getBcampus(), new Point(36, 0), getUcampus(), new Point(24, 34));
        Map.addPortal(getUcampus(), new Point(24, 34), getBcampus(), new Point(36, 0));
        Map.addPortal(getUcampus(), new Point(25, 34), getBcampus(), new Point(37, 0));

        setCurrentMap(getBcampus());
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
    public void initializeEnvironment() {
        loadCharacters();  
    }

    private void loadCharacters() {
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
        } else if (e.getKeyCode() == KeyEvent.VK_1) {
            showPlayerCustomization();  
        }
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

//<editor-fold defaultstate="collapsed" desc="Dialogs">
    private void showCombat() {
        JFrame frmCombat = new JFrame("Combat");
        
        Combat myCombat = new Combat(myName,myImage, charmander_icon, myProperty.getMyHp(),myProperty.getMyDamage(),this);
        
        frmCombat.add(myCombat);
        frmCombat.setAlwaysOnTop(true);
        frmCombat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCombat.setSize(new Dimension(600,400));
        frmCombat.setVisible(true);
    }
    
    private void showDialog() {
        JFrame frmDialog = new JFrame("Dialog");

        ArrayList<String> conversation = new ArrayList<>();
        conversation.add("Welcome to Brentwood College School! Start your advanture and become the best student.");
        conversation.add("OK. Where should I start?");
        conversation.add("Go find your house parent in the common room.");
        
//        Dialog myDialog = new Dialog(myName,"Mr.Garvey" ,myImage,"Welcome to Brentwood College School! Start your advanture and become the best student.","OK. Where should I start?","Go find your house parent in the common room.");
        Dialog myDialog = new Dialog(myName,"Mr.Garvey" ,myImage,conversation);
        
        frmDialog.add(myDialog);
        frmDialog.setAlwaysOnTop(true);
        frmDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmDialog.setSize(new Dimension(600,425));    
        frmDialog.setVisible(true);
    }
    
    private void showItemManager() {
        JFrame frmItemManager = new JFrame("Item Manager");
        
        ContainerItemList containerItemList = new ContainerItemList();
        containerItemList.getItems().add(new ContainerItem ("Pencil","HB pencil, good for scantron."));
        ContainerItemManager itemManager = new ContainerItemManager("Treasure Box", containerItemList,this);
        
        frmItemManager.add(itemManager);
        frmItemManager.setAlwaysOnTop(true);
        frmItemManager.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmItemManager.setSize(new Dimension(400,500));
        
        frmItemManager.setVisible(true);
    }
    
    private void showPlayerCustomization() {
        JFrame frmPlayerCustomization = new JFrame("PlayerCustomization");
        
        PlayerCustomization myPlayerCustomization = new PlayerCustomization(snorlax_icon,shaq_icon,hero_icon,this);
        
        frmPlayerCustomization.add(myPlayerCustomization);
        frmPlayerCustomization.setAlwaysOnTop(true);
        frmPlayerCustomization.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmPlayerCustomization.setSize(new Dimension(600,400));
        frmPlayerCustomization.setVisible(true);
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="ItemEventHandlerIntf Interface Methods">
    @Override
    public boolean itemEvent(Item item) {
        //treasure box
        if ("TB".equals(item.getType())) {
            showItemManager();
        } else if ("Combat".equals(item.getType())) {
            showCombat();
        } else if ("Dialog".equals(item.getType())) {
            showDialog();
        }
        
        System.out.println("Item " + item.getLocation() + " " + item.getType());
        //return true;
        return false;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="ItemManagerResponseIntf Inteface Methods">
    @Override
    public void handleItemManagerResponse(ContainerItemList itemList) {
        System.out.println("IM Response");
        for (ContainerItem item : itemList.getItems()) {
            System.out.println(item.getDisplay());
        }
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="PortalEventHandlerIntf Interface Methods">
    @Override
    public boolean portalEvent(Portal portal) {
        setCurrentMap(portal.getDestinationMap());
//        portal.getDestinationMap().ge
        return true;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="ObstacleEventHandlerIntf Interface Methods">
    @Override
    public boolean obstacleEvent(Obstacle obstacle) {
        System.out.println("Obstacle " + obstacle.getLocation() + " " + obstacle.getType());
        AudioPlayer.play("/resources/water.wav");
        return false;
    }
//</editor-fold>

    @Override
    public void handleCombatResponse(boolean combatResult) {
        System.out.println("myHp = " +  myProperty.getMyHp());
        System.out.println("myDamge = " +  myProperty.getMyDamage());
        System.out.println("myLevel = " +  myProperty.getMyLevel());
        System.out.println("myExp = " +  myProperty.getMyExp());
        
        System.out.println("Combat Result " + combatResult);
        if (combatResult == true) {
            this.myProperty.addToMyExp(2);
            showItemManager();
        }
        System.out.println("exp = " + myProperty.getMyExp());
    }

    @Override
    public void handlePlayerCustomizationResponse(String myName, Image myImage) {
        System.out.println("My name: " + myName);
        this.myName = myName;
        this.myImage = myImage; 
    }

    



}
