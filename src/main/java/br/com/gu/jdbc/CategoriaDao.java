package br.com.gu.jdbc;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gu.entidade.Categoria;

public class CategoriaDao {
	EntityManager manager = new JPAUtil().getEntityManager();
	
	public void adiciona(Categoria categoria) {
		manager.getTransaction().begin();
		
		manager.persist(categoria);
		
		manager.getTransaction().commit();
	}

	public void altera(Categoria categoria) {
		manager.getTransaction().begin();
		
		manager.merge(categoria);
		
		manager.getTransaction().commit();		
	}

	public void remove(Categoria categoria) {
		manager.getTransaction().begin();

		manager.remove(categoria);
		
		manager.getTransaction().commit();

	}
	
	public List<Categoria> todos() {
	  return manager.createQuery("from Categoria", Categoria.class).getResultList();
	}

	public List<Categoria> ordenadosPeloNome() {
		return manager.createQuery("select c from Categoria c order by c.nome", Categoria.class).getResultList();
	}	
	
	public Categoria porId(Long id) {
		return manager.find(Categoria.class, id);
	}

	
}
