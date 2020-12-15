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
public class Clase {
    
    private String nombreClase;
    private String CodigoClase;
    private String Carrera;
    private int hora;
    private int MaxEstudiantes;
    private int minEstudiantes;
    private int uv;

    /**
     * @return the Carrera
     */
    public String getCarrera() {
        return Carrera;
    }

    /**
     * @param Carrera the Carrera to set
     */
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * @return the MaxEstudiantes
     */
    public int getMaxEstudiantes() {
        return MaxEstudiantes;
    }

    /**
     * @param MaxEstudiantes the MaxEstudiantes to set
     */
    public void setMaxEstudiantes(int MaxEstudiantes) {
        this.MaxEstudiantes = MaxEstudiantes;
    }

    /**
     * @return the minEstudiantes
     */
    public int getMinEstudiantes() {
        return minEstudiantes;
    }

    /**
     * @param minEstudiantes the minEstudiantes to set
     */
    public void setMinEstudiantes(int minEstudiantes) {
        this.minEstudiantes = minEstudiantes;
    }

    /**
     * @return the uv
     */
    public int getUv() {
        return uv;
    }

    /**
     * @param uv the uv to set
     */
    public void setUv(int uv) {
        this.uv = uv;
    }

    /**
     * @return the nombreClase
     */
    public String getNombreClase() {
        return nombreClase;
    }

    /**
     * @param nombreClase the nombreClase to set
     */
    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    /**
     * @return the CodigoClase
     */
    public String getCodigoClase() {
        return CodigoClase;
    }

    /**
     * @param CodigoClase the CodigoClase to set
     */
    public void setCodigoClase(String CodigoClase) {
        this.CodigoClase = CodigoClase;
    }
}
