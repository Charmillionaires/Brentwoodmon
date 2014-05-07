/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import environment.Velocity;
import image.ResourceTools;
import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 *
 * @author David S
 */
public class Shaq extends AnimatedActor {

    public Shaq(Point position, Velocity velocity) {
        super(position, velocity);
    }
    
    private static final int SPRITES_HEIGHTS = 29;
    private static final int SPRITES_WIDTH = 22;
    
    @Override
    public void initializeImages() {
        int hisSide = 272;
        int herSide = 226;
        int thatSide = 249;
        int blackSide = 293;
        
        BufferedImage image = (BufferedImage) ResourceTools.loadImageFromResource("resources/ddd_transparent.png");

        String stand = "Stand";
        standImage.add(stand);

        getImageManager().addImage(stand, image.getSubimage(hisSide, 278, SPRITES_WIDTH, SPRITES_HEIGHTS));

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

        getImageManager().addImage(frontWalk001, image.getSubimage(hisSide, 278, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(frontWalk002, image.getSubimage(hisSide, 310, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getImageManager().addImage(backWalk001, image.getSubimage(herSide, 278, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(backWalk002, image.getSubimage(herSide, 310, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getImageManager().addImage(rightWalk001, image.getSubimage(thatSide, 278, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(rightWalk002, image.getSubimage(thatSide, 310, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getImageManager().addImage(leftWalk001, image.getSubimage(blackSide, 278, SPRITES_WIDTH, SPRITES_HEIGHTS));
        getImageManager().addImage(leftWalk002, image.getSubimage(blackSide, 310, SPRITES_WIDTH, SPRITES_HEIGHTS));

        getAnimator().setImageNames(frontWalkImages);     
 }
    
}
