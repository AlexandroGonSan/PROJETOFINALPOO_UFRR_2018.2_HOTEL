package br.com.hotel.hotel_sorriso.modelo;
import java.util.*;

/**
*
* @author Markus Kaul
* @author Gabriel Arcanjo
* @author Miller Monteiro
* 
* @since 28/09/2018
*/


public class Recepcionista extends Pessoa{
	/**
	 * Classe Recepcionista que esta responsável em reservar/alugar um guarto para o Cliente
	 */
	private static final long serialVersionUID = 1L;
	private String identificador;
	private String senhaDeAcesso;
	private Integer acesso;
	
	public Integer getAcesso() {
		return acesso;
	}

	public void setAcesso(Integer acesso) {
		this.acesso = acesso;
	}

	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getSenhaDeAcesso() {
		return senhaDeAcesso;
	}
	
	public void setSenhaDeAcesso(String i) {
		this.senhaDeAcesso = i;
	}
	
	 public static boolean isCPF(String CPF) {
	        // considera-se erro CPF's formados por uma sequencia de numeros iguais
	        if (CPF.equals("00000000000") ||
	            CPF.equals("11111111111") ||
	            CPF.equals("22222222222") || CPF.equals("33333333333") ||
	            CPF.equals("44444444444") || CPF.equals("55555555555") ||
	            CPF.equals("66666666666") || CPF.equals("77777777777") ||
	            CPF.equals("88888888888") || CPF.equals("99999999999") ||
	            (CPF.length() != 11))
	            return(false);
	          
	        char dig10, dig11;
	        int sm, i, r, num, peso;
	          
	        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
	        try {
	        // Calculo do 1o. Digito Verificador
	            sm = 0;
	            peso = 10;
	            for (i=0; i<9; i++) {              
	        // converte o i-esimo caractere do CPF em um numero:
	        // por exemplo, transforma o caractere '0' no inteiro 0         
	        // (48 eh a posicao de '0' na tabela ASCII)         
	            num = (int)(CPF.charAt(i) - 48); 
	            sm = sm + (num * peso);
	            peso = peso - 1;
	            }
	          
	            r = 11 - (sm % 11);
	            if ((r == 10) || (r == 11))
	                dig10 = '0';
	            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
	          
	        // Calculo do 2o. Digito Verificador
	            sm = 0;
	            peso = 11;
	            for(i=0; i<10; i++) {
	            num = (int)(CPF.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
	            }
	          
	            r = 11 - (sm % 11);
	            if ((r == 10) || (r == 11))
	                 dig11 = '0';
	            else dig11 = (char)(r + 48);
	          
	        // Verifica se os digitos calculados conferem com os digitos informados.
	            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
	                 return(true);
	            else return(false);
	                } catch (InputMismatchException erro) {
	                return(false);
	            }
	        }
	 public static String imprimeCPF(String CPF) {
         return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
         CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
     }
	
	/**
	 * Método responsável por exibir todos os quartos disponíveis no Hotel
	 * @param si - SistemaInterno
	 */
	public void quartosDisponiveis(SistemaInterno si) {
		Integer tam = si.quartos.size();
		
		System.out.println("+--------------------------------------+");
		if (tam==0)
		{
			System.out.println("NAO HA QUARTOS DISPONIVEIS");
			System.out.println("+--------------------------------------+");
		}
		else
		{
			System.out.println("QUARTOS DISPONÍVEIS");
			for(Integer i = 0; i < tam; i++){
				if(!si.quartos.get(i).isLocado()) {
					System.out.println("Nº " + si.quartos.get(i).getNumero() + 
							" Preço: R$" + si.quartos.get(i).getPreco());
				}
			}
			System.out.println("+--------------------------------------+");
		}
	}
	
	/**
	 * Método para poder locar um quarto dentro do Hotel Sorriso
	 * @param si - SistemaInterno do hotel
	 */
	
	/**
	 * 
	 * @param si - SistemaInterno , data - Dia da locação
	 * @return - 1 ou -1 apenas para informar se foi possivel ou não fazer Check-out
	 */
	
	
	/**
	 * Metodo para criar um novo cliente no sistema
	 * 
	 * @return cliente - Referência de um novo cliente
	 */
	public Cliente cadastrarCliente() {
		Cliente cliente = new Cliente();
		while(isCPF(cliente.getCpf())!=true)
		{
			if(isCPF(cliente.getCpf())==true)
			{
				return cliente;
			}
			else
			{
				
			}
		}
		return null;
		
	}
	/**
	 * Método que mostra todos os clientes cadastrados ate o momento
	 * @param si - referência para a SistemaInterno
	 */
	public void listagemCliente(SistemaInterno si) {
		Integer tam = si.clientes.size();
		if (tam==0)
		{
			System.out.println("NÃO EXISTEM CLIENTES CADASTRADOS NO MOMENTO");
		}
		else
		{
			System.out.println("CLIENTES CADASTRADOS");
			for(Integer i = 0; i < tam; i++) 
			{
				System.out.println("====================================================");
				System.out.println(i + "- Nome: " + si.clientes.get(i).getNome() +
						" CPF: " + imprimeCPF(si.quartos.get(i).getNumero()+"CPF: "+si.quartos.get(i).getCpfDoCliente()));
			}
		}
	}
	
	/**
	 * 
	 * @param si - Referência para o objeto SistemaInterno
	 * @return index - Indice que será removido
	 */
	
	
	/**
	 * 
	 * @param si - Referência para o objeto SistemaInterno, numero - numero do quarto buscado
	 * @param numero relativo ao quarto
	 * 
	 * @return - index - 1 para quarto locado, -1 para quarto locado e 0 para quarto não existente
	 */
	
	public int buscarQuarto(SistemaInterno si, Integer numero) {
		
		if(si.quartos.get(numero).isLocado())
			return 1;
		if(!si.quartos.get(numero).isLocado())
			return -1;
		return 0;
	}
}

