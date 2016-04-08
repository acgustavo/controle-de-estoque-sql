package br.com.gu.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import br.com.gu.entidade.Produto;

public class ProdutoDao {
	private Connection connection;

	public ProdutoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Produto produto) {
		String sql = "insert into produtos " + "(nome, sku, valor_unitario, quantidade_estoque, categoria_id)" + " values (?,?,?,?,?)";

		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getSku());
			stmt.setDouble(3, produto.getValorUnitario());
			stmt.setDouble(4, produto.getQuantidadeEstoque());
			stmt.setDouble(5, produto.getcId());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// removendo!!!!!

	public void remove(Produto produto) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("delete from produtos where id=?");

			stmt.setLong(1, produto.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}