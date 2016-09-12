package br.com.gojava.modelo;

import br.com.gojava.generico.Emissor;

public abstract class EmissorExtra implements Emissor {

	public EmissorExtra(Mensagem mensagem) {
		super();
		this.mensagem = mensagem;
	}

	private Mensagem mensagem;

	public Mensagem getMensagem() {
		return mensagem;
	}

	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}	
	
}
