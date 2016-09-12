package br.com.gojava.modelo;

import br.com.gojava.generico.Observador;

public class Banco implements Observador {
	
	private String nome;
	public Banco(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public void notificar(Acao acao) {
		System.out.println("Banco "+getNome());	
		System.out.println("A ação " + acao.getNome()+" Foi Alterada para R$ "+acao.getValor());
	}	
}
