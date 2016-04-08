package br.com.gu.testdelete;

import br.com.gu.jdbc.Usuario_CategoriaDao;

public class DeleteUsuario_Categoria {

	public static void main(String[] args) {
		Usuario_CategoriaDao dao = new Usuario_CategoriaDao();

		dao.remove(1, 3);

		System.out.println("id 1,3 excluido com sucesso");

	}

}
