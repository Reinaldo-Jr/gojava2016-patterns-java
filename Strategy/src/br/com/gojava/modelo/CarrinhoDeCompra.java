package br.com.gojava.modelo;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

	public Acerto acerto;
	public List<ItensCarrinho> listaCarrinho;	
	
	public CarrinhoDeCompra() {
		this.listaCarrinho = new ArrayList<ItensCarrinho>();
	}
	public Acerto getAcerto() {
		return acerto;
	}
	public void setAcerto(Acerto acerto) {
		this.acerto = acerto;
	}
	public List<ItensCarrinho> getListaCarrinho() {
		return listaCarrinho;
	}
	public void setListaCarrinho(List<ItensCarrinho> listaCarrinho) {
		this.listaCarrinho = listaCarrinho;
	}
	public void incluirProduto(int qtde, Produto produto) {
		getListaCarrinho().add(new ItensCarrinho(qtde, produto));
	}
	
}
