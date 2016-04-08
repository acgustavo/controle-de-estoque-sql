package br.com.gu.testInsert;

import java.sql.SQLException;

import br.com.gu.entidade.Produto;
import br.com.gu.jdbc.ProdutoDao;

public class InsertProduto {
	public static void main(String[] args) throws SQLException {

		Produto tv = new Produto("TV", "xxxxxxxxxxxx", 997.09, 50);
		tv.setcId(1);

		ProdutoDao dao = new ProdutoDao();
		dao.adiciona(tv);
		System.out.println("Produto: " + tv.getNome() + " Cadastrado!");

	}
}
