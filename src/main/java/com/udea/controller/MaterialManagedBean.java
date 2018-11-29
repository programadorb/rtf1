package com.udea.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.udea.ejb.MaterialEJB;
import com.udea.model.Material;

import org.primefaces.context.RequestContext;

@Named(value="MaterialManagedBean")
@SessionScoped
public class MaterialManagedBean implements Serializable
{
    private static final long serialVersionUID = 120101L;

    private String nombre;
    private String descripcion;
    private String autor;
    private String valor;
    private String rutaArchivo="http://localhost:8080/matedu/faces/book.pdf";

    private List<Material> listaMaterial;
    int indice = 1;
    @EJB
    private MaterialEJB materialEJB;

    public void buscar(){
        try{
//if(!FacesContext.getCurrentInstance().isPostback()){
                listaMaterial=materialEJB.getMateriales();
//}
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void guardarMaterial() {
        System.out.println("va a guaradr el mateiral");
        Material m = new Material();
        m.setNombre(nombre);
        m.setDescripcion(descripcion);
        m.setAutor(autor);
        m.setValor(valor);
        m.setRutaArchivo(rutaArchivo+(indice++%5+1));
        materialEJB.guardar(m);
        System.out.println("termino de guardar el material");
        buscar();
        nombre="";
        autor="";
        valor="";
        descripcion="";
    }

    public void ejecutarScript(String script){
        RequestContext.getCurrentInstance().execute(script);
    }

    public void llenarListaMaterial(){
        listaMaterial=materialEJB.getMateriales();
    }


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

    public List<Material> getListaMaterial(){return this.listaMaterial;}
}

