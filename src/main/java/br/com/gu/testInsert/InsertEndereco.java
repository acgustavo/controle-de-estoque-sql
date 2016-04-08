package br.com.gu.testInsert;

import java.sql.SQLException;

import br.com.gu.entidade.Endereco;
import br.com.gu.jdbc.EnderecoDao;

public class InsertEndereco {
	public static void main(String[] args) throws SQLException {
		
		Endereco rua = new Endereco("logRADourO", "60", "COMpleMENto", "vitoria da conquista", "BA", "45000.000");
		
		EnderecoDao dao = new EnderecoDao();
		dao.adiciona(rua);
		System.out.println("Endereco: " + rua.getLogradouro() + " Cadastrado!");
		
	}

}
