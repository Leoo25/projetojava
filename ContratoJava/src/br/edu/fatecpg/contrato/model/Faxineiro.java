package br.edu.fatecpg.contrato.model;

public class Faxineiro implements Funcionario {

	@Override
	public void baterPonto() {
		System.out.println("Ponto Registrado!");
		
	}

	@Override
	public void solicitarMaterial() {
		System.out.println("Qual o Material?");
		
	}
	
	

}
