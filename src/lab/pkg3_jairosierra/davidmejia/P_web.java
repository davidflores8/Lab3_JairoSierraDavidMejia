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
public class P_web extends Proyectos {
    private ArrayList<Desarrollador> desarrollado = new ArrayList();

    public P_web() {
    }

    public P_web(String nombre, String empresa, String precio, String estado, String descripcion, Date inicio, Date entrega) {
        super(nombre, empresa, precio, estado, descripcion, inicio, entrega);
    }

    public ArrayList<Desarrollador> getDesarrollado() {
        return desarrollado;
    }

    public void setDesarrollado(ArrayList<Desarrollador> desarrollado) {
        this.desarrollado = desarrollado;
    }

    @Override
    public String toString() {
        return super.toString()+"P_web{" + "desarrollado=" + desarrollado + '}';
    }
    
}
