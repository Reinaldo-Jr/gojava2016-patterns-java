package br.com.gojava.modelo;

public class Produto {
	
	public String descricao;
	public double valorUnitario;
	
	public Produto(String descricao, double valorUnitario) {
		super();
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
