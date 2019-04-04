package modelo.dominio;

public class Temporada {
	private String estrutura_temporada;
	private String nome;
	Estrutura_Temporada[] estrutura;
	public Temporada() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Temporada(String estrutura_temporada, String nome, Estrutura_Temporada[] estrutura) {
		super();
		this.estrutura_temporada = estrutura_temporada;
		this.nome = nome;
		this.estrutura = estrutura;
	}
	public String getEstrutura_temporada() {
		return estrutura_temporada;
	}
	public void setEstrutura_temporada(String estrutura_temporada) {
		this.estrutura_temporada = estrutura_temporada;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estrutura_Temporada[] getEstrutura() {
		return estrutura;
	}
	public void setEstrutura(Estrutura_Temporada[] estrutura) {
		this.estrutura = estrutura;
	}
	
}