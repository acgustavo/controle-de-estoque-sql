package br.com.gu.testdelete;

import br.com.gu.entidade.Endereco;
import br.com.gu.jdbc.EnderecoDao;

public class DeleteEndereco {

	public static void main(String[] args) {
		EnderecoDao dao = new EnderecoDao();

		Endereco endereco = new Endereco(); // dao.buscaPorId(1l);
		endereco.setId((long) 1);

		dao.remove(endereco);

		System.out.println("endereco " + endereco.getId() + " excluido com sucesso");

	}

}
