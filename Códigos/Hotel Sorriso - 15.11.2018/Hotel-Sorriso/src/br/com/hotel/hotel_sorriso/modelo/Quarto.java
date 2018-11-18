package br.com.hotel.hotel_sorriso.modelo;
import java.util.Calendar;

/**
*
* @author Markus Kaul
* @author Gabriel Arcanjo
* @author Miller Monteiro
* 
* @since 28/09/2018
*/


public class Quarto {
	/**
	 * Classe Quarto é relativo ao quarto que será alugado
	 */
	private static Integer identificador = 1;
	private Integer numero;
	private Boolean locado;
	private Double preco;
	private Double precoDiasLocado;
	private String tipo;
	private Integer diasAlocado;
	private String cpfDoCliente;
	private Calendar diaEntrada;
	private Calendar diaSaida;
	
	
	/**
	 * Construtor que vai receber os dados do quarto
	 * @param - preco - Valor do quarto, tipo - Tipo do quarto a ser locado
	 */
	public Quarto(Double preco, String tipo)
	{
		this.setNumero(Quarto.identificador);
		Quarto.identificador++;
		this.setPreco(preco);
		this.setTipo(tipo);
		this.setLocado(false);
	}
	
	/**
	 * @return - cpfDoCliente - cpf do cliente que locou o quarto
	 *retornar o cpf do cliente
	 */
	public String getCpfDoCliente() {
		return cpfDoCliente;
	}
	/**
	 * Setar o cpf do cliente
	 * @param cpfDoCliente - cpf do cliente que locou o quarto
	 * 
	 */

	public void setCpfDoCliente(String cpfDoCliente) {
		this.cpfDoCliente = cpfDoCliente;
	}
	
	/**
	 * retornar o numero do quarto que foi locado
	 * @return - numero - numero do quarto locado
	 *
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * Setar o numero do quarto
	 * @param numero - numero que se deseja numerar o quarto
	 * 
	 */
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	/**
	 * Inteiro que indica caso o quarto esteja ou não locado
	 * @return - locado - Retornar um boolean (true ou false) para se o quarto esta locado
	 * 
	 */
	
	public Boolean isLocado() {
		return locado;
	}
	
	/**
	 * @param locado - boolean realtivo a situacao do quarto
	 * Setar se o quarto foi locado ou nao
	 * 
	 */
	
	public void setLocado(Boolean locado) {
		this.locado = locado;
	}
	
	/**
	 * @return preco  valor do quarto que foi locado
	 * 
	 */
	
	public double getPreco() {
		return preco;
	}
	
	/**
	 * @param  preco Setar o preco do quarto
	 * 
	 */
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	/**
	 * @return tipo tipo do quarto
	 * 
	 */
	
	
	public String getTipo() {
		return tipo;
	}
	

	/**
	 * @param set o tipo do quarto
	 * 
	 */
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * @return diasAlocado retornar um inteiro com a quantidade de dias que o quarto foi locado
	 * 
	 */
	
	public Integer getDiasAlocado() {
		return diasAlocado;
	}
	
	/**
	 * @param diasAlocado Setar a quantidade de dias de locacao do quarto
	 * 
	 */
	
	public void setDiasAlocado(Integer diasAlocado) {
		this.diasAlocado = diasAlocado;
	}

	/**
	 * @param diaEntrada Setar o dia exato que o quarto foi locado
	 * 
	 */
	public void setDiaEntrada(Calendar dia) {
		this.diaEntrada = Calendar.getInstance();
	}
	
	/**
	 * @return diaEntrada retornar o dia exato que o quarto foi locado
	 * 
	 */
	public Calendar getDiaEntrada()
	{
		return this.diaEntrada;
	}
	/**
	 * @return diaSaida retornar o dia exato que o quarto foi devolvido da locacao
	 * 
	 */
	public Calendar getDiaSaida()
	{
		return this.diaSaida;
	}
	
	/**
	 * @param diaSaida Setar o dia exato que o quarto foi devolvido da locacao
	 * 
	 */
	public void setDiaSaida(Calendar dia, Integer dias) {
		this.diaSaida = dia;
		this.diaSaida.add(Calendar.DATE,dias);
	}
	
	/**
	 * @param Dar o valor da locacao do quarto de acordo com a quantidade de dias que ele foi locado
	 * 
	 */
	
	public void setPrecoLocado()
	{
		this.precoDiasLocado = this.diasAlocado*this.preco;
	}
	
	/**
	 * @return precoDiasLocado Dar o valor da locacao do quarto de acordo com a quantidade de dias que ele foi locado
	 * 
	 */
	
	public Double getPrecoLocado()
	{
		return this.precoDiasLocado;
	}
	
	/**
	 * De acordo como foi definido na documentacao do hotel teria uma multa aplicada para casos de atraso do chekout
	 * 
	 */
	
	public void setMulta(Integer quant)
	{
		this.precoDiasLocado += ((this.preco*20)/100.0)*quant;
	}
	
	public void entregueAntes(Integer quant)
	{
		this.precoDiasLocado += preco;
		this.precoDiasLocado -= this.preco*quant;
	}
}
