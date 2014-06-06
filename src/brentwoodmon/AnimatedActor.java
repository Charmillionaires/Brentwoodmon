/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import environment.Actor;
import environment.Velocity;
import images.Animator;
import images.ImageManager;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author David S
 */
public abstract class AnimatedActor extends Actor {

    {
        setMyProperty(new CharacterProperty());

        standImage = new ArrayList<>();
        frontWalkImages = new ArrayList<>();
        backWalkImages = new ArrayList<>();
        rightWalkImages = new ArrayList<>();
        leftWalkImages = new ArrayList<>();

        setImageManager(new ImageManager());
        ArrayList<String> imageNames = new ArrayList<String>();

        setAnimator(new Animator(getImageManager(), imageNames, 250));
    }

    public AnimatedActor(Point position, Velocity velocity) {
        super(position, velocity);
        initializeImages();
    }
    
    private MoveValidatorIntf moveValidator;
    
   /**
     * @return the moveValidator
     */
    public MoveValidatorIntf getMoveValidator() {
        return moveValidator;
    }

    /**
     * @param moveValidator the moveValidator to set
     */
    public void setMoveValidator(MoveValidatorIntf moveValidator) {
        this.moveValidator = moveValidator;
    }
    
    
    @Override
    public void move() {
        Point proposedLocation = new Point(this.getPosition());
        proposedLocation.x += getVelocity().x;
        proposedLocation.y += getVelocity().y;
        
        if (moveValidator != null) {
            if (moveValidator.validateMove(getPosition(), proposedLocation)){
                super.move();
            } else {
                stop();
                System.out.println("failed move validation");
            }
        }
        
//        super.move();
//        this.position.x += this.velocity.x;
//        this.position.y += this.velocity.y;
    }
    
    public abstract void initializeImages();

    private CharacterProperty myProperty;
    private ImageManager imageManager;
    private Animator animator;
    ArrayList<String> frontWalkImages, backWalkImages, leftWalkImages, rightWalkImages, standImage;
    private State state;

    /**
     * @return the image
     */
    @Override
    public BufferedImage getImage() {
        if (getAnimator() == null) {
            return super.getImage();
        } else {
            return (BufferedImage) getAnimator().getCurrentImage();
        }
    }

    /**
     * @return the imageManager
     */
    public ImageManager getImageManager() {
        return imageManager;
    }

    /**
     * @param imageManager the imageManager to set
     */
    public void setImageManager(ImageManager imageManager) {
        this.imageManager = imageManager;
    }

    /**
     * @return the animator
     */
    public Animator getAnimator() {
        return animator;
    }

    /**
     * @param animator the animator to set
     */
    public void setAnimator(Animator animator) {
        this.animator = animator;
    }

    /**
     * @return the state
     */
    public State getState() {
        return state;
    }

    int speed = 2;
    
    /**
     * @param state the state to set
     */
    public void setState(State state) {
        this.state = state;

        if (this.state == State.BACK_WALK) {
            animator.setImageNames(backWalkImages);
            
            getVelocity().x = 0;
            getVelocity().y = -speed;
        } else if (this.state == State.FRONT_WALK) {
            animator.setImageNames(frontWalkImages);
            
            getVelocity().x = 0;
            getVelocity().y = speed;
        } else if (this.state == State.RIGHT_WALK) {
            animator.setImageNames(rightWalkImages);
            
            getVelocity().x = speed;
            getVelocity().y = 0;
        } else if (this.state == State.LEFT_WALK) {
            animator.setImageNames(leftWalkImages);

            getVelocity().x = -speed;
            getVelocity().y = 0;
        } else if (this.state == State.STOP) {
            animator.setImageNames(standImage);
            this.stop();
        }
    }

    /**
     * @return the myProperty
     */
    public CharacterProperty getMyProperty() {
        return myProperty;
    }

    /**
     * @param myProperty the myProperty to set
     */
    public void setMyProperty(CharacterProperty myProperty) {
        this.myProperty = myProperty;
    }

}
