/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package brentwoodmon;

import java.awt.Point;

/**
 *
 * @author kevin.lawrence
 */
public interface MoveValidatorIntf {
    public boolean validateMove(Point currentSystemCoord, Point proposedSystemCoord);
}
