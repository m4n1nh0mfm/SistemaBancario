/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDProjeto;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mariano
 */
@Stateless
public class MoveBancoFacade extends AbstractFacade<MoveBanco> {

    @PersistenceContext(unitName = "ProjetoWebIIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MoveBancoFacade() {
        super(MoveBanco.class);
    }
    
}
