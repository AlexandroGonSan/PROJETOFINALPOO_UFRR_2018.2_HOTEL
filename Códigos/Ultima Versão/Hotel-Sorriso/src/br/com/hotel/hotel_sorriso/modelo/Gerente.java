package br.com.hotel.hotel_sorriso.modelo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gerente extends Recepcionista{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Scanner ler = new Scanner(System.in);
	private SistemaInterno si;
	
	public Recepcionista cadastrarRecepcionista() {
		Recepcionista recepcionista = new Recepcionista();
		System.out.println("CADASTRO DE RECEPCIONISTA");
		System.out.println("Nome:");
		recepcionista.setNome(ler.nextLine());
		System.out.println("CPF:");
		recepcionista.setCpf(ler.nextLine());
		
		while(isCPF(recepcionista.getCpf())!=true)
		{
			if(isCPF(recepcionista.getCpf())==true)
			{
				recepcionista.setIdentificador(ler.nextLine());
				recepcionista.setSenhaDeAcesso(ler.nextLine());
				return recepcionista;
			}
			else
			{
				System.out.println("CPF invalido");
				System.out.println("CPF:");
				recepcionista.setCpf(ler.nextLine());
			}
		}
		return null;
		
	}
	
	public void excluirRecepcionista(Recepcionista recepcionista) {
		
	}
	
	public void atualizarRecepcionista(Recepcionista recepcionista) {
		
	}
}
