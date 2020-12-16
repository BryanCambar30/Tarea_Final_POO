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
public interface IngSistemas extends Persona{
    
    public int nColegiad();
    public int añoColegiado();
    
    
    @Override
    public default String Name(){
        return this.Name();
    }
    
    @Override
    public default int edad() {
        return this.edad();
    }

    @Override
    public default int id() {
        return this.id();
    }

}