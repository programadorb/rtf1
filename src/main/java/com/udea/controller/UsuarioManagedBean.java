package com.udea.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.udea.ejb.UsuarioEJB;
import com.udea.model.Usuario;

@Named(value="UsuarioManagedBean")
@SessionScoped
public class UsuarioManagedBean implements Serializable
{
    private static final long serialVersionUID = 120101L;

    private String email;
    private String nombre;
    private String password;
    private String mensaje;

    @EJB
    private UsuarioEJB usuarioEJB;

    public void login() {   
        mensaje = "";
        if (usuarioEJB.login(email, password)) {
            System.out.println("el login fue exitoso");
            redireccionar("/matedu/faces/index.xhtml");
        }else{
            System.out.println("el login fue fallido");
            mensaje = "Credenciales incorrectas";
        }
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void registrar() {
        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setEmail(email);
        u.setPassword(password);
        usuarioEJB.registrar(u);
        System.out.println("usuario registrado");
        redireccionar("/matedu/faces/index.xhtml");
    }

    public void redireccionar(String url) {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(url);
        } catch (Exception e) {e.printStackTrace();}
    }

    protected void info(String msg){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, ""));
    }

    public void setEmail(String email){this.email=email;}
    public String getEmail(){return this.email;}

    public void setPassword(String password){this.password=password;}
    public String getPassword(){return this.password;}

    public void setNombre(String nombre){this.nombre=nombre;}
    public String getNombre(){return this.nombre;}
}
