package br.com.gu.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Usuario_CategoriaDao {

	private Connection connection;

	public Usuario_CategoriaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(long idgrupo, long idusuario) {
		String sql = "insert into grupo_usuario " + "(grupo_id, usuario_id)" + " values (?,?)";

		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setLong(1, idgrupo);
			stmt.setLong(2, idusuario);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// removendo!!!!!

	public void remove(long idgrupo, long idusuario) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement("delete from grupo_usuario where grupo_id = ? and usuario_id = ?");

			stmt.setLong(1, idgrupo);
			stmt.setLong(2, idusuario);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
