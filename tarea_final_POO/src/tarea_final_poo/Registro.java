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
public class Registro {
    Seccion [] secciones = new Seccion[4];
    int i=0, j=0, k=0, m=0, n=0, z=0;
    int[] SeccionADMI = new int[4];
    int[] SeccionPOO = new int[4];;
    int[] SeccionALGO = new int[4];;
    int[] SeccionLENGUA = new int[4];;
    int[] SeccionSO = new int[4];;
    public void CrearSeccion(){
        Seccion nuevaSeccion = new Seccion();
        System.out.println("Nombre del catedratico: ");
        Scanner maestro = new Scanner(System.in);
        nuevaSeccion.profesor.setName(maestro.next());
        System.out.println("Digite el numero de empleado: ");
        Scanner empleado = new Scanner(System.in);
        nuevaSeccion.profesor.setnEmpleado(empleado.nextInt());
        System.out.println("Digite el área: ");
        Scanner area = new Scanner(System.in);
        nuevaSeccion.profesor.setArea(area.next());
        System.out.println("Que clase desea crear:");
        System.out.println("1. Administracion\n2. POO\n3. Algoritmos\n4. Lenguajesn5. SO");
        Scanner e = new Scanner(System.in);
        int en = e.nextInt();
        switch (en){
            case 1:
                nuevaSeccion.clase.Administracios();
                nuevaSeccion.setNombre(nuevaSeccion.clase.Nombre);
                break;
            case 2:
                nuevaSeccion.clase.POO();
                nuevaSeccion.setNombre(nuevaSeccion.clase.Nombre);
               break; 
            case 3:
                nuevaSeccion.clase.Algoritmos();
                nuevaSeccion.setNombre(nuevaSeccion.clase.Nombre);
                break;
            case 4:
                nuevaSeccion.clase.Lenguajes();
                nuevaSeccion.setNombre(nuevaSeccion.clase.Nombre);
                break;
            case 5:
                nuevaSeccion.clase.SO();
                nuevaSeccion.setNombre(nuevaSeccion.clase.Nombre);
                break;
            
            default: 
        }
        System.out.println("A que Hora desea que se imparta la clase? ");
        Scanner hora = new Scanner(System.in);
        nuevaSeccion.setHora(hora.nextFloat());
        System.out.println("Asigne Seccion: ");
        Scanner seccion = new Scanner(System.in);
        nuevaSeccion.setSeccionID(seccion.nextInt());
        System.out.println("Seccion creada con exito, ");
        switch (en){
            case 1:
                SeccionADMI [i]= nuevaSeccion.seccion;
                i++;
                break;
            case 2:
                SeccionPOO [j]= nuevaSeccion.seccion;
                j++;
                break; 
            case 3:
                SeccionALGO [k]= nuevaSeccion.seccion;
                k++;
                break;
            case 4:
                SeccionLENGUA [m]= nuevaSeccion.seccion;
                m++;
                break;
            case 5:
                SeccionSO [n]= nuevaSeccion.seccion;
                n++;
                break;
            
            default: 
        }
        secciones[z] = nuevaSeccion;
        z++;
        
    }
    
    public void eliminarSecciopn(){
        
    }
}
