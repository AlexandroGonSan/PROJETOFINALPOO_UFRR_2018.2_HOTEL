package classes;


public class Quarto {
	private static Integer identificador = 1;
	private Integer numero;
	private Boolean locado;
	private Double preco;
	private String tipo;
	private Integer diasAlocado;
	private String cpfDoCliente;
	
	public Quarto(Double preco, String tipo) {
		this.setNumero(Quarto.identificador);
		Quarto.identificador++;
		this.setPreco(preco);
		this.setTipo(tipo);
		this.setLocado(false);
	}
	
	public String getCpfDoCliente() {
		return cpfDoCliente;
	}

	public void setCpfDoCliente(String cpfDoCliente) {
		this.cpfDoCliente = cpfDoCliente;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Boolean isLocado() {
		return locado;
	}
	
	public void setLocado(Boolean locado) {
		this.locado = locado;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Integer getDiasAlocado() {
		return diasAlocado;
	}
	
	public void setDiasAlocado(Integer
			diasAlocado) {
		this.diasAlocado = diasAlocado;
	}
}