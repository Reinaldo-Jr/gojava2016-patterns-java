package br.com.gojava.modelo;

public class ItensCarrinho {

	public int qtde;
	public Produto produto;
	
	public ItensCarrinho(int qtde, Produto produto) {
		super();
		this.qtde = qtde;
		this.produto = produto;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
