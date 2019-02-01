/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_jairosierra.davidmejia;

/**
 *
 * @author Jairo Sierra
 */
public class Personas {
    protected int id;
    protected String correo;

    public Personas() {
    }

    public Personas(int id, String correo) {
        this.id = id;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        String s="";
        s+="Personas+\n";
        s+="ID: "+id+"\n";
        s+="Correo: "+correo+"\n";
        return s;
    }
    
}
