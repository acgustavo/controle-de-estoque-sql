package br.com.gu.jdbc;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gu.entidade.Cliente;

public class ClienteDao {
	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Cliente cliente) {
		manager.getTransaction().begin();
		
		manager.persist(cliente);
		
		manager.getTransaction().commit();
	}

	public void altera(Cliente cliente) {
		manager.getTransaction().begin();
		
		manager.merge(cliente);
		
		manager.getTransaction().commit();		
	}

	public void remove(Cliente cliente) {
		manager.getTransaction().begin();

		manager.remove(cliente);
		
		manager.getTransaction().commit();

	}
	
	public List<Cliente> todos() {
	  return manager.createQuery("from Cliente", Cliente.class).getResultList();
	}

	public List<Cliente> ordenadosPeloNome() {
		return manager.createQuery("select c from Cliente c order by c.nome", Cliente.class).getResultList();
	}	
	
	public Cliente porId(Long id) {
		return manager.find(Cliente.class, id);
	}

}