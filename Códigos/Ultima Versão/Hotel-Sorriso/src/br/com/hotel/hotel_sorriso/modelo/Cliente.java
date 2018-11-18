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
	 * formaDePagamento - Seta uma string com a forma de pagamento do quarto
	 */
	
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
	/**
	 * @return - numeroDoQuartoLocado - Retorna o numero do quarto locado
	 */

	public Integer getNumeroDoQuartoAlugado() {
		return numeroDoQuartoAlugado;
	}
	
	/**
	 * numeroDoQuartoLocado - Seta o numero do quarto locado
	 */

	public void setNumeroDoQuartoAlugado(Integer numeroDoQuartoAlugado) {
		this.numeroDoQuartoAlugado = numeroDoQuartoAlugado;
	}
	
	
}
