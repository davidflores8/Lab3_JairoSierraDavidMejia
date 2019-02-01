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
public class Administrador extends Personas {
    private String usuario;
    private String contrasena;

    public Administrador() {
    }

    public Administrador(String usuario, String contrasena, int id, String correo) {
        super(id, correo);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        String s="";
        s+="Administrador\n";
        s+="Usuario: "+usuario+"\n";
        s+="Contraseña: "+contrasena+"\n";
        return super.toString()+s;
    }
    
    
}
