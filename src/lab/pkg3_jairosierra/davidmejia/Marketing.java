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
public class Marketing extends Freelance {

    private ArrayList<P_comerciales> comerciales = new ArrayList();
    private String red;

    public Marketing() {
    }

    public Marketing(String red, String nombre, String contrasena, String genero, int edad, double dinero, String ciudad, String telefono, int id, String correo) {
        super(nombre, contrasena, genero, edad, dinero, ciudad, telefono, id, correo);
        this.red = red;
    }

    public ArrayList<P_comerciales> getComerciales() {
        return comerciales;
    }

    public void setComerciales(ArrayList<P_comerciales> comerciales) {
        this.comerciales = comerciales;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    @Override
    public String toString() {
        String s="";
        s+="Marketing\n";
        s+="Proyectos comerciales: "+comerciales+"\n";
        s+="Red social mas usada: "+red+"\n";
        return super.toString()+s;
    }
    
}
