package br.com.gu.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import br.com.gu.entidade.Cliente;

public class ClienteDao {
	private Connection connection;

	public ClienteDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Cliente cliente) {
		String sql = "insert into Clientes" + "(nome, documento_receita_federal, email, tipo)" + " values (?,?,?,?)";

		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getDocumentoReceitaFederal());
			stmt.setString(3, cliente.getEmail());
			stmt.setString(4, (cliente.getTipo().toString()));

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// removendo!!!!!

	public void remove(Cliente cliente) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("delete from clientes where id=?");

			stmt.setLong(1, cliente.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}