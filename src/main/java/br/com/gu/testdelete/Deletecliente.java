package br.com.gu.testdelete;

import br.com.gu.entidade.Cliente;
import br.com.gu.jdbc.ClienteDao;

public class Deletecliente {

	public static void main(String[] args) {
		ClienteDao dao = new ClienteDao();
		 
		 Cliente cliente = new Cliente(); //dao.buscaPorId(1l);
		 cliente.setId((long) 1);
		 
		 dao.remove(cliente);
		 
		 System.out.println("cliente " + cliente.getId() + " excluido com sucesso");

	}

}
