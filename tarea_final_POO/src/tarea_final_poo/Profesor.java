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
public interface Profesor extends Persona{
    
    public int Sueldo(int Sueldo);
    public int nEmpleado(int nEmpleado);
    

    @Override
    public default String Name(String Name) {
        return Name;
    }

    @Override
    public default int edad(int edad) {
        return edad;
    }

    @Override
    public default int id(int id) {
        return id;
    }
    
}
