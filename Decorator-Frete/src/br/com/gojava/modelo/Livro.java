package br.com.gojava.modelo;

import br.com.gojava.generico.Item;

public class Livro implements Item {
	
	private double preco;

	public Livro(double preco) {
		super();
		this.preco = preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return this.preco;
	}

}
