package br.com.gojava.modelo;

import br.com.gojava.generico.Item;

public class CalculoFreteIndevido {
	private Item item;
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}	
	public double calcularFrete(int tipoFrete) {
		double valorFrete = 0.0;
		Item livro = new Livro(80.00);
		if (tipoFrete == 1) { // Frete Especial
			valorFrete = livro.getPreco() + 10;
		}
		else { // Frete Especial Presente
			valorFrete = livro.getPreco() + 20;
		}	
		return valorFrete;
	}	
}
