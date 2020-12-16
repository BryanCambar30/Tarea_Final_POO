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
public class Seccion {
    int[] Seccion;
    private String nombre;
    private int SeccionID;
    public int seccion = SeccionID;
    private float hora;
    public float horaDisponible = hora;
    Alumno[] alumno = new Alumno[30];
    ProfesorIS profesor = new ProfesorIS();
    Clase clase = new Clase();

    //Getters y Setters
    /**
     * @return the SeccionID
     */
    public int getSeccionID() {
        return SeccionID;
    }

    /**
     * @param SeccionID the SeccionID to set
     */
    public void setSeccionID(int SeccionID) {
        this.SeccionID = SeccionID;
    }

    /**
     * @return the hora
     */
    public float getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(float hora) {
        this.hora = hora;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

