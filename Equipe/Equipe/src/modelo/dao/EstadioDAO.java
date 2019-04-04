package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.dominio.Estadio;

public class EstadioDAO {
	private EntityManager manager = null;

	public EstadioDAO() {
		super();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");

		this.manager = factory.createEntityManager();
	}

	public void incluir(Estadio estadio) {

		this.manager.getTransaction().begin();

		this.manager.persist(estadio);

		this.manager.getTransaction().commit();
	}

	public void fecharConexao() {

		this.manager.close();
	}

	public void alterar(Estadio estadio) {

		this.manager.getTransaction().begin();

		this.manager.merge(estadio);

		this.manager.getTransaction().commit();
	}

	public void remover(Estadio estadio) {

		this.manager.getTransaction().begin();

		this.manager.remove(estadio);

		this.manager.getTransaction().commit();
	}

	public Estadio obter(Integer codigo) {
		
		Estadio retorno = (Estadio) this.manager.find(Estadio.class, codigo);
		return retorno;
	}

	public List<Estadio> obterTodos() {
		List<Estadio> retorno = new ArrayList<Estadio>();
		return retorno;
	}


}
