package br.com.gojava.generico;

public interface Observavel {

	public void registraObservador(Observador observador);
	public void cancelaObservador(Observador observador);
	public void notificarObservadores();
	
}
