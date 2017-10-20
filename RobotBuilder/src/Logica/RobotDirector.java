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

// The director / engineer class creates a Robot using the
// builder interface that is defined (OldRobotBuilder)

public class RobotDirector {
	
    private RobotBuilder robotBuilder;
    
    public void setRobotBuilder(RobotBuilder rb){
        this.robotBuilder = rb;
    }

    // Return the Robot made from the OldRobotBuilder spec

    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }

    // Execute the methods specific to the RobotBuilder 
    // that implements RobotBuilder (OldRobotBuilder)

    public void makeRobot() {
        this.robotBuilder.createRobot();
        this.robotBuilder.buildRobotCabeza();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotBrazos();
        this.robotBuilder.buildRobotPiernas();
    }
	
}
