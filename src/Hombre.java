/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Hombre {
     private Robot robot;
    private String nombre;

    public Hombre(Robot robot, String nombre) {
        this.robot = robot;
        this.nombre = nombre;
    }
    
    public void JugarConRobot(Robot robot){
      robot.robotAvanzar(1);
      robot.dormir();
      robot.despertar();
      robot.robotRetroceder(0);
    }
}
