package br.com.gu.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import br.com.gu.entidade.Categoria;

public class CategoriaDao {
	private Connection connection;

	public CategoriaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	//adicionando !!!!!
	public void adiciona(Categoria categoria) {
		String sql = "insert into categorias " + "(descricao)" + " values (?)";

		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);

			stmt.setString(1, categoria.getDescricao());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//removendo!!!!!
	
	public void remove(Categoria categoria) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("delete from categorias where id=?");
			
			stmt.setLong(1, categoria.getId());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
