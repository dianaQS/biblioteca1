/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Diana
 */

    public class Personal {
    
    private int idpersonal;
    private String nombre;
    private String apellido;
    private String cargo;
    private String area;
    private int DNI;

    public Personal(int idpersonal, String nombre, String apellido, String cargo, String area, int DNI) {
        this.idpersonal = idpersonal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.area = area;
        this.DNI = DNI;
    }

    public int getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(int idpersonal) {
        this.idpersonal = idpersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
