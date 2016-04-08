package br.com.gu.testInsert;

import java.sql.SQLException;

import br.com.gu.entidade.Categoria;
import br.com.gu.jdbc.CategoriaDao;

public class InsertCategoria {
	public static void main(String[] args) throws SQLException {

		Categoria eletronico = new Categoria("eletronico");

		CategoriaDao dao = new CategoriaDao();
		dao.adiciona(eletronico);
		System.out.println("Categoria: " + eletronico.getDescricao() + " Cadastrado!");

	}

}
