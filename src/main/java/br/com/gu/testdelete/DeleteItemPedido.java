package br.com.gu.testdelete;

import br.com.gu.entidade.ItemPedido;
import br.com.gu.jdbc.ItemPedidoDao;

public class DeleteItemPedido {

	public static void main(String[] args) {
		ItemPedidoDao dao = new ItemPedidoDao();

		ItemPedido itemPedido = new ItemPedido(); // dao.buscaPorId(1l);
		itemPedido.setId((long) 1);

		dao.remove(itemPedido);

		System.out.println("item pedido " + itemPedido.getId() + " excluido com sucesso");

	}

}
