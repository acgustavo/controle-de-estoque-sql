package br.com.gu.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import br.com.gu.entidade.ItemPedido;

public class ItemPedidoDao {
	private Connection connection;

	public ItemPedidoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(ItemPedido itemPedido) {
		String sql = "insert into itens_pedidos " + "(quantidade, valor_unitario, produto_id, pedido_id)" + " values (?,?,?,?)";

		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setLong(1, itemPedido.getQuantidade());
			stmt.setDouble(2, itemPedido.getValorUnitario());
			stmt.setLong(3, itemPedido.getProdutoid());
			stmt.setLong(4, itemPedido.getPedidoid());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// removendo!!!!!

	public void remove(ItemPedido itemPedido) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement("delete from itens_pedidos where id=?");

			stmt.setLong(1, itemPedido.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}