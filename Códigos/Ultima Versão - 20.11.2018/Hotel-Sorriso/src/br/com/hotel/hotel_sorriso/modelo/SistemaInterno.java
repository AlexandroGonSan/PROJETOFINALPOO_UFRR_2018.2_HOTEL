package br.com.hotel.hotel_sorriso.modelo;

import java.io.File;

/**
*
* @author Markus Kaul
* @author Gabriel Arcanjo
* @author Miller Monteiro
* 
* @since 28/09/2018
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SistemaInterno implements Serializable{
	/**
	 * Classe relativa ao controle dos clientes e quartos disponiveis
	 */
	private static final long serialVersionUID = 1L;
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	public ArrayList<Recepcionista> funcionarios = new ArrayList<Recepcionista>();
	public int i;
	
	
	public static Recepcionista usuarioLogado;
	/**
	 * Método resposavel por checar o login do recepcionista
	 * @param login - identificador do recepcionista
	 * @param senha - senha do sistma do recepcinista
	 * @return Repcionista ou null para caso ele não encontre
	 */
	
	public Recepcionista checkLoginrecepcionista(String login, String senha){
		
		System.out.println("Login = " + login + " Senha = " + senha);
		for(i=0;i<this.funcionarios.size();i++){
			System.out.println("Tem funcionarios! | Q = " + funcionarios.size());
			if(login.equals(this.funcionarios.get(i).getIdentificador()) && senha.equals(this.funcionarios.get(i).getSenhaDeAcesso()))
				return this.funcionarios.get(i);
		}
		return null;
	}
	/**
	 * Método resposavel por ler no arquivo de clientes cadastrados
	 */
	@SuppressWarnings("unchecked")
	public void lerArquivo() {
		try {
			File arq = new File("Clients.ser");
			FileInputStream fin = new FileInputStream(arq);
			ObjectInputStream ois = new ObjectInputStream(fin);
			this.clientes = (ArrayList<Cliente>) ois.readObject();
			ois.close();
			System.out.println("Leitura feita");
		}catch(Exception ex) {
			System.out.println("Não foi possivel ler o arquivo");
		}
	}
	
	/**
	 * Método resposavel por escrever no arquivo de clientes cadastrados
	 */
	public void escreverArquivo() {
		try {
			FileOutputStream fout = new FileOutputStream("Clients.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(this.clientes);
			oos.close();
			System.out.println("Serializado");
		}catch(Exception ex) {
			System.out.println("Não foi possivel escrever o arquivo");
		}
		
	}
	
	/**
	 * Método resposavel por ler o arquivo de quartos cadastrados
	 */
	@SuppressWarnings("unchecked")
	 public void lerArquivoQuarto() {
		try {
	 		File arqQuarto = new File("Quartos.ser");
	 		FileInputStream fin = new FileInputStream(arqQuarto);
	 		ObjectInputStream ois = new ObjectInputStream(fin);
	 		this.quartos = (ArrayList<Quarto>) ois.readObject();
	 		ois.close();
	 		System.out.println("Leitura Feita!");
	 	}catch(Exception ex) {
	 		System.out.println(ex.getMessage());
	 		System.out.println("Não foi possivel ler o arquivo");
	 	}
	 }	
	
	/**
	 * Método resposavel por escrever no arquivo de quartos cadastrados
	 */
	 
	 public void escreverArquivoQuarto() {
		 try {
		 		FileOutputStream fout = new FileOutputStream("Quartos.ser");
		 		ObjectOutputStream oos = new ObjectOutputStream(fout);
		 		oos.writeObject(this.quartos);
		 		oos.close();
		 		System.out.println("Escrita Feita!");
		 }catch(Exception ex) {
			 	System.out.println(ex.getMessage());
		 		System.out.println("Não foi possivel escrever o arquivo de Quartos");
		 }
		 
	}
	 
	/**
	* Método resposavel por ler o arquivo dos funcionarios cadastrados
	*/
	@SuppressWarnings("unchecked")
	public void lerArquivoFuncionario() {
		try {
			File arqrep = new File("Funcionarios.ser");
			FileInputStream fin = new FileInputStream(arqrep);
			ObjectInputStream ois = new ObjectInputStream(fin);
			this.funcionarios = (ArrayList<Recepcionista>) ois.readObject();
			ois.close();
			System.out.println("Leitura feita!");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	/**
	* Método resposavel por escrever no arquivo dos funcionarios cadastrados
	*/
	public void escreverArquivoFuncionario() {
		try {
			FileOutputStream fout = new FileOutputStream("Funcionarios.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(this.funcionarios);
			oos.close();
			System.out.println("Escrita feita!");
		}catch(Exception ex) {
			System.out.println(ex.getMessage() + " | " + ex.getCause());
			System.out.println("Não foi possivel escrever o arquivo");
		}
	}
	
	/**
	 * Método responsável por realizar a busca dos clientes cadastrados no sistema
	 * @param cpf - cpf do cliente
	 * @return Cliente ou vazio para caso ele não encontre
	 */
	
	public String buscarCliente(String cpf) {
		for (Cliente cliente : clientes) {
			String cpf2 = cliente.getCpf();
			System.out.println(cpf2 + " = " + cpf);
			if(cpf2.equals(cpf)) {
				System.out.println("É igual");
				return cliente.getNome();
			}
		}
		System.out.println("Não é igul");
		return " ";
	}
	
	/**
	 * Método responsável por realizar a busca dos quartos do sistema pelo seu tipo
	 * @param tipo - tipo do quarto
	 * @return Retorna a referência do objeto quarto
	 */
	public Quarto buscarQuarto(String tipo) {
		for(Quarto quarto : quartos) {
				if(quarto.getTipo().equals(tipo) && !(quarto.isLocado())) {
					return quarto;
				}
		}
		return null;
	}
	
	/**
	 * Método responsável por buscar o quarto vazio mais próximo para ser locado
	 * @param index - indice do quarto no vetor
	 * @return quarto mais proximo para locação
	 */
	public Quarto buscarQuarto(Integer index) {
		if(index >= 0){
			System.out.println("Index : " + index);
			return quartos.get(index);
		}
		return null;
	}
	
			
}
