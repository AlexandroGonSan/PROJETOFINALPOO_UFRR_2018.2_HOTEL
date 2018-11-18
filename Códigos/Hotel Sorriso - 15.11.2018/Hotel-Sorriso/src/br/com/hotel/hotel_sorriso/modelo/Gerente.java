package br.com.hotel.hotel_sorriso.modelo;

import java.util.InputMismatchException;
/**
*
* @author Markus Kaul
* @author Gabriel Arcanjo
* @author Miller Monteiro
* 
* @since 28/09/2018
*/

import java.util.Scanner;

public class Gerente extends Recepcionista{
	/**
	 * Classe gerente que possui os metodos herdados da classe Recepcionista e os
	 * metodos espeficicos que o gerente irá realizar
	 */
	private static final long serialVersionUID = 1L;

	private Scanner ler = new Scanner(System.in);
	private SistemaInterno si;
	
	/**
	 * Metodo único do gerente que permite que ele cadastre um recepcionista para ter acesso ao sistema
	 */
	
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
	
	/**
	 * Metodo único do gerente que permite que ele remova o acesso ao sistema de um recepcionista
	 */
	
	public void excluirRecepcionista(Recepcionista recepcionista) {
		
	}
	
	public void atualizarRecepcionista(Recepcionista recepcionista) {
		
	}
}
