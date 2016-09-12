package br.com.gojava.modelo;

public class EmissorComCriptografia extends EmissorExtra {

	public EmissorComCriptografia(Mensagem mensagem) {
		super(mensagem);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enviaMSG(String mensagem) {
		// TODO Auto-generated method stub
		getMensagem().colocaMSGHeader();
		criptografarMSG(mensagem);
		System.out.println("Enviar MSG");
		getMensagem().colocaMSGFooter();
	}
	
	private void criptografarMSG(String mensagem) {
		System.out.println("Criptografar MSG "+mensagem);
	}

}
