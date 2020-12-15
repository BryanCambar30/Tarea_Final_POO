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
    private String Name;
    private int id;
    private int edad;

    @Override
    public String Name(String Name) {
        this.Name = Name;
        return this.Name;
    }

    @Override
    public int id(int id) {
        this.id = id;
       return this.id; 
    }

    @Override
    public int edad(int edad) {
        this.edad = edad;
        return this.edad;
    }

    //Getters y Setters
    public int getnRegistro() {
        return nRegistro;
    }

    public void setnRegistro(int nRegistro) {
        this.nRegistro = nRegistro;
    }
    
}
