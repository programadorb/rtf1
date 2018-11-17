package com.udea.ejb;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.List;
import java.util.Map;
import javax.ejb.Local;

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
}
