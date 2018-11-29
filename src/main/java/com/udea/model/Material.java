package com.udea.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String autor;
    private String valor;
    private String rutaArchivo;
    
    public Material(){}    



    public void setId(Long id){this.id=id;}
    public Long getId(){return this.id;}


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