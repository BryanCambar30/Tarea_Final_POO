/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_final_poo;

/**
 *
 * @author Cambar
 */
public abstract class Profesor extends Persona {

    private int nEmpleado;
    private float Sueldo;

    public Profesor (int id, int nEmpleado, int sueldo){
        super(id);
        this.nEmpleado = nEmpleado;
        this.Sueldo = sueldo;
    }

    public float getSueldo() {
        return Sueldo;
    }

    public void setSueldo(float Sueldo) {
        this.Sueldo = Sueldo;
    }


    public int getnEmpleado() {
        return nEmpleado;
    }

 
    public void setnEmpleado(int nEmpleado) {
        this.nEmpleado = nEmpleado;
    }

}
