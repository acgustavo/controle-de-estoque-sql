package br.com.gu.testdelete;

import br.com.gu.entidade.Usuario;
import br.com.gu.jdbc.UsuarioDao;

public class DeleteUsuario {

	public static void main(String[] args) {
		UsuarioDao dao = new UsuarioDao();

		Usuario usuario = new Usuario();// dao.buscaPorId(1l);
		usuario.setId((long) 1);

		dao.remove(usuario);

		System.out.println("Contato " + usuario.getId() + " excluido com sucesso");

	}

}
