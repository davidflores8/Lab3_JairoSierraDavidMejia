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
public class Contador extends Freelance {
    private ArrayList<P_comerciales> comerciales = new ArrayList();
    private String universidad;
    private boolean inscripcion;
    private String hobbies;

    public Contador() {
    }

    public Contador(String universidad, boolean inscripcion, String hobbies, String nombre, String contrasena, String genero, int edad, double dinero, String ciudad, String telefono, int id, String correo) {
        super(nombre, contrasena, genero, edad, dinero, ciudad, telefono, id, correo);
        this.universidad = universidad;
        this.inscripcion = inscripcion;
        this.hobbies = hobbies;
    }

    public ArrayList<P_comerciales> getComerciales() {
        return comerciales;
    }

    public void setComerciales(ArrayList<P_comerciales> comerciales) {
        this.comerciales = comerciales;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public boolean getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(boolean inscripcion) {
        this.inscripcion = inscripcion;
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
        s+="Contador\n";
        s+="Productos comerciales: "+comerciales+"\n";
        s+="Universidad: "+universidad+"\n";
        s+="Inscripcion: "+comerciales+"\n";
        s+="Hobbies: "+comerciales+"\n";
        return super.toString()+s;
    }
    
}
