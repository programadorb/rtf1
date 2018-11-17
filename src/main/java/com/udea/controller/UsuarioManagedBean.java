package com.udea.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.udea.utils.Utilidades;
import javax.faces.context.ExternalContext;
import java.io.File;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import java.io.FileInputStream;
import javax.ejb.EJB;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.BarcodeFactory;
import com.udea.ejb.UsuarioEJB;
import org.primefaces.context.RequestContext;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.servlet.http.HttpServletRequest;
import javax.faces.bean.ManagedProperty;
import java.util.Map;
import javax.servlet.http.HttpSession;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;
import java.util.UUID;

@Named(value="UsuarioManagedBean")
@SessionScoped
public class UsuarioManagedBean implements Serializable
{
    private static final long serialVersionUID = 120101L;

    private String email;
    private String password;

    @EJB
    private UsuarioEJB usuarioEJB;

    public void login(){
        System.out.println("va a hacer el login");
    }

    public void registrar(){
        
    }

    public void setEmail(String email){this.email=email;}
    public String getEmail(){return this.email;}

    public void setPassword(String password){this.password=password;}
    public String getPassword(){return this.password;}
}
