/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import environment.Velocity;
import image.Animator;
import image.ImageManager;
import image.ResourceTools;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author David S
 */
public class Hero extends AnimatedActor {

    public Hero(Point position, Velocity velocity) {
        super(position, velocity);
    }

    private static final int SPRITES_HEIGHTS = 29;
    private static final int SPRITES_WIDTH = 22;
    
    @Override
    public void initializeImages() {
        int leftSide = 14;
        int thisSide = 39;
        int disSide = 66;
        int datSide = 92;
        
        BufferedImage image = (BufferedImage) ResourceTools.loadImageFromResource("resources/ddd_transparent.png");

        String stand = "Stand";
        standImage.add(stand);

        getImageManager().addImage(stand, image.getSubimage(leftSide, 412, SPRITES_WIDTH, SPRITES_HEIGHTS));

        String frontWalk01 = "FrontWalk01";
        String frontWalk02 = "FrontWalk02";

        frontWalkImages.add(frontWalk01);
        frontWalkImages.add(frontWalk02);

        String backWalk01 = "BackWalk01";
        String backWalk02 = "BackWalk02";

        backWalkImages.add(backWalk01);
        backWalkImages.add(backWalk02);

        String rightWalk01 = "RightWalk01";
        String rightWalk02 = "RightWalk02";

        rightWalkImages.add(rightWalk01);
        rightWalkImages.add(rightWalk02);

        String leftWalk01 = "LeftWalk01";
        String leftWalk02 = "LeftWalk02";

        leftWalkImages.add(leftWalk01);
        leftWalkImages.add(leftWalk02);

        getImageManager().addImage(frontWalk01, image.getSubimage(leftSide, 412, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(frontWalk02, image.getSubimage(leftSide, 443, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getImageManager().addImage(backWalk01, image.getSubimage(thisSide, 412, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(backWalk02, image.getSubimage(thisSide, 443, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getImageManager().addImage(rightWalk01, image.getSubimage(disSide, 412, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(rightWalk02, image.getSubimage(disSide, 443, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getImageManager().addImage(leftWalk01, image.getSubimage(datSide, 412, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(leftWalk02, image.getSubimage(datSide, 443, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getAnimator().setImageNames(frontWalkImages);     
    }
    
}
