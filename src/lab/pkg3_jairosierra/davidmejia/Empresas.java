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
public class Empresas {
    private String nombre;
    private String telefono;
    private ArrayList<Proyectos> proyecto=new ArrayList();
    private String correo;
    private String contrasena;
    private String descripcion;

    public Empresas() {
    }

    public Empresas(String nombre, String telefono, String correo, String contrasena, String descripcion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Proyectos> getProyecto() {
        return proyecto;
    }

    public void setProyecto(ArrayList<Proyectos> proyecto) {
        this.proyecto = proyecto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Empresas{" + "nombre=" + nombre + ", telefono=" + telefono + ", proyecto=" + proyecto + ", correo electronico=" + correo + ", contrasena=" + contrasena + ", descripcion=" + descripcion + '}';
    }
    
}
