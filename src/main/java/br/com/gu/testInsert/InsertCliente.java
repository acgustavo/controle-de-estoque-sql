package br.com.gu.testInsert;

import java.sql.SQLException;

import br.com.gu.entidade.Cliente;
import br.com.gu.entidade.TipoPessoa;
import br.com.gu.jdbc.ClienteDao;

public class InsertCliente {
	public static void main(String[] args) throws SQLException {
		
		Cliente loja = new Cliente("joaozinho", "joaozinho@orkut.com", "001.000.000-00", TipoPessoa.FISICA);
		
		ClienteDao dao = new ClienteDao();
		dao.adiciona(loja);
		System.out.println("Cliente: " + loja.getNome() + " Cadastrado!");
	}

}
