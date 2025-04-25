package br.edu.fatecpg.contrato.view;
import br.edu.fatecpg.contrato.model.*;
public class Main {

	public static void main(String[] args) {
		Faxineiro faxineiro = new Faxineiro();
		Gerente gerente = new Gerente();
		Vendedor ven = new Vendedor();
		
		faxineiro.baterPonto();
		faxineiro.solicitarMaterial();
		gerente.fecharCaixa();
		ven.realizarVenda();
	}

}
