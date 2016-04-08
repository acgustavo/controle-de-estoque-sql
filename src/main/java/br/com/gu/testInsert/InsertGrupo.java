package br.com.gu.testInsert;

import java.sql.SQLException;

import br.com.gu.entidade.Grupo;
import br.com.gu.jdbc.GrupoDao;

public class InsertGrupo {

	public static void main(String[] args) throws SQLException {

		Grupo vendas = new Grupo("administrador", "grupo administrador");

		GrupoDao dao = new GrupoDao();
		dao.adiciona(vendas);
		System.out.println("grupo: " + vendas.getNome() + " Cadastrado!");
	}

}
