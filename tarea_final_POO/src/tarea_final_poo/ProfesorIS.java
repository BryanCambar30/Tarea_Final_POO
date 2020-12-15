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

    private String Area;
    private int nEmpleado;
    private int Sueldo;
    
    //Profesor
    @Override
    public String Name(String Name) {
        return Profesor.super.Name(Name);
    }

    @Override
    public int id(int id) {
        return Profesor.super.id(id); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int Sueldo(int Sueldo) {
        this.Sueldo = Sueldo;
        return this.Sueldo;
    }

    @Override
    public int nEmpleado(int nEmpleado) {
        this.nEmpleado = nEmpleado;
        return this.nEmpleado;
    }

    @Override
    public int edad(int edad) {
        return Profesor.super.edad(edad); //To change body of generated methods, choose Tools | Templates.
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
    
}
