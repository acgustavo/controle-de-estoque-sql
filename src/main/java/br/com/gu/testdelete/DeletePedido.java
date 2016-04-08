package br.com.gu.testdelete;

import br.com.gu.entidade.Pedido;
import br.com.gu.jdbc.PedidoDao;

public class DeletePedido {

	public static void main(String[] args) {
		PedidoDao dao = new PedidoDao();

		Pedido pedido = new Pedido(); // dao.buscaPorId(1l);
		pedido.setId((long) 1);

		dao.remove(pedido);

		System.out.println("Pedido " + pedido.getId() + " excluido com sucesso");

	}

}
