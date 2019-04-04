package modelo.dominio;

public class Campeonato {

	private Integer codigo;

	private String nome;

	private String pais;

	private String tipo;

	public Campeonato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Campeonato(Integer codigo, String nome, String pais, String tipo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.pais = pais;
		this.tipo = tipo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
