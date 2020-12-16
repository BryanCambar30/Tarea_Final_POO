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
public class ProfesorIS implements Profesor, IngSistemas{
    private String name;
    private int id;
    private int edad;
    private String Area;
    private int Sueldo;
    private int nEmpleado;

//Profesor
    @Override
    public int id(){
        return this.getId();
    }
    
    @Override
    public String Name() {
        return this.getName();
    }
    
    
    @Override
    public int Sueldo() {
        return this.getSueldo();
    }

    @Override
    public int nEmpleado() {
        return this.getnEmpleado();
    }

    @Override
    public int edad() {
        return this.getEdad(); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Ingeniero en sistemas
    @Override
    public int nColegiad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int añoColegiado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
     // Getters y Setters
    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the Sueldo
     */
    public int getSueldo() {
        return Sueldo;
    }

    /**
     * @param Sueldo the Sueldo to set
     */
    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    /**
     * @return the nEmpleado
     */
    public int getnEmpleado() {
        return nEmpleado;
    }

    /**
     * @param nEmpleado the nEmpleado to set
     */
    public void setnEmpleado(int nEmpleado) {
        this.nEmpleado = nEmpleado;
    }
    
}
