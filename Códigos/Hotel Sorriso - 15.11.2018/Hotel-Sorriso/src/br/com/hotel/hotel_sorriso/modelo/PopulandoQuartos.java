package br.com.hotel.hotel_sorriso.modelo;

public class PopulandoQuartos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaInterno si = new SistemaInterno();
		//si.lerArquivoFuncionario();
		Gerente g = new Gerente();
		g.setIdentificador("Kaul");
		g.setAcesso(1);
		g.setSenhaDeAcesso("M123");
		
		si.funcionarios.add(g);
		si.escreverArquivoFuncionario();
	}

}
