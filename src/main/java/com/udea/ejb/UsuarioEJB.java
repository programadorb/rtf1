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
import com.udea.model.Usuario;

@Stateless
@LocalBean
public class UsuarioEJB implements Serializable {
    private static final long serialVersionUID = 321321321L;

    @PersistenceContext
    private EntityManager em;

    @PostConstruct
    public void init(){
        System.out.println("inicio el ejb");
    }

    public void registrar(Usuario usuario){
        em.persist(usuario);
    }

    public void acutalizarDatosUsaurio(Usuario usuario){
        em.merge(usuario);
    }

    public boolean login(String email, String password){
        return !em.createQuery("select u from Usuario where u.email = :email and u.password=:password").getResultList().isEmpty();
    }
}
