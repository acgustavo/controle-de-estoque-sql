package br.com.gu.testInsert;

import br.com.gu.jdbc.Usuario_CategoriaDao;

public class InsertUsuario_categoria {

	public static void main(String[] args) {
		Usuario_CategoriaDao dao = new Usuario_CategoriaDao();
		dao.adiciona(2, 3);
		System.out.println("usuario categoria");

	}

}
