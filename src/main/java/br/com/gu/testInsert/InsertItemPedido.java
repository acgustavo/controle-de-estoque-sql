package br.com.gu.testInsert;

import java.sql.SQLException;

import br.com.gu.entidade.ItemPedido;
import br.com.gu.jdbc.ItemPedidoDao;

public class InsertItemPedido {

	public static void main(String[] args) throws SQLException {
		
		ItemPedido ip = new ItemPedido(5, 999.88, 1 , 1);
				
		ItemPedidoDao dao = new ItemPedidoDao();
		dao.adiciona(ip);
		System.out.println("Itens pedidos : " + ip.getQuantidade() + " Cadastrado!");
	}
	
}
