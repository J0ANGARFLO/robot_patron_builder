package Logica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgarcia
 */

// The concrete builder class that assembles the parts 
// of the finished Robot object

public class BenderRobotBuilder extends RobotBuilder {

    @Override
    public void buildRobotCabeza() {
        Cabeza cabezaBender = new Cabeza();
        cabezaBender.setColor("gris");
        cabezaBender.setTamanio("grande");
        robot.setRobotCabeza(cabezaBender);
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("alto");
    }

    @Override
    public void buildRobotBrazos() {
        robot.setRobotBrazos("largos");
    }

    @Override
    public void buildRobotPiernas() {
        robot.setRobotPiernas("largas");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
