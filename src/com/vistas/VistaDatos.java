
package com.vistas;

import com.clases.Empleado;
import java.util.Scanner;

/**
 * Fecha:08-07-2019
 * CopyRight:Mauricio Ayala
 * Version:1.0
 * @author educacion
 */
public class VistaDatos {


    public static void main(String[] args) {
        
        Empleado em = new Empleado();
        Scanner sc = new Scanner(System.in);
        
        try{
            
            
            System.out.println(":::::::BIENVENIDO:::::::");
            System.out.println("Digite el DUI: ");
            em.setDui(sc.nextLine());
            System.out.println("Digite el nombre del empleado: ");
            em.setNombreEmpleado(sc.nextLine());
            System.out.println("Digite la edad del empleado: ");
            em.setEdadEmpleado(Integer.parseInt(sc.nextLine()));
            System.out.println("Digite el genero del empleado: ");
            em.setGenero(sc.nextLine());
            System.out.println("Digite el sueldo del empleado: ");
            em.setSueldo(Double.parseDouble(sc.nextLine()));
            System.out.println("Digite el cargo del empleado: ");
            em.setNombreCargo(sc.nextLine());
            System.out.println("Digite el departamento al que pertenece el empleado: ");
            em.setDepartamento(sc.nextLine());
            
            em.ObtenerDatos();
            
            
        }catch(Exception e){
            System.out.println("Ocurrio un error " + e.toString());
        }
    }
    
}
