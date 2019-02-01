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
public class Desarrollador extends Freelance{
    private String lenguaje;
    private String universidad;
    private String idioma;
    private ArrayList<P_web> proyecto=new ArrayList();

    public Desarrollador() {
    }

    public Desarrollador(String lenguaje, String universidad, String idioma, String nombre, String contrasena, String genero, int edad, double dinero, String ciudad, String telefono, int id, String correo) {
        super(nombre, contrasena, genero, edad, dinero, ciudad, telefono, id, correo);
        this.lenguaje = lenguaje;
        this.universidad = universidad;
        this.idioma = idioma;
    }

   

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<P_web> getProyecto() {
        return proyecto;
    }

    public void setProyecto(ArrayList<P_web> proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        String s="";
        s+="Desarrador\n";
        s+="Lenguaje"+lenguaje+"\n";
        s+="Universidad"+universidad+"\n";
        s+="Idioma"+idioma+"\n";
        s+="Proyecto"+proyecto+"\n";
        return super.toString()+s;
    }
    
    
    
}
