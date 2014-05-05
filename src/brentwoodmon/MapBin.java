/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import image.ResourceTools;
import java.awt.Dimension;
import java.awt.Point;
import map.Map;
import map.ObstacleType;

/**
 *
 * @author kimberlygilson
 */
public class MapBin {

    public static Map getCampusBottomMap() {
        Map bcampus = new Map(ResourceTools.loadImageFromResource("resources/campus_bottom.bmp"), new Dimension(16, 16), new Dimension(20, 50));

//        Map.addObstacle(bcampus, new Point(10, 10), ObstacleType.WATER);
//        Map.addObstacleRange(campus, new Point(0, 0), new Point(2, 5), ObstacleType.BARRIER);
        //THE SHORELINE
        Map.addObstacleRange(bcampus, new Point(1, 29), new Point(12, 29), ObstacleType.WATER);
//        Map.addObstacleRange(bcampus, new Point(0, 0), new Point(0, 29), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(13, 25), new Point(13, 29), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(13, 25), new Point(15, 25), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(15, 26), new Point(16, 26), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(16, 27), new Point(16, 28), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(17, 28), new Point(17, 29), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(18, 29), new Point(22, 29), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(22, 28), new Point(25, 28), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(26, 27), new Point(27, 27), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(25, 28), new Point(25, 32), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(26, 32), new Point(28, 32), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(28, 31), new Point(32, 31), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(33, 28), new Point(33, 32), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(34, 27), new Point(34, 31), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(33, 33), new Point(40, 33), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(40, 26), new Point(40, 33), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(39, 25), new Point(39, 26), ObstacleType.WATER);
        Map.addObstacle(bcampus, new Point(38, 26), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(41, 30), new Point(41, 31), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(41, 31), new Point(48, 31), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(49, 31), new Point(49, 32), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(50, 32), new Point(52, 32), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(52, 33), new Point(54, 33), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(54, 34), new Point(57, 34), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(57, 33), new Point(60, 33), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(60, 32), new Point(64, 32), ObstacleType.WATER);
        //cliffs and such nono jumpy zones
        Map.addObstacleRange(bcampus, new Point(11, 0), new Point(11, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(11, 9), new Point(14, 9), ObstacleType.BARRIER);
        
        //it's a bush
        Map.addObstacleRange(bcampus, new Point(14, 0), new Point(14, 9), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(14, 2), new Point(32, 2), ObstacleType.BUSH);


        
        
        return bcampus;
    }

    static Map getCampusUpperMap() {
        Map ucampus = new Map(ResourceTools.loadImageFromResource("resources/campus_top.bmp"), new Dimension(16, 16), new Dimension(44, 48));

        Map.addObstacle(ucampus, new Point(10, 10), ObstacleType.WATER);
//        Map.addObstacleRange(map, new Point(0, 0), new Point(2, 5), ObstacleType.BARRIER);
//        Map.addObstacleRange(ucampus, new Point(1, 29), new Point(12, 29), ObstacleType.WATER);

        return ucampus;
    }
        static Map getDownSRossMap() {
        Map dross = new Map(ResourceTools.loadImageFromResource("resources/ross_downstair.jpg"), new Dimension(16, 16), new Dimension(44, 48));

            return dross;
        }
    
}
