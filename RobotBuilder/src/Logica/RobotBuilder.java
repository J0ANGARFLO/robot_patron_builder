/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author jgarcia
 */

// Defines the methods needed for creating parts 
// for the robot

public abstract class RobotBuilder {
    
    protected Robot robot;
    
    public abstract void buildRobotCabeza();
    public abstract void buildRobotTorso();
    public abstract void buildRobotBrazos();
    public abstract void buildRobotPiernas();

    /**
     * @param robot the robot to set
     */
    public void createRobot() {
        this.robot = new Robot();
    }

    /**
     * @return the robot
     */
    public Robot getRobot() {
        return robot;
    }
}
