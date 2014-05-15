/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import environment.ApplicationStarter;
import java.awt.Dimension;
import java.awt.Toolkit;

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
        ApplicationStarter.run(new String[0], "Brentwood Orientation", Toolkit.getDefaultToolkit().getScreenSize(), new BrentwoodEnvironment());
    }
}
