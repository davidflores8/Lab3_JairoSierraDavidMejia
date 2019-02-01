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
public class ConnectiveLine {
   private ArrayList<Empresas> empresas = new ArrayList();
   private ArrayList<Personas> personas = new ArrayList();
   private ArrayList<Ingresos> ingresos = new ArrayList();

    public ConnectiveLine() {
    }

    public ArrayList<Empresas> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresas> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    public ArrayList<Ingresos> getIngresos() {
        return ingresos;
    }

    public void setIngresos(ArrayList<Ingresos> ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "ConnectiveLine{" + "empresas=" + empresas + ", personas=" + personas + ", ingresos=" + ingresos + '}';
    }
   
}
