package modelo.dominio;

public class Jogador {
private String nome;
private String nacionalidade;
private String posicao;
public Jogador() {
	super();
	// TODO Auto-generated constructor stub
}
public Jogador(String nome, String nacionalidade, String posicao) {
	super();
	this.nome = nome;
	this.nacionalidade = nacionalidade;
	this.posicao = posicao;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getNacionalidade() {
	return nacionalidade;
}
public void setNacionalidade(String nacionalidade) {
	this.nacionalidade = nacionalidade;
}
public String getPosicao() {
	return posicao;
}
public void setPosicao(String posicao) {
	this.posicao = posicao;
}

}
