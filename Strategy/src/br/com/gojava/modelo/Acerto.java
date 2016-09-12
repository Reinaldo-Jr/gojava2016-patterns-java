package br.com.gojava.modelo;

import br.com.gojava.generico.FormaPagamento;

public class Acerto {

	public FormaPagamento formaPagamento;
	
	public Acerto(FormaPagamento formaPagamento) {
		super();
		this.formaPagamento = formaPagamento;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public void realizarPagamento(int idFormaPagamento) {		
		getFormaPagamento().pagar();
	}
	
	
}
