package br.com.gojava.principal;

import br.com.gojava.modelo.Acerto;
import br.com.gojava.modelo.CarrinhoDeCompra;
import br.com.gojava.modelo.CartaoCredito;
import br.com.gojava.modelo.Dinheiro;
import br.com.gojava.modelo.Produto;

public class Principal {

	public static void main(String[] args) {
		
		CarrinhoDeCompra carrinhoCompraUm = new CarrinhoDeCompra();
		carrinhoCompraUm.incluirProduto(10, new Produto("Lapiseira", 15));
		carrinhoCompraUm.setAcerto(new Acerto(new Dinheiro()));
		carrinhoCompraUm.getAcerto().getFormaPagamento().pagar(); // Dinheiro

		CarrinhoDeCompra carrinhoCompraDois = new CarrinhoDeCompra();
		carrinhoCompraDois.incluirProduto(10, new Produto("Caneta", 10));
		carrinhoCompraDois.setAcerto(new Acerto(new CartaoCredito()));
		carrinhoCompraDois.getAcerto().getFormaPagamento().pagar(); // Cartão
	}

}
