package modelo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tab_estadio")
public class Estadio {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COD_EST")
	@SequenceGenerator(name = "COD_EST", sequenceName = "COD_EST", allocationSize = 1, initialValue = 10000)
	private Integer codigo;
	@Column(name = "nome", length = 50, nullable = false)
	private String nome;
	@Column(name = "capacidade", length = 50, nullable = false)
	private int capacidade;
	@Column(name = "cidade", length = 50, nullable = false)
	private String cidade;

	public Estadio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estadio(Integer codigo, String nome, int capacidade, String cidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.capacidade = capacidade;
		this.cidade = cidade;
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

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}