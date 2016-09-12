package br.com.gojava.principal;

import br.com.gojava.modelo.EmissorBasico;
import br.com.gojava.modelo.EmissorComAutenticacao;
import br.com.gojava.modelo.EmissorComCriptografia;
import br.com.gojava.modelo.Mensagem;

public class Principal {

	public static void main(String[] args) {
		EmissorBasico emissorBasico = new EmissorBasico();
		emissorBasico.enviaMSG("Eu estou no GO-JAVA !!!");
		
		EmissorComAutenticacao emissorAut = new EmissorComAutenticacao(new Mensagem("Eu estou no GO-JAVA !!!"));
		emissorAut.enviaMSG("Aniversário GO-JAVA !!!");
		
		EmissorComCriptografia emissorCript = new EmissorComCriptografia(new Mensagem("Eu estou no GO-JAVA !!!"));
		emissorAut.enviaMSG("Aniversário GO-JAVA !!!");
		
	}

}
