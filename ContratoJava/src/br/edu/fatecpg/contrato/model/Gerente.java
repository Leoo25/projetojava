package br.edu.fatecpg.contrato.model;

public class Gerente implements Funcionario{

	@Override
	public void baterPonto() {
		
	}

	@Override
	public void solicitarMaterial() {
		// TODO Auto-generated method stub
		
	}
	
	public void fecharCaixa() {
		System.out.println("Caixa Fechado!");
	}

}
