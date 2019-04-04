package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.dominio.Equipe;

public class EquipeDAO {

	private EntityManager manager = null;

	public EquipeDAO() {
		super();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");

		this.manager = factory.createEntityManager();
	}

	public void incluir(Equipe equipe) {

		this.manager.getTransaction().begin();

		this.manager.persist(equipe);

		this.manager.getTransaction().commit();
	}

	public void fecharConexao() {

		this.manager.close();
	}

	public void alterar(Equipe equipe) {

		this.manager.getTransaction().begin();

		this.manager.merge(equipe);

		this.manager.getTransaction().commit();
	}

	public void remover(Equipe equipe) {

		this.manager.getTransaction().begin();

		this.manager.remove(equipe);

		this.manager.getTransaction().commit();
	}

	public Equipe obter(Integer codigo) {
		
		Equipe retorno = (Equipe) this.manager.find(Equipe.class, codigo);
		return retorno;
	}

	public List<Equipe> obterTodos() {
		List<Equipe> retorno = new ArrayList<Equipe>();
		return retorno;
	}

}