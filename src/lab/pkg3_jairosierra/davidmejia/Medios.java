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
public class Medios extends Freelance{
    protected ArrayList<P_publicitarios> publicitarios=new ArrayList();
    protected String marca;
    protected String modelo;

    public Medios() {
    }

    public Medios(String marca, String modelo, String nombre, String contrasena, String genero, int edad, double dinero, String ciudad, String telefono, int id, String correo) {
        super(nombre, contrasena, genero, edad, dinero, ciudad, telefono, id, correo);
        this.marca = marca;
        this.modelo = modelo;
    }

    public ArrayList<P_publicitarios> getPublicitarios() {
        return publicitarios;
    }

    public void setPublicitarios(ArrayList<P_publicitarios> publicitarios) {
        this.publicitarios = publicitarios;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        String s="";
        s+="Medios Audiovisuales\n";
        s+="Medios Publicitarios: "+publicitarios+"\n";
        s+="Marca: "+marca+"\n";
        s+="Modelo de la camara: "+modelo+"\n";
        return super.toString()+s;
    }
    
}
