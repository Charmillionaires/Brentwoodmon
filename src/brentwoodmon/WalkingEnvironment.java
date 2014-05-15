/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

//import static brentwoodmon.State.STAND;
import environment.Environment;
import environment.Velocity;
import images.Animator;
import images.AnimatorEventListenerIntf;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author David S
 */
public class WalkingEnvironment extends Environment
        implements AnimatorEventListenerIntf, MouseMotionListener {

//    private static final int SPRITES_HEIGHTS = 29;
//    private static final int SPRITES_WIDTH = 22;
    ArrayList<String> frontWalkImages, backWalkImages, leftWalkImages, rightWalkImages, standImage;
    ArrayList<String> frontImages, backImages, leftImages, rightImages, stoodImages;
    BufferedImage image;
      
    private Hero hero;
    private Shaq shaq;
    private Snorlax snorlax;

    @Override
    public void initializeEnvironment() {
        this.addMouseMotionListener(this);
        this.setBackground(Color.GRAY);
//        image = (BufferedImage) ResourceTools.loadImageFromResource("resources/ddd_transparent.png");
           image= (BufferedImage) ResourceTools.loadImageFromResource("resources/kanto shinies.PNG");
        hero = new Hero(new Point(700, 50), new Velocity(0, 0));
        getActors().add(hero);
        
        shaq = new Shaq(new Point(700, 100), new Velocity(0,0));
        getActors().add(shaq);
        
        snorlax = new Snorlax(new Point(700, 150), new Velocity(0,0));
        getActors().add(snorlax);
    }
    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
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
        }else if (e.getKeyCode() == KeyEvent.VK_S) {
            shaq.setState(State.FRONT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            shaq.setState(State.BACK_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            shaq.setState(State.RIGHT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            shaq.setState(State.LEFT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            shaq.setState(State.STAND);
        }
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
//        if (image != null) {
//            graphics.drawImage(image, 0, -300, this);
//        }

    }

    @Override
    public void imageChange(Animator animator) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse position = " + e.getPoint().x + ", " + e.getPoint().y);
    }

}
