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
public class Ingresos {
    private ArrayList<Empresas> empresa=new ArrayList();
    private ArrayList<Freelance> persona = new ArrayList();
    private String dinero;

    public Ingresos() {
    }

    public Ingresos(String dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Empresas> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ArrayList<Empresas> empresa) {
        this.empresa = empresa;  
    }

    public ArrayList<Freelance> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Freelance> persona) {
        this.persona = persona;
    }

    public String getDinero() {
        return dinero;
    }

    public void setDinero(String dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Ingresos{" + "empresa=" + empresa + ", persona=" + persona + ", dinero=" + dinero + '}';
    }
    
}
