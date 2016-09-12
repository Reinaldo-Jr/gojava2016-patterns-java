package br.com.delta.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.delta.generico.AcaoObserver;

public class Acao {

	private String nome;
	private double valor;
	private List<AcaoObserver> listaObservadores;
	
	public Acao(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		listaObservadores = new ArrayList<AcaoObserver>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor; // Alteração de Valor
		// Aviso aos Observadores de que o valor da ação foi alterado
		for (AcaoObserver observador : this.listaObservadores) {
			observador.notificaAlteracao(this);			
		}
	}
	
	public void registraInteressado(AcaoObserver observador) {
		this.listaObservadores.add(observador);
	}
	
	public void cancelaInteressado(AcaoObserver observador) {
		this.listaObservadores.remove(observador);
	}
	
}
