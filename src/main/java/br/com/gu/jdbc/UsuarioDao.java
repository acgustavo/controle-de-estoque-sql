package br.com.gu.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import br.com.gu.entidade.Usuario;

public class UsuarioDao {
	private Connection connection;

	public UsuarioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Usuario usuario) {
		String sql = "insert into usuarios " + "(nome, email, senha)" + " values (?,?,?)";

		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getSenha());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// removendo!!!!!

	public void remove(Usuario usuario) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("delete from usuarios where id=?");

			stmt.setLong(1, usuario.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}