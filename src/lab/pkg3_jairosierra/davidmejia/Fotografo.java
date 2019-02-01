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
public class Fotografo extends Freelance {

    private ArrayList<P_publicitarios> publicitarios = new ArrayList();
    private String marca;
    private String camara;

    public Fotografo() {
    }

    public Fotografo(String marca, String camara, String nombre, String contrasena, String genero, int edad, double dinero, String ciudad, String telefono, int id, String correo) {
        super(nombre, contrasena, genero, edad, dinero, ciudad, telefono, id, correo);
        this.marca = marca;
        this.camara = camara;
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

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    @Override
    public String toString() {
        String s="";
        s+="Fotografo\n";
        s+="Proyectos publicitarios: "+publicitarios+"\n";
        s+="Marca: "+marca+"\n";
        s+="Modelo de la camara: "+camara+"\n";
        return super.toString()+s; 
        
    }

}
