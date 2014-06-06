/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import environment.Velocity;
import images.ResourceTools;
import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 *
 * @author David S
 */
public class Bull extends AnimatedActor {

    public Bull(Point position, Velocity velocity) {
        super(position, velocity);
    }
    
    private static final int SPRITES_HEIGHTS = 29;
    private static final int SPRITES_WIDTH = 22;
    
    @Override
    public void initializeImages() {
        
        
        BufferedImage image = (BufferedImage) ResourceTools.loadImageFromResource("resources/pokemon.png");

        String stand01 = "Stand01";
        
        standImage.add(stand01);
        
        getImageManager().addImage(stand01, image.getSubimage(55, 40, SPRITES_WIDTH, SPRITES_HEIGHTS));
        
        String frontWalk001 = "FrontWalk001";
        String frontWalk002 = "FrontWalk002";

        frontWalkImages.add(frontWalk001);
        frontWalkImages.add(frontWalk002);

        String backWalk001 = "BackWalk001";
        String backWalk002 = "BackWalk002";

        backWalkImages.add(backWalk001);
        backWalkImages.add(backWalk002);

        String rightWalk001 = "RightWalk001";
        String rightWalk002 = "RightWalk002";

        rightWalkImages.add(rightWalk001);
        rightWalkImages.add(rightWalk002);

        String leftWalk001 = "LeftWalk001";
        String leftWalk002 = "LeftWalk002";

        leftWalkImages.add(leftWalk001);
        leftWalkImages.add(leftWalk002);

        getImageManager().addImage(frontWalk001, image.getSubimage(78, 39, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(frontWalk002, image.getSubimage(100, 39, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getImageManager().addImage(backWalk001, image.getSubimage(76, 6, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(backWalk002, image.getSubimage(98, 6, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getImageManager().addImage(rightWalk001, image.getSubimage(78, 105, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(rightWalk002, image.getSubimage(100, 105, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getImageManager().addImage(leftWalk001, image.getSubimage(78, 75, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(leftWalk002, image.getSubimage(100, 75, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getAnimator().setImageNames(frontWalkImages);     
 }
    
}

