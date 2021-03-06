package com.udea.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String password;
    
    public Usuario(){}



    public void setId(Long id){this.id=id;}
    public Long getId(){return this.id;}


    public void setNombre(String nombre){this.nombre=nombre;}
    public String getNombre(){return this.nombre;}


    public void setEmail(String email){this.email=email;}
    public String getEmail(){return this.email;}


    public void setPassword(String password){this.password=password;}
    public String getPassword(){return this.password;}

}