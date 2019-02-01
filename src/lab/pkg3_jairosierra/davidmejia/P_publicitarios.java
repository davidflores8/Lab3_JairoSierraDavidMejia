/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_jairosierra.davidmejia;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jairo Sierra
 */
public class P_publicitarios extends Proyectos {
    private ArrayList<Freelance> persona = new ArrayList();

    public P_publicitarios() {
    }

    public P_publicitarios(String nombre, String empresa, String precio, String estado, String descripcion, Date inicio, Date entrega) {
        super(nombre, empresa, precio, estado, descripcion, inicio, entrega);
    }

    public ArrayList<Freelance> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Freelance> persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Proyectos publicitarios{" + "persona=" + persona + '}';
    }
    
}
