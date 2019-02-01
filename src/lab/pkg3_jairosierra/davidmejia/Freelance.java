/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_jairosierra.davidmejia;

import java.util.ArrayList;

/**
 *
 * @author Jairo Sierra
 */
public class Freelance extends Personas{
    private String nombre;
    private String contrasena;
    private String genero;
    private int edad;
    private ArrayList<Empresas> empresas = new ArrayList();
    private double dinero;
    private String ciudad;
    private String telefono;

    public Freelance() {
    }

    public Freelance(String nombre, String contrasena, String genero, int edad, double dinero, String ciudad, String telefono, int id, String correo) {
        super(id, correo);
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.genero = genero;
        this.edad = edad;
        this.dinero = dinero;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Empresas> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresas> empresas) {
        this.empresas = empresas;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        String s="";
        s+="Freelance\n";
        s+="Nombre: "+nombre+"\n";
        s+="Contraseña: "+contrasena+"\n";
        s+="Genero: "+genero+"\n";
        s+="Edad: "+edad+"\n";
        s+="Dinero: "+dinero+"\n";
        s+="Ciudad: "+ciudad+"\n";
        s+="Telefono: "+telefono+"\n";
        return super.toString()+s;
    }
    
}
