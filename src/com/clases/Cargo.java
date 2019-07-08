
package com.clases;

/**
 * Fecha:08-07-2019
 * CopyRight:Mauricio Ayala
 * Version:1.0
 * @author educacion
 */
public class Cargo {
    
    private String nombreCargo;
    private String departamento;
    private int CantidadVacantes;

    public Cargo() {
    }

    public Cargo(String nombreCargo, String departamento, int CantidadVacantes) {
        this.nombreCargo = nombreCargo;
        this.departamento = departamento;
        this.CantidadVacantes = CantidadVacantes;
    }
    
    public Cargo(Cargo Cargo){
        this.nombreCargo = Cargo.nombreCargo;
        this.departamento = Cargo.departamento;
        this.CantidadVacantes = Cargo.CantidadVacantes;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCantidadVacantes() {
        return CantidadVacantes;
    }

    public void setCantidadVacantes(int CantidadVacantes) {
        this.CantidadVacantes = CantidadVacantes;
    }
    
    public void ObtenerDatos(){
        System.out.println("Datos de Cargos");
    }
}
