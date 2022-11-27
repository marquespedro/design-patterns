package br.com.padroes.comportamentais.observer.geradornoticia.observavel;

import br.com.padroes.comportamentais.observer.geradornoticia.observador.Inscrito;

public interface GeradorNoticias {
	
	void adicionarInscrito(Inscrito inscrito);
	void adicionarNoticia(String noticia);
	
}
