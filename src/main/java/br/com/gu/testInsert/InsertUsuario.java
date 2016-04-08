package br.com.gu.testInsert;

import java.sql.SQLException;

import br.com.gu.entidade.Usuario;
import br.com.gu.jdbc.UsuarioDao;

public class InsertUsuario {
	public static void main(String[] args) throws SQLException {

		Usuario gustavo = new Usuario("guga", "GUGA@fainor.com", "983210");

		UsuarioDao dao = new UsuarioDao();
		dao.adiciona(gustavo);
		System.out.println("usuario: " + gustavo.getNome() + " Cadastrado!");
	
	}

}
