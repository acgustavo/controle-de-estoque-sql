package br.com.gu.testdelete;

import br.com.gu.entidade.Grupo;
import br.com.gu.jdbc.GrupoDao;

public class DeleteGrupo {

	public static void main(String[] args) {
		GrupoDao dao = new GrupoDao();

		Grupo grupo = new Grupo(); // dao.buscaPorId(1l);
		grupo.setId((long) 1);

		dao.remove(grupo);

		System.out.println("grupo " + grupo.getId() + " excluido com sucesso");

	}

}
