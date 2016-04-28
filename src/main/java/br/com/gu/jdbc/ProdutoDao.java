package br.com.gu.jdbc;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gu.entidade.Produto;

public class ProdutoDao {
	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Produto produto) {
		manager.getTransaction().begin();
		
		manager.persist(produto);
		
		manager.getTransaction().commit();
	}

	public void altera(Produto produto) {
		manager.getTransaction().begin();
		
		manager.merge(produto);
		
		manager.getTransaction().commit();		
	}

	public void remove(Produto produto) {
		manager.getTransaction().begin();

		manager.remove(produto);
		
		manager.getTransaction().commit();

	}
	
	public List<Produto> todos() {
	  return manager.createQuery("from Produto", Produto.class).getResultList();
	}

	public List<Produto> ordenadosPeloNome() {
		return manager.createQuery("select c from Produto c order by c.nome", Produto.class).getResultList();
	}	
	
	public Produto porId(Long id) {
		return manager.find(Produto.class, id);
	}

}