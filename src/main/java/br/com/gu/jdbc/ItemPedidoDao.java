package br.com.gu.jdbc;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gu.entidade.ItemPedido;

public class ItemPedidoDao {
	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(ItemPedido itemPedido) {
		manager.getTransaction().begin();
		
		manager.persist(itemPedido);
		
		manager.getTransaction().commit();
	}

	public void altera(ItemPedido itemPedido) {
		manager.getTransaction().begin();
		
		manager.merge(itemPedido);
		
		manager.getTransaction().commit();		
	}

	public void remove(ItemPedido itemPedido) {
		manager.getTransaction().begin();

		manager.remove(itemPedido);
		
		manager.getTransaction().commit();

	}
	
	public List<ItemPedido> todos() {
	  return manager.createQuery("from itens_pedidos", ItemPedido.class).getResultList();
	}

	public List<ItemPedido> ordenadosPeloNome() {
		return manager.createQuery("select c from itens_pedido c order by c.nome", ItemPedido.class).getResultList();
	}	
	
	public ItemPedido porId(Long id) {
		return manager.find(ItemPedido.class, id);
	}

}