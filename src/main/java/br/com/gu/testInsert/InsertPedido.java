package br.com.gu.testInsert;

import java.sql.SQLException;
import java.util.Date;

import br.com.gu.entidade.Pedido;
import br.com.gu.entidade.StatusPedido;
import br.com.gu.jdbc.PedidoDao;

public class InsertPedido {
	public static void main(String[] args) throws SQLException {

		Pedido pe = new Pedido(new Date(), "obssss", 21, 134.09, 5.06, StatusPedido.EMITIDO, 2, 2, 2);
	
		PedidoDao dao = new PedidoDao();
		dao.adiciona(pe);
		System.out.println("Pedido: " + pe.getObservacao() + " Cadastrado!");

	}
}
