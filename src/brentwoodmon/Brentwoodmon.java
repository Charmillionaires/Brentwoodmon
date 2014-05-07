/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import environment.ApplicationStarter;

/**
 *
 * @author zhanglianghui
 */
public class Brentwoodmon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationStarter.run("Brentwoodmon", new WalkingEnvironment());
    }
}
