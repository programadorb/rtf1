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
import com.udea.ejb.MaterialEJB;
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

@Named(value="MaterialManagedBean")
@SessionScoped
public class MaterialManagedBean implements Serializable
{
    private static final long serialVersionUID = 120101L;

    private String nombre;
    private String descripcion;
    private String autor;
    private String valor;
    private String rutaArchivo;

    @EJB
    private MaterialEJB materialEJB;


    public void setNombre(String nombre){this.nombre=nombre;}
    public String getNombre(){return this.nombre;}


    public void setDescripcion(String descripcion){this.descripcion=descripcion;}
    public String getDescripcion(){return this.descripcion;}


    public void setAutor(String autor){this.autor=autor;}
    public String getAutor(){return this.autor;}


    public void setValor(String valor){this.valor=valor;}
    public String getValor(){return this.valor;}


    public void setRutaArchivo(String rutaArchivo){this.rutaArchivo=rutaArchivo;}
    public String getRutaArchivo(){return this.rutaArchivo;}

}
