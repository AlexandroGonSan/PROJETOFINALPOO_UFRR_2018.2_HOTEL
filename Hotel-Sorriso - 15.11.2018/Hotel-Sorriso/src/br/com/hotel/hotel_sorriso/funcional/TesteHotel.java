/*
package br.com.hotel.hotel_sorriso.funcional;


import java.util.*;

import br.com.hotel.hotel_sorriso.modelo.Quarto;
import br.com.hotel.hotel_sorriso.modelo.Recepcionista;
import br.com.hotel.hotel_sorriso.modelo.SistemaInterno;

public class TesteHotel {

	public static void main(String[] args) {
		SistemaInterno si = new SistemaInterno();
		
		Calendar dia1 = Calendar.getInstance();
		si.lerArquivo();
		//si.lerArquivoQuarto();
		
		Quarto q1 = new Quarto(80.0, "Simples");
		Quarto q2 = new Quarto(80.0, "Simples");
		Quarto q3 = new Quarto(250.0, "Presidencial");
		Quarto q4 = new Quarto(120.0, "Casal");
		
		si.quartos.add(q1);
		si.quartos.add(q2);
		si.quartos.add(q3);
		si.quartos.add(q4);
			
		int op = 1;
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("SISTEMA HOTEL SORRISO");
		while(op != 0) {
			System.out.println("MENU PRINCIPAL");
			System.out.println("(1) - Cadastrar Cliente");
			System.out.println("(2) - Excluir cliente");
			System.out.println("(3) - Listagem de Clientes");
			System.out.println("(4) - Check-in quarto");
			System.out.println("(5) - Check-out quarto");
			System.out.println("(0) - Sair");
			op = leitura.nextInt();
			if (op == 1) { 
				si.clientes.add(r.cadastrarCliente());
			} else if (op == 2) {
				si.clientes.remove(r.descadastrarCliente(si));
			} else if (op == 3) {
				r.listagemCliente(si);
			} else if(op == 4) {
				r.locarQuarto(si, dia1);
			} else if(op == 5) {
				r.desalocarQuarto(si,dia1);
			}
		}
		si.escreverArquivo();
		//si.escreverArquivoQuarto();
		
		System.out.println("SISTEMA ENCERRADO");
		leitura.close();
	}

}
*/
