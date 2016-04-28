package br.com.gu.jdbc;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gu.entidade.Usuario;

public class UsuarioDao {
	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Usuario usuario) {
		manager.getTransaction().begin();
		
		manager.persist(usuario);
		
		manager.getTransaction().commit();
	}

	public void altera(Usuario usuario) {
		manager.getTransaction().begin();
		
		manager.merge(usuario);
		
		manager.getTransaction().commit();		
	}

	public void remove(Usuario usuario) {
		manager.getTransaction().begin();

		manager.remove(usuario);
		
		manager.getTransaction().commit();

	}
	
	public List<Usuario> todos() {
	  return manager.createQuery("from Usuario", Usuario.class).getResultList();
	}

	public List<Usuario> ordenadosPeloNome() {
		return manager.createQuery("select c from Usuario c order by c.nome", Usuario.class).getResultList();
	}	
	
	public Usuario porId(Long id) {
		return manager.find(Usuario.class, id);
	}

}