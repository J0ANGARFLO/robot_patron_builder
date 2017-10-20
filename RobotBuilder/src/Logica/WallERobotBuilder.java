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
public class WallERobotBuilder extends RobotBuilder{

    @Override
    public void buildRobotCabeza() {
        Cabeza cabeza = new Cabeza();
        cabeza.setColor("gris");
        cabeza.setTamanio("pequeña");
        robot.setRobotCabeza(cabeza);
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("cuadrado");
    }

    @Override
    public void buildRobotBrazos() {
        robot.setRobotBrazos("cortos/pinzas");
    }

    @Override
    public void buildRobotPiernas() {
        robot.setRobotPiernas("orugas");
    }
    
}
