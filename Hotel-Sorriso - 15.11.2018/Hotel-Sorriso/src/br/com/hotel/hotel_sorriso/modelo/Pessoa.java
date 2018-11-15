package br.com.hotel.hotel_sorriso.modelo;

import java.io.Serializable;

/**
 *
 * @author Markus Kaul
 * @author Gabriel Arcanjo
 * @author Miller Monteiro
 * 
 * @since 28/09/2018
 */

abstract public class Pessoa implements Serializable{
	
	/**
	 * Classe Pessoa responsável em guardar todos os dados pessoais de um Cliente ou Funcionario (gerente ou recepcionista).
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String telefone;
	private String cpf;
	private Integer rg;
	private String dataDeNascimento;
	private String email;
	private String nacionalidade;
	private String genero;
	
	/**
	 * Método que retorna o nome da pessoa.
	 * @return String nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Método que indica o nome da pessoa
	 * @param String nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Método que retorna o telefone da pessoa.
	 * @return String telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	
	/**
	 * Método que indica o telefone da pessoa
	 * @param String telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/**
	 * Método que retorna o cpf da pessoa.
	 * @return String cpf
	 */
	public String getCpf() {
		return cpf;
	}
	
	/**
	 * Método que indica o cpf da pessoa
	 * @param String cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * Método que retorna o rg da pessoa.
	 * @return Integer rg
	 */
	public Integer getRg() {
		return rg;
	}
	
	/**
	 * Método que indica o rg da pessoa
	 * @param Integer rg
	 */
	public void setRg(Integer rg) {
		this.rg = rg;
	}
	
	/**
	 * Método que retorna a data de nascimento da pessoa.
	 * @return String dataDeNascimento
	 */
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	/**
	 * Método que indica a data de nascimento da pessoa
	 * @param String dataDeNascimento
	 */
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	/**
	 * Método que retorna o email da pessoa.
	 * @return String email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Método que indica o email da pessoa
	 * @param String email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Método que retorna a nacionalidade da pessoa.
	 * @return String nacionalidade
	 */
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	/**
	 * Método que indica a nacionalidade da pessoa
	 * @param String nacionalidade
	 */
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	/**
	 * Método que retorna o genero da pessoa.
	 * @return String genero
	 */
	public String getGenero() {
		return genero;
	}
	
	/**
	 * Método que indica o genero da pessoa
	 * @param String genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
