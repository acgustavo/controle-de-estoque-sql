package br.com.gu.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import br.com.gu.entidade.Endereco;

public class EnderecoDao {
	private Connection connection;

	public EnderecoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Endereco endereco) {
		String sql = "insert into enderecos " + "(logradouro, numero, complemento, cidade, uf, cep)"
				+ " values (?,?,?,?,?,?)";

		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, endereco.getLogradouro());
			stmt.setString(2, endereco.getNumero());
			stmt.setString(3, endereco.getComplemento());
			stmt.setString(4, endereco.getCidade());
			stmt.setString(5, endereco.getUf());
			stmt.setString(6, endereco.getCep());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// removendo!!!!!

	public void remove(Endereco endereco) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("delete from enderecos where id=?");

			stmt.setLong(1, endereco.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}