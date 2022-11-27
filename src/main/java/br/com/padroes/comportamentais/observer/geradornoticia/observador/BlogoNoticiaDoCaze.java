package br.com.padroes.comportamentais.observer.geradornoticia.observador;

import java.util.ArrayList;
import java.util.List;

public class BlogoNoticiaDoCaze implements Inscrito {

	private List<String> noticias = new ArrayList<>();
	
	@Override
	public void atualizar(String noticia) {
		System.out.println("Caze news recebeu a noticia : " + noticia);
		this.noticias.add(noticia);
	}

}
