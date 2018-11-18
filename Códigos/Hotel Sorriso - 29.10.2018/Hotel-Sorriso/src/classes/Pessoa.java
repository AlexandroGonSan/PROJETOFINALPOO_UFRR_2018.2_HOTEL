package classes;
/**
 * Classe Pessoa responsável em guardar todos os dados pessoais de um Cliente ou Funcionario.
 *
 * @author Markus Kaul
 * @author Gabriel Arcanjo
 * @author Miller Monteiro
 * 
 * @since 28/09/2018
 */

abstract public class Pessoa {
	private String nome;
	private String telefone;
	private String cpf;
	private Integer rg;
	private String dataDeNascimento;
	private String email;
	private String nacionalidade;
	private String genero;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getRg() {
		return rg;
	}
	public void setRg(Integer rg) {
		this.rg = rg;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
