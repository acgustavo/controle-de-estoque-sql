package br.com.gu.test;

import br.com.gu.entidade.Endereco;
import br.com.gu.jdbc.EnderecoDao;

public class Test {
	public static void main(String[] args) {
		Endereco end = new Endereco("end", " 21" , " ewfwe ", " vdc ", " ba ", " 45000000 ");
		EnderecoDao dao = new EnderecoDao();
		dao.adiciona(end);
	}
}