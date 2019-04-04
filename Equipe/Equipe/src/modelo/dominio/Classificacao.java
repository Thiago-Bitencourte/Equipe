package modelo.dominio;

public class Classificacao {
	private String jogos;
	private String vitorias;
	private String derrotas;
	private String empates;
	public Classificacao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classificacao(String jogos, String vitorias, String derrotas, String empates) {
		super();
		this.jogos = jogos;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	public String getJogos() {
		return jogos;
	}
	public void setJogos(String jogos) {
		this.jogos = jogos;
	}
	public String getVitorias() {
		return vitorias;
	}
	public void setVitorias(String vitorias) {
		this.vitorias = vitorias;
	}
	public String getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(String derrotas) {
		this.derrotas = derrotas;
	}
	public String getEmpates() {
		return empates;
	}
	public void setEmpates(String empates) {
		this.empates = empates;
	}
	
}
