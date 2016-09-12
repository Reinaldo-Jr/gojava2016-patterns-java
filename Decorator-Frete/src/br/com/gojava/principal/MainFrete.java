package br.com.gojava.principal;

import br.com.gojava.generico.Frete;
import br.com.gojava.generico.Item;
import br.com.gojava.modelo.FreteEspecial;
import br.com.gojava.modelo.FreteEspecialPresente;
import br.com.gojava.modelo.Livro;

public class MainFrete {

	public static void main(String[] args) {
		// Criar o Produto
		Item livro = new Livro(100);
		
		// Define-se o Tipo de Frete
		Frete frete = negocioTipoFrete(livro);
		
		// Efetivação do Cálculo do Frete		
		calcularFrete(frete);
	}

	private static Frete negocioTipoFrete(Item item) {
		// Código para escolha do Frete
		return (new FreteEspecialPresente(item));
	}			
	
	private static void calcularFrete(Frete frete) {
		System.out.println(frete.getPreco());
	}		

}
