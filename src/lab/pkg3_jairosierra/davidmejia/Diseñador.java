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
public class Diseñador extends Freelance {
    private ArrayList<P_publicitarios> publicos=new ArrayList();
    private String universidad;
    private String hobbies;

    public Diseñador() {
    }

    public Diseñador(String universidad, String hobbies, String nombre, String contrasena, String genero, int edad, double dinero, String ciudad, String telefono, int id, String correo) {
        super(nombre, contrasena, genero, edad, dinero, ciudad, telefono, id, correo);
        this.universidad = universidad;
        this.hobbies = hobbies;
    }

    public ArrayList<P_publicitarios> getPublicos() {
        return publicos;
    }

    public void setPublicos(ArrayList<P_publicitarios> publicos) {
        this.publicos = publicos;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        String s="";
        s+="Diseñador\n";
        s+="Proyectos publicos: "+publicos+"\n";
        s+="Universidad: "+universidad+"\n";
        s+="Hobbies: "+hobbies+"\n";
        return super.toString()+s;
    }
    
}
