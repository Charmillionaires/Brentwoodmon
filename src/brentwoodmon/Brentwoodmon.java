/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import environment.ApplicationStarter;
import java.awt.Dimension;

/**
 *
 * @author zhanglianghui
 */
public class Brentwoodmon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();

    }

    private static void start() {
//        ApplicationStarter.run("Brentwood Orientation", new BrentwoodEnvironment());
        ApplicationStarter.run(new String[0], "Brentwood Orientation", new Dimension(500, 500), new BrentwoodEnvironment());
        
    }
}
