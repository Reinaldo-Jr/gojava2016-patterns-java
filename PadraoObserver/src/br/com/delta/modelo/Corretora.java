package br.com.delta.modelo;

import br.com.delta.generico.AcaoObserver;

public class Corretora implements AcaoObserver {
	private String nome;
	public Corretora(String nome) {
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
	public void notificaAlteracao(Acao acao) {
	System.out.println("Corretora "+getNome());	
	System.out.println("A ação " + acao.getNome()+" Foi Alterada para R$ "+acao.getValor());
	}
}
