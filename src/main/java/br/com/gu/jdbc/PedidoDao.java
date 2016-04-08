package br.com.gu.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import br.com.gu.entidade.Pedido;

public class PedidoDao {
	private Connection connection;

	public PedidoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Pedido pedido) {
		String sql = "insert into pedidos "
				+ "(data_criacao, observacao, data_entrega, valor_frete, valor_desconto, valor_total, status_pedido, usuario_id, cliente_id, endereco_id)"
				+ " values (?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, pedido.getDataCriacao());
			stmt.setString(2, pedido.getObservacao());
			stmt.setString(3, pedido.getDataEntrega());
			stmt.setDouble(4, pedido.getValorFrete());
			stmt.setDouble(5, pedido.getValorDesconto());
			stmt.setDouble(6, pedido.getValorTotal());
			stmt.setString(7, (pedido.getStatus().toString()));
			stmt.setLong(8, pedido.getUsuarioid());
			stmt.setLong(9, pedido.getClienteid());
			stmt.setLong(10, pedido.getEnderecoid());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// removendo!!!!!

	public void remove(Pedido pedido) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("delete from pedidos where id=?");

			stmt.setLong(1, pedido.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}