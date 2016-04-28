package br.com.gu.jdbc;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gu.entidade.Pedido;

public class PedidoDao {
	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Pedido pedido) {
		manager.getTransaction().begin();
		
		manager.persist(pedido);
		
		manager.getTransaction().commit();
	}

	public void altera(Pedido pedido) {
		manager.getTransaction().begin();
		
		manager.merge(pedido);
		
		manager.getTransaction().commit();		
	}

	public void remove(Pedido pedido) {
		manager.getTransaction().begin();

		manager.remove(pedido);
		
		manager.getTransaction().commit();

	}
	
	public List<Pedido> todos() {
	  return manager.createQuery("from Pedido", Pedido.class).getResultList();
	}

	
	public List<Pedido> ordenadosPeloNome() {
		return manager.createQuery("select p from pedidos p order by p.nome", Pedido.class).getResultList();
	}	
	
	public Pedido porId(Long id) {
		return manager.find(Pedido.class, id);
	}

}