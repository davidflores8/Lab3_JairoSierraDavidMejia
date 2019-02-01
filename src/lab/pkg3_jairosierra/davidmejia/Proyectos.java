/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_jairosierra.davidmejia;

import java.util.Date;

/**
 *
 * @author Jairo Sierra
 */
public class Proyectos {
    private String nombre;
    private String empresa;
    private String precio;
    private String estado;
    private String descripcion;
    private Date inicio;
    private Date entrega;

    public Proyectos() {
    }

    public Proyectos(String nombre, String empresa, String precio, String estado, String descripcion, Date inicio, Date entrega) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.entrega = entrega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getEntrega() {
        return entrega;
    }

    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }

    @Override
    public String toString() {
        return "Proyectos{" + "nombre=" + nombre + ", empresa=" + empresa + ", precio=" + precio + ", estado=" + estado + ", descripcion=" + descripcion + ", fecha de inicio=" + inicio + ", fecha de entrega=" + entrega + '}';
    }
    
}
