package br.com.gu.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import br.com.gu.entidade.Grupo;

public class GrupoDao {
	private Connection connection;

	public GrupoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Grupo grupo) {
		String sql = "insert into grupos " + "(nome, descricao)" + " values (?,?)";

		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, grupo.getNome());
			stmt.setString(2, grupo.getDescricao());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// removendo!!!!!

	public void remove(Grupo grupo) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("delete from grupos where id=?");

			stmt.setLong(1, grupo.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}