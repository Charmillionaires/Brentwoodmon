/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import images.ResourceTools;
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
        Map bcampus = new Map(ResourceTools.loadImageFromResource("resources/campus_bottom.bmp"), new Dimension(16, 16), new Dimension(40, 70));

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
        Map.addObstacleRange(bcampus, new Point(22, 10), new Point(23, 10), ObstacleType.WATER);
        Map.addObstacleRange(bcampus, new Point(22, 11), new Point(23, 11), ObstacleType.WATER);

        //cliffs and such nono jumpy zones
        Map.addObstacleRange(bcampus, new Point(1, 0), new Point(1, 24), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(11, 0), new Point(11, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(11, 9), new Point(14, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(39, 0), new Point(39, 6), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(34, 0), new Point(34, 5), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(15, 6), new Point(33, 6), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(24, 7), new Point(33, 7), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(26, 8), new Point(32, 8), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(1, 24), new Point(12, 24), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(4, 20), new Point(4, 24), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(10, 21), new Point(10, 24), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(4, 21), new Point(6, 21), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(9, 21), new Point(10, 21), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(20, 15), new Point(23, 15), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(23, 15), new Point(23, 17), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(25, 15), new Point(30, 15), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(25, 15), new Point(25, 17), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(39, 6), new Point(42, 6), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(39, 7), new Point(42, 7), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(38, 8), new Point(38, 12), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(43, 8), new Point(43, 11), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(39, 12), new Point(41, 12), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(50, 31), new Point(59, 31), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(47, 9), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(56, 5), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(42, 5), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(15, 7), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(33, 17), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(36, 18), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(40, 18), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(42, 18), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(14, 23), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(34, 32), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(24, 22), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(26, 13), ObstacleType.BARRIER);
        Map.addObstacle(bcampus, new Point(54, 15), ObstacleType.BARRIER);


        Map.addObstacleRange(bcampus, new Point(48, 6), new Point(48, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(49, 5), new Point(53, 5), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(54, 6), new Point(54, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(50, 9), new Point(54, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(57, 1), new Point(57, 5), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(57, 5), new Point(60, 5), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(62, 5), new Point(64, 5), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(64, 1), new Point(64, 5), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(65, 0), new Point(65, 35), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(62, 22), new Point(64, 22), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(60, 23), new Point(62, 23), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(59, 27), new Point(59, 30), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(60, 25), new Point(60, 27), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(43, 28), new Point(56, 28), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(43, 25), new Point(46, 25), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(53, 25), new Point(56, 25), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(43, 25), new Point(43, 28), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(56, 25), new Point(56, 28), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(17, 19), new Point(23, 19), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(17, 22), new Point(20, 22), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(22, 22), new Point(23, 22), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(17, 19), new Point(17, 22), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(23, 19), new Point(23, 22), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(14, 10), new Point(19, 10), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(11, 11), new Point(19, 11), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(11, 11), new Point(11, 15), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(16, 15), new Point(19, 15), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(11, 15), new Point(14, 15), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(11, 15), new Point(14, 15), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(11, 14), new Point(19, 14), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(19, 13), new Point(19, 14), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(48, 26), new Point(53, 26), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(54, 14), new Point(63, 14), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(54, 13), new Point(56, 13), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(57, 16), new Point(63, 16), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(56, 15), new Point(63, 15), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(26, 22), new Point(33, 22), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(26, 19), new Point(29, 19), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(31, 19), new Point(33, 19), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(26, 19), new Point(26, 22), ObstacleType.BARRIER);
        Map.addObstacleRange(bcampus, new Point(33, 19), new Point(33, 22), ObstacleType.BARRIER);


        //it's a bush
        Map.addObstacleRange(bcampus, new Point(14, 0), new Point(14, 9), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(14, 2), new Point(32, 2), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(33, 0), new Point(33, 2), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(27, 9), new Point(35, 9), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(27, 11), new Point(35, 11), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(27, 12), new Point(35, 12), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(27, 28), new Point(27, 31), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(38, 27), new Point(38, 32), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(20, 17), new Point(22, 17), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(20, 15), new Point(20, 17), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(26, 17), new Point(30, 17), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(30, 16), new Point(30, 17), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(33, 15), new Point(42, 15), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(33, 16), new Point(42, 16), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(44, 8), new Point(44, 11), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(45, 8), new Point(45, 11), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(46, 6), new Point(46, 7), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(47, 6), new Point(47, 7), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(51, 11), new Point(56, 11), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(51, 12), new Point(56, 12), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(47, 18), new Point(47, 19), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(51, 17), new Point(52, 18), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(51, 17), new Point(52, 18), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(52, 23), new Point(60, 23), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(57, 24), new Point(60, 24), ObstacleType.BUSH);
        Map.addObstacleRange(bcampus, new Point(63, 21), new Point(64, 21), ObstacleType.BUSH);



        Map.addObstacle(bcampus, new Point(56, 8), ObstacleType.BUSH);
        Map.addObstacle(bcampus, new Point(57, 9), ObstacleType.BUSH);
        Map.addObstacle(bcampus, new Point(64, 8), ObstacleType.BUSH);
        Map.addObstacle(bcampus, new Point(62, 12), ObstacleType.BUSH);

        //there might be another obstacle


        //treasure box location
        Map.addItem(bcampus, new Point(10, 10), "TB");
        Map.addItem(bcampus, new Point(49, 15), "TB");
        Map.addItem(bcampus, new Point(47, 4), "TB");

        //combat location
        Map.addItem(bcampus, new Point(5, 5), "Combat");
        Map.addItem(bcampus, new Point(8, 5), "Combat");
        Map.addItem(bcampus, new Point(45,13), "Combat");
        Map.addItem(bcampus, new Point(43,3), "Combat");
        Map.addItem(bcampus, new Point(50,2), "Combat");
        Map.addItem(bcampus, new Point(53,18), "Combat");
        Map.addItem(bcampus, new Point(22,25), "Combat");     
        
        //dialog location
//        Map.addItem(bcampus, new Point(8, 8), "Dialog");
        
        

        return bcampus;
    }

    static Map getCampusUpperMap() {
        Map ucampus = new Map(ResourceTools.loadImageFromResource("resources/campus_top.bmp"), new Dimension(16, 16), new Dimension(44, 70));
//water
//        Map.addObstacle(ucampus, new Point(10, 10), ObstacleType.WATER);
//barrier
        Map.addObstacle(ucampus, new Point(4, 32), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(22, 9), new Point(22, 33), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(27, 9), new Point(27, 33), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(7, 9), new Point(18, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(7, 32), new Point(15, 32), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(17, 32), new Point(18, 32), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(7, 9), new Point(7, 32), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(18, 9), new Point(18, 32), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(13, 11), new Point(13, 16), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(13, 18), new Point(13, 23), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(13, 25), new Point(13, 30), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(19, 5), new Point(22, 8), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(28, 5), new Point(30, 8), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(23, 7), new Point(26, 7), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(31, 29), new Point(37, 33), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(39, 29), new Point(44, 33), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(37, 28), new Point(41, 28), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(38, 29), new Point(38, 32), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(45, 29), new Point(47, 32), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(46, 33), new Point(48, 33), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(56, 28), new Point(61, 32), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(55, 33), new Point(57, 33), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(60, 33), new Point(61, 33), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(57, 27), new Point(60, 27), ObstacleType.BARRIER);
        Map.addObstacleRange(ucampus, new Point(58, 26), new Point(59, 26), ObstacleType.BARRIER);

        //bush
        Map.addObstacleRange(ucampus, new Point(20, 9), new Point(20, 33), ObstacleType.BUSH);
        Map.addObstacleRange(ucampus, new Point(21, 9), new Point(21, 33), ObstacleType.BUSH);
        Map.addObstacleRange(ucampus, new Point(28, 9), new Point(28, 33), ObstacleType.BUSH);
        Map.addObstacleRange(ucampus, new Point(29, 9), new Point(29, 33), ObstacleType.BUSH);
        Map.addObstacleRange(ucampus, new Point(0, 6), new Point(18, 7), ObstacleType.BUSH);
        Map.addObstacleRange(ucampus, new Point(31, 6), new Point(64, 7), ObstacleType.BUSH);

        return ucampus;
    }

    static Map getDownSRossMap() {
        Map dross = new Map(ResourceTools.loadImageFromResource("resources/ross_downstair.jpg"), new Dimension(16, 16), new Dimension(44, 48));
<<<<<<< HEAD
=======

>>>>>>> kimmi-much-dos-obstacles
        Map.addObstacleRange(dross, new Point(0, 0), new Point(14, 2), ObstacleType.BARRIER);
        Map.addObstacleRange(dross, new Point(0, 3), new Point(4, 3), ObstacleType.BARRIER);
        Map.addObstacleRange(dross, new Point(6, 3), new Point(8, 3), ObstacleType.BARRIER);
        Map.addObstacleRange(dross, new Point(10, 3), new Point(13, 3), ObstacleType.BARRIER);
        Map.addObstacleRange(dross, new Point(0, 9), new Point(4, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(dross, new Point(6, 9), new Point(8, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(dross, new Point(10, 9), new Point(13, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(dross, new Point(0, 5), new Point(0, 6), ObstacleType.BARRIER);
        Map.addObstacle(dross, new Point(3, 8), ObstacleType.BARRIER);
        Map.addObstacle(dross, new Point(13, 8), ObstacleType.BARRIER);

<<<<<<< HEAD
=======

>>>>>>> kimmi-much-dos-obstacles
        return dross;
    }

    static Map getMainSRossMap() {
        Map mross = new Map(ResourceTools.loadImageFromResource("resources/ross_mainfloor.bmp"), new Dimension(16, 16), new Dimension(44, 48));
        Map.addObstacleRange(mross, new Point(0, 0), new Point(14, 2), ObstacleType.BARRIER);
        Map.addObstacleRange(mross, new Point(0, 3), new Point(4, 3), ObstacleType.BARRIER);
        Map.addObstacleRange(mross, new Point(6, 3), new Point(8, 3), ObstacleType.BARRIER);
        Map.addObstacleRange(mross, new Point(10, 3), new Point(13, 3), ObstacleType.BARRIER);
        Map.addObstacleRange(mross, new Point(0, 8), new Point(4, 8), ObstacleType.BARRIER);
        Map.addObstacleRange(mross, new Point(6, 8), new Point(8, 8), ObstacleType.BARRIER);
        Map.addObstacleRange(mross, new Point(10, 8), new Point(13, 8), ObstacleType.BARRIER);
        Map.addObstacleRange(mross, new Point(12, 5), new Point(13, 6), ObstacleType.BARRIER);
        Map.addObstacle(mross, new Point(0, 7), ObstacleType.BARRIER);
        Map.addObstacle(mross, new Point(0, 4), ObstacleType.BARRIER);

        return mross;
    }

    static Map getUpperSRossMap() {
        Map uross = new Map(ResourceTools.loadImageFromResource("resources/ross_upstair.jpg"), new Dimension(16, 16), new Dimension(44, 48));
        Map.addObstacleRange(uross, new Point(0, 0), new Point(14, 2), ObstacleType.BARRIER);
        Map.addObstacle(uross, new Point(0, 6), ObstacleType.BARRIER);
        Map.addObstacleRange(uross, new Point(0, 3), new Point(4, 3), ObstacleType.BARRIER);
        Map.addObstacleRange(uross, new Point(6, 3), new Point(8, 3), ObstacleType.BARRIER);
        Map.addObstacleRange(uross, new Point(10, 3), new Point(13, 3), ObstacleType.BARRIER);
        Map.addObstacleRange(uross, new Point(0, 9), new Point(4, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(uross, new Point(6, 9), new Point(8, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(uross, new Point(10, 9), new Point(13, 9), ObstacleType.BARRIER);
        Map.addObstacleRange(uross, new Point(0, 5), new Point(0, 6), ObstacleType.BARRIER);
        Map.addObstacle(uross, new Point(3, 8), ObstacleType.BARRIER);
        Map.addObstacle(uross, new Point(13, 8), ObstacleType.BARRIER);

        return uross;
    }

    static Map getMainArtsMap() {
        Map marts = new Map(ResourceTools.loadImageFromResource("resources/arts_mainfloor.bmp"), new Dimension(16, 16), new Dimension(44, 48));
        Map.addObstacleRange(marts, new Point(1, 21), new Point(15, 22), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(0, 15), new Point(4, 16), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(6, 15), new Point(9, 16), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(11, 15), new Point(17, 16), ObstacleType.BARRIER);

        Map.addObstacleRange(marts, new Point(19, 15), new Point(23, 16), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(25, 15), new Point(28, 16), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(19, 20), new Point(23, 21), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(25, 20), new Point(28, 21), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(6, 5), new Point(12, 10), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(14, 5), new Point(23, 10), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(25, 5), new Point(28, 10), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(3, 18), new Point(8, 19), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(12, 18), new Point(17, 19), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(4, 23), new Point(5, 24), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(0, 24), new Point(1, 24), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(13, 24), new Point(15, 24), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(8, 15), new Point(8, 24), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(17, 15), new Point(17, 24), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(19, 17), new Point(20, 17), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(25, 17), new Point(26, 17), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(19, 22), new Point(20, 22), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(25, 22), new Point(26, 22), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(6, 13), new Point(9, 14), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(13, 13), new Point(13, 14), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(0, 5), new Point(4, 10), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(0, 0), new Point(4, 1), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(6, 0), new Point(12, 1), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(14, 0), new Point(23, 1), ObstacleType.BARRIER);
        Map.addObstacleRange(marts, new Point(25, 0), new Point(28, 1), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(0, 4), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(4, 4), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(6, 4), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(12, 4), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(14, 4), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(23, 4), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(25, 4), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(0, 2), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(4, 2), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(6, 2), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(12, 2), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(14, 2), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(23, 2), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(25, 2), ObstacleType.BARRIER);

        Map.addObstacle(marts, new Point(19, 19), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(23, 19), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(25, 19), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(23, 17), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(23, 22), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(19, 24), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(23, 24), ObstacleType.BARRIER);
        Map.addObstacle(marts, new Point(25, 24), ObstacleType.BARRIER);

        return marts;
    }

    static Map getDownArtsMap() {
        Map darts = new Map(ResourceTools.loadImageFromResource("resources/arts_downstair.bmp"), new Dimension(16, 16), new Dimension(44, 48));
        Map.addObstacleRange(darts, new Point(0, 24), new Point(4, 24), ObstacleType.BARRIER);
        Map.addObstacle(darts, new Point(25, 24), ObstacleType.BARRIER);
        Map.addObstacle(darts, new Point(9, 24), ObstacleType.BARRIER);
        Map.addObstacle(darts, new Point(11, 24), ObstacleType.BARRIER);
        Map.addObstacle(darts, new Point(13, 24), ObstacleType.BARRIER);
        Map.addObstacle(darts, new Point(18, 24), ObstacleType.BARRIER);
        Map.addObstacle(darts, new Point(20, 24), ObstacleType.BARRIER);
        Map.addObstacle(darts, new Point(22, 24), ObstacleType.BARRIER);
        Map.addObstacle(darts, new Point(24, 24), ObstacleType.BARRIER);
        Map.addObstacle(darts, new Point(26, 24), ObstacleType.BARRIER);
        Map.addObstacle(darts, new Point(7, 19), ObstacleType.BARRIER);
        Map.addObstacleRange(darts, new Point(0, 20), new Point(1, 21), ObstacleType.BARRIER);
        Map.addObstacleRange(darts, new Point(3, 20), new Point(4, 21), ObstacleType.BARRIER);
        Map.addObstacleRange(darts, new Point(0, 17), new Point(1, 18), ObstacleType.BARRIER);
        Map.addObstacleRange(darts, new Point(3, 17), new Point(4, 18), ObstacleType.BARRIER);
        Map.addObstacleRange(darts, new Point(6, 22), new Point(15, 22), ObstacleType.BARRIER);
        Map.addObstacleRange(darts, new Point(17, 22), new Point(28, 22), ObstacleType.BARRIER);
        Map.addObstacleRange(darts, new Point(8, 21), new Point(15, 21), ObstacleType.BARRIER);
        Map.addObstacleRange(darts, new Point(0, 15), new Point(4, 16), ObstacleType.BARRIER);
        Map.addObstacleRange(darts, new Point(5, 15), new Point(9, 16), ObstacleType.BARRIER);
        Map.addObstacleRange(darts, new Point(11, 15), new Point(28, 16), ObstacleType.BARRIER);

        return darts;
    }

    static Map getMainCafeMap() {
        Map mcafe = new Map(ResourceTools.loadImageFromResource("resources/cafe_mainfloor.bmp"), new Dimension(16, 16), new Dimension(44, 48));

        return mcafe;
    }

    static Map getDownCafeMap() {
        Map dcafe = new Map(ResourceTools.loadImageFromResource("resources/cafe_downstair.bmp"), new Dimension(16, 16), new Dimension(44, 48));

        return dcafe;
    }

    static Map getLibraryMap() {
        Map lib = new Map(ResourceTools.loadImageFromResource("resources/library.jpg"), new Dimension(16, 16), new Dimension(20, 20));
        return lib;
    }

    static Map getClassroom1Map() {
        Map classroom = new Map(ResourceTools.loadImageFromResource("resources/classroom.bmp"), new Dimension(16, 16), new Dimension(20, 20));
        return classroom;
    }

    static Map getClassroom2Map() {
        Map classroomtwo = new Map(ResourceTools.loadImageFromResource("resources/classroom.bmp"), new Dimension(16, 16), new Dimension(20, 20));
        return classroomtwo;
    }

    static Map getClassroom3Map() {
        Map classroomthree = new Map(ResourceTools.loadImageFromResource("resources/classroom.bmp"), new Dimension(16, 16), new Dimension(20, 20));

        //dialog location
        Map.addItem(classroomthree, new Point(3, 2), "DialogEnglishClass");

        return classroomthree;
    }

    static Map getClassroom4Map() {
        Map classroomfour = new Map(ResourceTools.loadImageFromResource("resources/classroom.bmp"), new Dimension(16, 16), new Dimension(20, 20));
        return classroomfour;
    }

    static Map getClassroom5Map() {
        Map classroomfive = new Map(ResourceTools.loadImageFromResource("resources/classroom.bmp"), new Dimension(16, 16), new Dimension(20, 20));
        return classroomfive;
    }

    static Map getClassroom6Map() {
        Map classroomsix = new Map(ResourceTools.loadImageFromResource("resources/classroom.bmp"), new Dimension(16, 16), new Dimension(20, 20));
        return classroomsix;
    }

    static Map getClassroom7Map() {
        Map classroomseven = new Map(ResourceTools.loadImageFromResource("resources/classroom.bmp"), new Dimension(16, 16), new Dimension(20, 20));
        return classroomseven;
    }

    static Map getClassroom8Map() {
        Map classroomeight = new Map(ResourceTools.loadImageFromResource("resources/classroom.bmp"), new Dimension(16, 16), new Dimension(20, 20));
        return classroomeight;
    }

    static Map getHealthCentreMap() {
        Map healthc = new Map(ResourceTools.loadImageFromResource("resources/health_centre.bmp"), new Dimension(16, 16), new Dimension(20, 20));
        return healthc;
    }

    static Map getGymMap() {
        Map gym = new Map(ResourceTools.loadImageFromResource("resources/gym.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return gym;
    }

    static Map getMackEntranceMap() {
        Map mdent = new Map(ResourceTools.loadImageFromResource("resources/house_entrance.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return mdent;
    }

    static Map getMackHallwayMap() {
        Map mhent = new Map(ResourceTools.loadImageFromResource("resources/house_hallway.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return mhent;
    }

    static Map getAlexEntranceMap() {
        Map adent = new Map(ResourceTools.loadImageFromResource("resources/house_entrance.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        Map.addItem(adent, new Point(7, 18), "DialogHP");
        return adent;
    }

    static Map getAlexHallwayMap() {
        Map ahent = new Map(ResourceTools.loadImageFromResource("resources/house_hallway.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return ahent;
    }

    static Map getHopeEntranceMap() {
        Map hdent = new Map(ResourceTools.loadImageFromResource("resources/house_entrance.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return hdent;
    }

    static Map getHopeHallwayMap() {
        Map hhent = new Map(ResourceTools.loadImageFromResource("resources/house_hallway.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return hhent;
    }

    static Map getAllardEntranceMap() {
        Map aldent = new Map(ResourceTools.loadImageFromResource("resources/house_entrance.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return aldent;
    }

    static Map getAllardHallwayMap() {
        Map alhent = new Map(ResourceTools.loadImageFromResource("resources/house_hallway.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return alhent;
    }

    static Map getRogersEntranceMap() {
        Map rdent = new Map(ResourceTools.loadImageFromResource("resources/house_entrance.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return rdent;
    }

    static Map getRogersHallwayMap() {
        Map rhent = new Map(ResourceTools.loadImageFromResource("resources/house_hallway.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return rhent;
    }

    static Map getWhittalEntranceMap() {
        Map wdent = new Map(ResourceTools.loadImageFromResource("resources/house_entrance.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return wdent;
    }

    static Map getWhittalHallwayMap() {
        Map whent = new Map(ResourceTools.loadImageFromResource("resources/house_hallway.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return whent;
    }

    static Map getPrivettEntranceMap() {
        Map pdent = new Map(ResourceTools.loadImageFromResource("resources/house_entrance.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return pdent;
    }

    static Map getPrivettHallwayMap() {
        Map phent = new Map(ResourceTools.loadImageFromResource("resources/house_hallway.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return phent;
    }

    static Map getEllisEntranceMap() {
        Map edent = new Map(ResourceTools.loadImageFromResource("resources/house_entrance.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return edent;
    }

    static Map getEllisHallwayMap() {
        Map ehent = new Map(ResourceTools.loadImageFromResource("resources/house_hallway.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return ehent;
    }

    static Map getSquashGymMap() {
        Map squash = new Map(ResourceTools.loadImageFromResource("resources/squash_court.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return squash;
    }

    static Map getOfficeMap() {
        Map office = new Map(ResourceTools.loadImageFromResource("resources/office.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return office;
    }

    static Map getITMap() {
        Map underit = new Map(ResourceTools.loadImageFromResource("resources/under_ground.bmp"), new Dimension(16, 16), new Dimension(30, 70));
        return underit;
    }

    static Map getHiddenMap() {
        Map hid = new Map(ResourceTools.loadImageFromResource("resources/special_place.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return hid;
    }

    static Map getOldBuildingMap() {
        Map olaca = new Map(ResourceTools.loadImageFromResource("resources/old_building.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(olaca, new Point(13, 3), "DialogIT");

        return olaca;
    }

    static Map getMTMap() {
        Map mt = new Map(ResourceTools.loadImageFromResource("resources/mt.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return mt;
    }

    static Map getDorm1AlexMap() {
        Map adorm1 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(adorm1, new Point(10, 2), "Dialog");

        return adorm1;
    }

    static Map getDorm2AlexMap() {
        Map adorm2 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_2.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(adorm2, new Point(10, 2), "Dialog");

        return adorm2;
    }

    static Map getDorm3AlexMap() {
        Map adorm3 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_3.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(adorm3, new Point(10, 2), "Dialog");

        return adorm3;
    }

    static Map getDorm1HopeMap() {
        Map hdorm1 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(hdorm1, new Point(10, 2), "Dialog");

        return hdorm1;
    }

    static Map getDorm2HopeMap() {
        Map hdorm2 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_2.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(hdorm2, new Point(10, 2), "Dialog");

        return hdorm2;
    }

    static Map getDorm3HopeMap() {
        Map hdorm3 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_3.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(hdorm3, new Point(10, 2), "Dialog");

        return hdorm3;
    }

    static Map getDorm1AllardMap() {
        Map aldorm1 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(aldorm1, new Point(10, 2), "Dialog");

        return aldorm1;
    }

    static Map getDorm2AllardMap() {
        Map aldorm2 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_2.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(aldorm2, new Point(10, 2), "Dialog");

        return aldorm2;
    }

    static Map getDorm3AllardMap() {
        Map aldorm3 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_3.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(aldorm3, new Point(10, 2), "Dialog");

        return aldorm3;
    }

    static Map getDorm1MackMap() {
        Map mdorm1 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(mdorm1, new Point(10, 2), "Dialog");

        return mdorm1;
    }

    static Map getDorm2MackMap() {
        Map mdorm2 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_2.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(mdorm2, new Point(10, 2), "Dialog");

        return mdorm2;
    }

    static Map getDorm3MackMap() {
        Map mdorm3 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_3.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(mdorm3, new Point(10, 2), "Dialog");

        return mdorm3;
    }

    static Map getDorm1WhittalMap() {
        Map wdorm1 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(wdorm1, new Point(10, 2), "Dialog");

        return wdorm1;
    }

    static Map getDorm2WhittalMap() {
        Map wdorm2 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_2.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(wdorm2, new Point(10, 2), "Dialog");

        return wdorm2;
    }

    static Map getDorm3WhittalMap() {
        Map wdorm3 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_3.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(wdorm3, new Point(10, 2), "Dialog");

        return wdorm3;
    }

    static Map getDorm1RogersMap() {
        Map rdorm1 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(rdorm1, new Point(10, 2), "Dialog");

        return rdorm1;
    }

    static Map getDorm2RogersMap() {
        Map rdorm2 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_2.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(rdorm2, new Point(10, 2), "Dialog");

        return rdorm2;
    }

    static Map getDorm3RogersMap() {
        Map rdorm3 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_3.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(rdorm3, new Point(10, 2), "Dialog");

        return rdorm3;
    }

    static Map getDorm1PrivettMap() {
        Map pdorm1 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(pdorm1, new Point(10, 2), "Dialog");

        return pdorm1;
    }

    static Map getDorm2PrivettMap() {
        Map pdorm2 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_2.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(pdorm2, new Point(10, 2), "Dialog");

        return pdorm2;
    }

    static Map getDorm3PrivettMap() {
        Map pdorm3 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_3.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(pdorm3, new Point(10, 2), "Dialog");

        return pdorm3;
    }

    static Map getDorm1EllisMap() {
        Map edorm1 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(edorm1, new Point(10, 2), "Dialog");

        return edorm1;
    }

    static Map getDorm2EllisMap() {
        Map edorm2 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_2.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(edorm2, new Point(10, 2), "Dialog");

        return edorm2;
    }

    static Map getDorm3EllisMap() {
        Map edorm3 = new Map(ResourceTools.loadImageFromResource("resources/dorm_room_3.bmp"), new Dimension(16, 16), new Dimension(30, 30));

        //dialog location
        Map.addItem(edorm3, new Point(10, 2), "Dialog");

        return edorm3;
    }

    static Map getOldCafeMap() {
        Map olcafe = new Map(ResourceTools.loadImageFromResource("resources/old_cafe.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return olcafe;
    }

    static Map getBunchMap() {
        Map theatre = new Map(ResourceTools.loadImageFromResource("resources/bunch.bmp"), new Dimension(16, 16), new Dimension(30, 30));
        return theatre;
    }
}
