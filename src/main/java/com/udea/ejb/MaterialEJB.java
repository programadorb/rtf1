package com.udea.ejb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.udea.model.Material;

@Stateless
@LocalBean
public class MaterialEJB implements Serializable {
    private static final long serialVersionUID = 321321321L;

    @PersistenceContext
    private EntityManager em;

    @PostConstruct
    public void init(){
        System.out.println("inicio el ejb");
    }

    public void guardar(Material material){
        if(material.getId()!=null)
            em.persist(material);
        else
            em.merge(material);
    }

    public List<Material> getMateriales(){
        return em.createQuery("select m from Material m").getResultList();
    }

    public Material getMaterial(Long id){
        return em.createQuery("select m from Material m where m.id = :id", Material.class)
            .setParameter("id",id)
            .getResultList()
            .get(0);
    }
}
