package br.com.gojava.modelo;

public class EmissorComAutenticacao extends EmissorExtra {

	public EmissorComAutenticacao(Mensagem mensagem) {
		super(mensagem);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enviaMSG(String mensagem) {
		// TODO Auto-generated method stub
		getMensagem().colocaMSGHeader();
		autenticarMSG(mensagem);
		System.out.println("Enviar MSG");
		getMensagem().colocaMSGFooter();		
	}
	
	private void autenticarMSG(String mensagem) {
		System.out.println("Autenticar MSG "+mensagem);
	}
}
