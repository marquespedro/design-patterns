package br.com.padroes.comportamentais.observer.geradornoticia.observador;

import java.util.ArrayList;
import java.util.List;

public class MariaTitiNews implements Inscrito {

	private List<String> noticias = new ArrayList<>();
	
	@Override
	public void atualizar(String noticia) {
		System.out.println("Maria tititi recebeu a noticia : " + noticia);
		this.noticias.add(noticia);

	}

}
