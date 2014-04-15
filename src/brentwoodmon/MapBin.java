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
    public static Map getCampusBottomMap(){
        Map bcampus = new Map(ResourceTools.loadImageFromResource("resources/campus_bottom.bmp"), new Dimension(16, 16), new Dimension(20, 50));
        
//        Map.addObstacle(campus, new Point(10, 10), ObstacleType.WATER);
//        Map.addObstacleRange(campus, new Point(0, 0), new Point(2, 5), ObstacleType.BARRIER);
//        Map.addObstacleRange(campus, new Point(7, 18), new Point(16, 18), ObstacleType.WATER);
        
        return bcampus;
    }

    static Map getCampusUpperMap() {
        Map ucampus = new Map(ResourceTools.loadImageFromResource("resources/campus_top.bmp"), new Dimension(16, 16), new Dimension(44, 48));
        
//        Map.addObstacle(map, new Point(10, 10), ObstacleType.WATER);
//        Map.addObstacleRange(map, new Point(0, 0), new Point(2, 5), ObstacleType.BARRIER);
//        Map.addObstacleRange(map, new Point(7, 18), new Point(16, 18), ObstacleType.WATER);
//        
        return ucampus;
    }
    
}
