package modelo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tab_equipe")
public class Equipe {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COD_EQUIPE")
	@SequenceGenerator(name = "COD_EQUIPE", sequenceName = "COD_EQUIPE", allocationSize = 1, initialValue = 10000)
	private Integer codigo;
	@Column(name = "nome", length = 50, nullable=false)
	private String nome;
	@Column(name = "fundacao", length = 50, nullable=false)
	private String fundacao;
	@Column(name = "cidade", length = 50, nullable=false)
	private String cidade;
	@Column(name = "pais", length = 50, nullable=false)
	private String pais;
	@Column(name = "tecnico", length = 50, nullable=false)
	private String tecnico;
	@ManyToOne
	private Estadio tab_estadio;
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equipe(Integer codigo, String nome, String fundacao, String cidade, String pais, String tecnico) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.fundacao = fundacao;
		this.cidade = cidade;
		this.pais = pais;
		this.tecnico = tecnico;
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

	public String getFundacao() {
		return fundacao;
	}

	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

}