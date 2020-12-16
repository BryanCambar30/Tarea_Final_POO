/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_final_poo;

import java.util.Scanner;

/**
 *
 * @author Cambar
 */
public class Tarea_final_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {            
        System.out.println("Biemvenido al Sitio Web oficial de la Universidad Nacional Autonoma De Honduras");
        System.out.println("Por favor elige el Tipo de usuario que eres.\n1. Estudiante\n2. Administrador");
        Scanner usuario = new Scanner(System.in);
        switch (usuario.nextInt()){
            case 1:
                System.out.println("Bienvenido, Que desa hacer \n1. Agregar a un estudiante\n2. Eliminar a un estudiante");
                Scanner opcion = new Scanner(System.in);
                int option = opcion.nextInt();
                switch (option){
                    case 1:
                        Alumno alumno = new Alumno();
                        System.out.println("por digite el nombre del estudiante");
                        Scanner Nalumno = new Scanner(System.in);
                        alumno.setName(Nalumno.next());
                        System.out.println("por digite el numero numero de Registro del estudiante");
                        Scanner registro = new Scanner(System.in);
                        alumno.setnRegistro(registro.nextInt());
                        System.out.println("Seleccione la clase");
                        Registro secciones = new Registro();
                        for (int i = 0 ; i < secciones.secciones.length; i++) {
                            System.out.print(i+1);
                            System.out.print(secciones.secciones[i] + "\n");
                        }
                        Scanner clase = new Scanner(System.in);
                        Matricula matricula = new Matricula();
                        matricula.agregaAlumno(alumno, secciones.secciones[clase.nextInt()]);
                    break;
                default:
                }
                break;
            case 2:
                System.out.println("Bienvenido, Que desa hacer \n1. Crear una Seccion de una clase nueva\n2. eliminar una seccion existente");
                Scanner opcion2 = new Scanner(System.in);
                switch (opcion2.nextInt()){
                case 1:
                    Registro registro = new Registro();
                    registro.CrearSeccion();
                    break;
                default:
                }
                break;
            default:        
        }
        
                    
        } while (true);
    }
    
}
