
package com.clases;

/**
 * Fecha:08-07-2019
 * CopyRight:Mauricio Ayala
 * Version:1.0
 * @author educacion
 */
public class Empleado extends Cargo{
    
    private String dui;
    private String nombreEmpleado;
    private String genero;
    private int edadEmpleado;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(String dui, String nombreEmpleado, String genero, int edadEmpleado, double sueldo) {
        this.dui = dui;
        this.nombreEmpleado = nombreEmpleado;
        this.genero = genero;
        this.edadEmpleado = edadEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado(String dui, String nombreEmpleado, String genero, int edadEmpleado, double sueldo, String nombreCargo, String departamento, int CantidadVacantes) {
        super(nombreCargo, departamento, CantidadVacantes);
        this.dui = dui;
        this.nombreEmpleado = nombreEmpleado;
        this.genero = genero;
        this.edadEmpleado = edadEmpleado;
        this.sueldo = sueldo;
    }

    
    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdadEmpleado() {
        return edadEmpleado;
    }

    public void setEdadEmpleado(int edadEmpleado) {
        this.edadEmpleado = edadEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void ObtenerDatos()
    { 

        
        System.out.println("::::::::::DATOS EMPLEADOS::::::::::");
        System.out.println("\n\n\nDUI: " + this.dui + "\n"
                           + "Nombre Empleado: " + this.nombreEmpleado + "\n"
                           + "Edad Empleado: " + this.edadEmpleado + "\n"
                           + "Genero Empleado: " + this.genero + "\n"
                           + "Sueldo Empleado: " + this.sueldo + "\n"
                           + "Cargo Empleado: " + this.getNombreCargo()  + "\n"
                           + "Departamento Empleado: " + this.getDepartamento() + "\n");
    }
    

    
}
