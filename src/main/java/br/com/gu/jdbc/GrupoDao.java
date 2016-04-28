package br.com.gu.jdbc;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gu.entidade.Grupo;

public class GrupoDao {
	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Grupo grupo) {
		manager.getTransaction().begin();
		
		manager.persist(grupo);
		
		manager.getTransaction().commit();
	}

	public void altera(Grupo grupo) {
		manager.getTransaction().begin();
		
		manager.merge(grupo);
		
		manager.getTransaction().commit();		
	}

	public void remove(Grupo grupo) {
		manager.getTransaction().begin();

		manager.remove(grupo);
		
		manager.getTransaction().commit();

	}
	
	public List<Grupo> todos() {
	  return manager.createQuery("from Grupo", Grupo.class).getResultList();
	}

	public List<Grupo> ordenadosPeloNome() {
		return manager.createQuery("select c from Grupo c order by c.nome", Grupo.class).getResultList();
	}	
	
	public Grupo porId(Long id) {
		return manager.find(Grupo.class, id);
	}

}