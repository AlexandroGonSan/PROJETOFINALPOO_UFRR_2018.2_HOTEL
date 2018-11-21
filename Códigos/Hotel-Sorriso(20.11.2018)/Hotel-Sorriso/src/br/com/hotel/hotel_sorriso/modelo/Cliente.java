package br.com.hotel.hotel_sorriso.modelo;
/**
*
* @author Markus Kaul
* @author Gabriel Arcanjo
* @author Miller Monteiro
* 
* @since 28/09/2018
*/

public class Cliente extends Pessoa{
	/**
	 * Classe cliente que armazena os dados do cliente que alugará os quartos
	 */
	private static final long serialVersionUID = 1L;
	private String formaDePagamento;
	private Integer numeroDoQuartoAlugado;
	
	
	/**
	 * @return - formaDePagamento - Retorna uma string com a forma de pagamento do quarto
	 */
	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	/**
	 * Método responsável por setar uma string com a forma de pagamento do quarto
	 * @param formaDePagamento - forma que o cliente irá pagar pela locação
	 */
	
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
	/**
	 * Retorna o numero do quarto locado
	 * @return numeroDoQuartoAlugado
	 */
	public Integer getNumeroDoQuartoAlugado() {
		return numeroDoQuartoAlugado;
	}
	
	/**
	 * Método resposável por setar o numero do quarto locado
	 * @param numeroDoQuartoAlugado - numero do quarto que foi locado
	 */

	public void setNumeroDoQuartoAlugado(Integer numeroDoQuartoAlugado) {
		this.numeroDoQuartoAlugado = numeroDoQuartoAlugado;
	}
	
	
}
