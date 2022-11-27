package br.com.padroes.comportamentais.observer.geradornoticia;

import br.com.padroes.comportamentais.observer.geradornoticia.observador.BlogoNoticiaDoCaze;
import br.com.padroes.comportamentais.observer.geradornoticia.observador.Inscrito;
import br.com.padroes.comportamentais.observer.geradornoticia.observador.MariaTitiNews;
import br.com.padroes.comportamentais.observer.geradornoticia.observavel.GeradorNoticias;
import br.com.padroes.comportamentais.observer.geradornoticia.observavel.GeradorNoticiasGlobo;

public class TesteGeradorNoticia {

	public static void main(String[] args) {
		
		GeradorNoticias gerador = new GeradorNoticiasGlobo();
		
		Inscrito blogMaria = new MariaTitiNews();
		gerador.adicionarInscrito(blogMaria);
		
		Inscrito blogCaze = new BlogoNoticiaDoCaze();
		gerador.adicionarInscrito(blogCaze);
		
		gerador.adicionarNoticia("Brasil é hexaaa");
		gerador.adicionarNoticia("O craque foi Richarlison");
	}

}
