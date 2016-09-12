package br.com.gojava.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.gojava.generico.Observador;
import br.com.gojava.generico.Observavel;

public class Acao implements Observavel {

	private String nome;
	private double valor;
	private List<Observador> listaObservadores;
	
	public Acao(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		listaObservadores = new ArrayList<Observador>();
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
		this.valor = valor; 
		notificarObservadores();
	}
	
	public List<Observador> getListaObservadores() {
		return listaObservadores;
	}

	public void registraObservador(Observador observador) {
		this.listaObservadores.add(observador);
	}
	
	public void cancelaObservador(Observador observador) {
		this.listaObservadores.remove(observador);
	}
	
	public void notificarObservadores() {
		getListaObservadores().forEach(obs -> obs.notificar(this));
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}
