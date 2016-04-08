package br.com.gu.testdelete;

import br.com.gu.entidade.Produto;
import br.com.gu.jdbc.ProdutoDao;

public class DeleteProduto {

	public static void main(String[] args) {
		ProdutoDao dao = new ProdutoDao();

		Produto produto = new Produto(); // dao.buscaPorId(1l);
		produto.setId((long) 1);

		dao.remove(produto);

		System.out.println("produto " + produto.getId() + " excluido com sucesso");

	}

}
