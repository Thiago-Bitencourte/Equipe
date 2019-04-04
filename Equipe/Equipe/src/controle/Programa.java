package controle;

import modelo.dao.EquipeDAO;
import modelo.dao.EstadioDAO;
import modelo.dominio.Equipe;
import modelo.dominio.Estadio;

public class Programa {

	public static void main(String[] args) {

		testarEquipe();
		testarLeituraEquipe();
		testarEstadio();
		testarLeituraEstadio();

	}

	public static void testarEstadio() {
		Estadio est1 = new Estadio(null, "Camp Nou", 99354, "Cidade de Barcelona");
		Estadio est2 = new Estadio(null, "Estádio Santiago Bernabéu", 81044, "Madrid");
		Estadio est3 = new Estadio(null, "Estádio Teddy Kollek", 34000, "Jerusalem");
		EstadioDAO dao = new EstadioDAO();
		dao.incluir(est1);
		dao.incluir(est2);
		dao.incluir(est3);
	}

	public static void testarLeituraEstadio() {
		EstadioDAO dao = new EstadioDAO();
		Estadio est1 = dao.obter(1);
		Estadio est2 = dao.obter(2);
		Estadio est3 = dao.obter(3);
		System.out.println("Estadio: " + est1.getCodigo() + " - " + est1.getNome() + " - " + est1.getCapacidade()
				+ " - " + est1.getCidade());
		System.out.println("Estadio: " + est2.getCodigo() + " - " + est2.getNome() + " - " + est2.getCapacidade()
				+ " - " + est2.getCidade());
		System.out.println("Estadio: " + est3.getCodigo() + " - " + est3.getNome() + " - " + est3.getCapacidade()
				+ " - " + est3.getCidade());
	}

	private static void testarEquipe() {
		// TODO Auto-generated method stub
		Equipe ep1 = new Equipe(null, "Futbol Club Barcelona", "	29 de novembro de 1899", "Cidade de Barcelona",
				"Espanha", "Luis Enrique");
		Equipe ep2 = new Equipe(null, "Real Madrid Club de Fútbol", "6 de março de 1902", "Madri", "Espanha",
				"Zinedine Zidane");
		Equipe ep3 = new Equipe(null, "Beitar Jerusalem FC", "1 de Janeiro de 1936", "Jerusalem", "Israel",
				" Ran Ben Shimon");
		EquipeDAO dao = new EquipeDAO();
		dao.incluir(ep1);
		dao.incluir(ep2);
		dao.incluir(ep3);
		dao.fecharConexao();
	}

	private static void testarLeituraEquipe() {
		// TODO Auto-generated method stub
		EquipeDAO dao = new EquipeDAO();
		Equipe ep1 = dao.obter(1);
		Equipe ep2 = dao.obter(2);
		Equipe ep3 = dao.obter(3);
		System.out.println("Equipe: " + ep1.getCodigo() + " - " + ep1.getNome() + " - " + ep1.getFundacao() + " - "
				+ ep1.getCidade() + " - " + ep1.getPais() + " - " + ep1.getTecnico());

		System.out.println("Equipe: " + ep2.getCodigo() + " - " + ep2.getNome() + " - " + ep2.getFundacao() + " - "
				+ ep2.getCidade() + " - " + ep2.getPais() + " - " + ep2.getTecnico());
		System.out.println("Equipe: " + ep3.getCodigo() + " - " + ep3.getNome() + " - " + ep3.getFundacao() + " - "
				+ ep3.getCidade() + " - " + ep3.getPais() + " - " + ep3.getTecnico());

	}

}
