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
import java.util.ArrayList;

public class SistemaInterno {
	/**
	 * Classe relativa ao controle dos clientes e quartos disponiveis
	 */
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	public ArrayList<Recepcionista> funcionarios = new ArrayList<Recepcionista>();
	public int i;
	/**
	 * Classe resposavel por ler o arquivo de clientes cadastrados
	 */
	
	public boolean checkLoginrecepcionista(String login, String senha)
	{
		for(i=0;i<this.funcionarios.size();i++)
		{
			if(login.equals(this.funcionarios.get(i).getIdentificador()) && senha.equals(this.funcionarios.get(i).getSenhaDeAcesso()))
				return true;
		}
		return false;
	}
	
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
	 * Classe resposavel por escrever no arquivo de clientes cadastrados
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
	 * Classe resposavel por ler o arquivo de quartos cadastrados
	 */
	@SuppressWarnings("unchecked")
	 public void lerArquivoQuarto() {
	 try {
	 		File arqQuarto = new File("Quartos.ser");
	 		FileInputStream fin = new FileInputStream(arqQuarto);
	 		ObjectInputStream ois = new ObjectInputStream(fin);
	 		this.quartos = (ArrayList<Quarto>) ois.readObject();
	 		ois.close();
	 	}catch(Exception ex) {
	 		System.out.println("Não foi possivel ler o arquivo");
	 	}
	 }	
	
	/**
	 * Classe resposavel por ler o arquivo de quartos cadastrados
	 */
	 
	 public void escreverArquivoQuarto() {
		 try {
		 		FileOutputStream fout = new FileOutputStream("Quartos.ser");
		 		ObjectOutputStream oos = new ObjectOutputStream(fout);
		 		oos.writeObject(this.quartos);
		 		oos.close();
		 }catch(Exception ex) {
		 		System.out.println("Não foi possivel escrever o arquivo de Quartos");
		 }
		 
	}

@SuppressWarnings("unchecked")
public void lerArquivoFuncionario() {
	try {
		File arqrep = new File("Funcionarios.ser");
		FileInputStream fin = new FileInputStream(arqrep);
		ObjectInputStream ois = new ObjectInputStream(fin);
		this.funcionarios = (ArrayList<Recepcionista>) ois.readObject();
		ois.close();
	}catch(Exception ex) {
		System.out.println("Não foi possivel ler o arquivo");
	}
}

/**
 * Classe resposavel por escrever no arquivo de clientes cadastrados
 */
public void escreverArquivoFuncionario() {
	try {
		FileOutputStream fout = new FileOutputStream("Funcionarios.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(this.funcionarios);
		oos.close();
		
	}catch(Exception ex) {
		System.out.println("Não foi possivel escrever o arquivo");
	}
}

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
		
}
