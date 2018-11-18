package br.com.hotel.hotel_sorriso.modelo;

public class Cliente extends Pessoa{
	private String formaDePagamento;
	private Integer numeroDoQuartoAlugado;

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Integer getNumeroDoQuartoAlugado() {
		return numeroDoQuartoAlugado;
	}

	public void setNumeroDoQuartoAlugado(Integer numeroDoQuartoAlugado) {
		this.numeroDoQuartoAlugado = numeroDoQuartoAlugado;
	}
	
	
}
