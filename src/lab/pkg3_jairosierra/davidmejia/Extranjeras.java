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
public class Extranjeras extends Empresas {
    private String pais;
    private String ciudad;
    private String pagina;

    public Extranjeras() {
    }

    public Extranjeras(String pais, String ciudad, String pagina, String nombre, String telefono, String correo, String contrasena, String descripcion) {
        super(nombre, telefono, correo, contrasena, descripcion);
        this.pais = pais;
        this.ciudad = ciudad;
        this.pagina = pagina;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    @Override
    public String toString() {
        return super.toString()+"Extranjeras{" + "pais=" + pais + ", ciudad=" + ciudad + ", pagina web=" + pagina + '}';
    }
    
}
