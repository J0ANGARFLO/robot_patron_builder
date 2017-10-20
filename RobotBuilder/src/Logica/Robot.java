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

// The concrete Robot class based on the RobotPlan interface

public class Robot{

    private Cabeza robotCabeza;
    private String robotTorso;
    private String robotBrazos;
    private String robotPiernas;

    public void setRobotCabeza(Cabeza cabeza) {
        robotCabeza = cabeza;
    }

    public Cabeza getRobotCabeza(){ 
        return robotCabeza; 
    }

    public void setRobotTorso(String torso) {
        robotTorso = torso;
    }

    public String getRobotTorso(){ 
        return robotTorso; 
    }

    public void setRobotBrazos(String brazos) {
        robotBrazos = brazos;
    }

    public String getRobotBrazos(){ 
        return robotBrazos; 
    }

    public void setRobotPiernas(String piernas) {
        robotPiernas = piernas;
    }

    public String getRobotPiernas(){ 
        return robotPiernas; 
    }
    
    @Override
    public String toString(){
        return "Cabeza "+this.getRobotCabeza().getColor()+" y "+this.getRobotCabeza().getTamanio()+", su torso es "+getRobotTorso()+", brazos "+getRobotBrazos()+" y piernas "+getRobotPiernas();
    }
}