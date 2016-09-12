package br.com.gojava.modelo;

public class Mensagem {

	private String mensagem;

	public Mensagem(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void colocaMSGHeader() {
		System.out.println("Header "+getMensagem());
	}
	
	public void colocaMSGFooter() {
		System.out.println("Footer "+getMensagem());
	}
	
}
