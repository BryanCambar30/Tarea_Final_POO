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
public class Alumno implements Persona {
    private int nRegistro;

    public int getnRegistro() {
        return nRegistro;
    }

    public void setnRegistro(int nRegistro) {
        this.nRegistro = nRegistro;
    }

    @Override
    public String Name() {
        return null;
    }

    @Override
    public int id() {
       return 0; 
    }
    
}
