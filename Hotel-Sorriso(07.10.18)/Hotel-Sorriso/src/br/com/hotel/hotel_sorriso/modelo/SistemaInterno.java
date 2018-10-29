package br.com.hotel.hotel_sorriso.modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SistemaInterno {
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	
	@SuppressWarnings("unchecked")
	public void lerArquivo() {
		try {
			File arq = new File("E:\\Documentos\\POO\\Hotel-Sorriso\\Clients.ser");
			FileInputStream fin = new FileInputStream(arq);
			ObjectInputStream ois = new ObjectInputStream(fin);
			this.clientes = (ArrayList<Cliente>) ois.readObject();
			ois.close();
		}catch(Exception ex) {
			System.out.println("Não foi possivel ler o arquivo");
		}
	}
	
	public void escreverArquivo() {
		try {
			FileOutputStream fout = new FileOutputStream("E:\\Documentos\\POO\\Hotel-Sorriso\\Clients.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(this.clientes);
			oos.close();
			
		}catch(Exception ex) {
			System.out.println("Não foi possivel escrever o arquivo");
		}
		
	}
	
	/*@SuppressWarnings("unchecked")
	 *public void lerArquivoQuarto() {
	 *try {
	 *		File arq = new File("E:\\Documentos\\POO\\Hotel-Sorriso\\Quartos.ser");
	 *		FileInputStream fin = new FileInputStream(arq);
	 *		ObjectInputStream ois = new ObjectInputStream(fin);
	 *		this.quartos = (ArrayList<Quarto>) ois.readObject();
	 *		ois.close();
	 *	}catch(Exception ex) {
	 *		System.out.println("Não foi possivel ler o arquivo");
	 *	}
	 *}	
	 *
	 *public void escreverArquivoQuarto() {
		 *try {
		 *		FileOutputStream fout = new FileOutputStream("E:\\Documentos\\POO\\Hotel-Sorriso\\Quartos.ser");
		 *		ObjectOutputStream oos = new ObjectOutputStream(fout);
		 *		oos.writeObject(this.quartos);
		 *	oos.close();
		 *}catch(Exception ex) {
		 *		System.out.println("Não foi possivel escrever o arquivo de Quartos");
		 *}
		 *
	*}
	*/
}
