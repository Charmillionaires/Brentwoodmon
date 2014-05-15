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
public class Snorlax extends AnimatedActor {

    public Snorlax(Point position, Velocity velocity) {
        super(position, velocity);
    }
    private static final int SPRITES_HEIGHTS =27;
    private static final int SPRITES_WIDTH = 28;
    private static final int SPRITES_WIDTHH = 23;

    @Override
    public void initializeImages() {
        
        int dD = 991;


        BufferedImage image = (BufferedImage) ResourceTools.loadImageFromResource("resources/sprites_left_alpha.PNG");

        String stand = "Stand";
        standImage.add(stand);

        getImageManager().addImage(stand, image.getSubimage(78, dD, SPRITES_WIDTH, SPRITES_HEIGHTS));

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
//13,45,78,110,145,176,207,239,41 14,716
        getImageManager().addImage(frontWalk001, image.getSubimage(78, dD, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(frontWalk002, image.getSubimage(110, dD, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getImageManager().addImage(backWalk001, image.getSubimage(13, dD, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(backWalk002, image.getSubimage(45, dD, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getImageManager().addImage(rightWalk001, image.getSubimage(207, dD, SPRITES_WIDTHH, SPRITES_HEIGHTS));
        getImageManager().addImage(rightWalk002, image.getSubimage(239, dD, SPRITES_WIDTHH, SPRITES_HEIGHTS));

        getImageManager().addImage(leftWalk001, image.getSubimage(145, dD, SPRITES_WIDTHH, SPRITES_HEIGHTS));
        getImageManager().addImage(leftWalk002, image.getSubimage(176, dD, SPRITES_WIDTHH, SPRITES_HEIGHTS));

        getAnimator().setImageNames(frontWalkImages);
    }
}
