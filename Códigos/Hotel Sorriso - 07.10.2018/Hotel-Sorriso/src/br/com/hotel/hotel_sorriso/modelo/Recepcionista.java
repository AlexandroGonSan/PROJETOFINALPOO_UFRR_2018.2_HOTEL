package br.com.hotel.hotel_sorriso.modelo;

import java.util.Scanner;


/**
 * Classe Recepcionista que esta respons�vel em reservar/alugar um guarto para o Cliente
 * 
 *
 */


public class Recepcionista extends Pessoa{
	private Integer identificador;
	private Integer senhaDeAcesso;
	private Scanner ler = new Scanner(System.in);
	
	public Recepcionista(Integer senha, String nome) {
		this.setSenhaDeAcesso(senha);;
		this.setNome(nome);
	}
	
	public Integer getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	
	public Integer getSenhaDeAcesso() {
		return senhaDeAcesso;
	}
	
	public void setSenhaDeAcesso(int senhaDeAcesso) {
		this.senhaDeAcesso = senhaDeAcesso;
	}
	
	/**
	 * M�todo respons�vel por exibir todos os quartos dispon�veis no Hotel
	 * @param si - SistemaInterno
	 */
	public void quartosDisponiveis(SistemaInterno si) {
		Integer tam = si.quartos.size();
		
		System.out.println("+--------------------------------------+");
		System.out.println("QUARTOS DISPON�VEIS");
		for(Integer i = 0; i < tam; i++){
			if(!si.quartos.get(i).isLocado()) {
				System.out.println("N� " + si.quartos.get(i).getNumero() + 
						" Pre�o: R$" + si.quartos.get(i).getPreco());
			}
		}
		System.out.println("+--------------------------------------+");
	}
	
	/**
	 * M�todo para poder locar um quarto dentro do Hotel Sorriso
	 * @param si - SistemaInterno do hotel
	 */
	public void locarQuarto(SistemaInterno si) {
		quartosDisponiveis(si);
		System.out.print("N� do quarto: ");
		Integer numeroDoQuarto = ler.nextInt(); 
		si.quartos.get(numeroDoQuarto - 1).setLocado(true);
		System.out.print("Dias que ficara: ");
		si.quartos.get(numeroDoQuarto - 1).setDiasAlocado(ler.nextInt());
		System.out.print("CPF do Cliente: ");
		si.quartos.get(numeroDoQuarto - 1).setCpfDoCliente(ler.next());
	}
	
	/**
	 * 
	 * @param si - SistemaInterno 
	 * @return - 1 ou -1 apenas para informar se foi possivel ou n�o fazer Check-out
	 */
	public int desalocarQuarto(SistemaInterno si) {
		Integer tam = si.quartos.size();
		
		System.out.print("CPF do Cliente: ");
		String cpfCliente = ler.next();
		
		for(Integer i = 0; i < tam; i++) {
			if(si.quartos.get(i).getCpfDoCliente().equalsIgnoreCase(cpfCliente)) {
				System.out.println("============================================================");
				System.out.println("N� do Quarto: " + si.quartos.get(i).getNumero());
				System.out.println("Pre�o total a ser pago: R$" + si.quartos.get(i).getDiasAlocado() 
						* si.quartos.get(i).getPreco());
				si.quartos.get(i).setLocado(false);
				si.quartos.get(i).setCpfDoCliente(" ");
				System.out.println("============================================================");
				return 1;
			}
		}
		
		return -1;
	}
	
	
	/**
	 * Metodo para criar um novo cliente no sistema
	 * 
	 * @return cliente - Refer�ncia de um novo cliente
	 */
	public Cliente cadastrarCliente() {
		Cliente cliente = new Cliente();
		System.out.println("CADASTRO DE CLIENTE");
		System.out.println("Nome:");
		cliente.setNome(ler.nextLine());
		System.out.println("CPF:");
		cliente.setCpf(ler.nextLine());
		return cliente;
	}
	
	/**
	 * 
	 * @param si - Refer�ncia para o objeto SistemaInterno
	 * @return index - Indice que ser� removido
	 */
	public int descadastrarCliente(SistemaInterno si) {
		Integer tam = si.clientes.size();
		//Integer index = 0;
		
		System.out.print("Informe o CPF do Cliente que deseja excluir: ");
		String cpf = ler.nextLine();
		
		for(Integer i = 0; i < tam; i++) {
			if(si.clientes.get(i).getCpf().equalsIgnoreCase(cpf)) {
				return i;
			}
		}		
		return -1;
	}
	
	/**
	 * M�todo que mostra todos os clientes cadastrados ate o momento
	 * @param si - refer�ncia para a SistemaInterno
	 */
	public void listagemCliente(SistemaInterno si) {
		Integer tam = si.clientes.size();
		
		System.out.println("CLIENTES CADASTRADOS");
		for(Integer i = 0; i < tam; i++) {
			System.out.println("====================================================");
			System.out.println(i + "- Nome: " + si.clientes.get(i).getNome() +
					" CPF: " + si.clientes.get(i).getCpf());
		}
	}
	
	public void buscarQuarto() {
		
	}
}
