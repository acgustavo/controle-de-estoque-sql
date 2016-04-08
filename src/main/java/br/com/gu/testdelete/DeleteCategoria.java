package br.com.gu.testdelete;

import br.com.gu.entidade.Categoria;
import br.com.gu.jdbc.CategoriaDao;

public class DeleteCategoria {

	public static void main(String[] args) {
		
		 CategoriaDao dao = new CategoriaDao();
		 
		 Categoria categoria = new Categoria(); //dao.buscaPorId(1l);
		 categoria.setId((long) 1);
		 
		 dao.remove(categoria);
		 
		 System.out.println("categoria " + categoria.getId() + " excluido com sucesso");

	}

}
