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
public class Matricula {
    
    public void agregaAlumno(Alumno alumno, Seccion Rseccion){
        Seccion seccion = new Seccion();
        seccion.alumno[0]= alumno;
        seccion.seccion = Rseccion.seccion;
        seccion.horaDisponible = Rseccion.horaDisponible;
        
    }
    public void eliminarAlumno(){
    }
    
}
