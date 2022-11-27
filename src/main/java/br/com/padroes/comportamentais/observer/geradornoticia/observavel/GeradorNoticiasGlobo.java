package br.com.padroes.comportamentais.observer.geradornoticia.observavel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.padroes.comportamentais.observer.geradornoticia.observador.Inscrito;

public class GeradorNoticiasGlobo implements GeradorNoticias {

	private Set<Inscrito> inscritos = new HashSet<>();
	private List<String> noticiasGeradas = new ArrayList<>();
	
	@Override
	public void adicionarInscrito(Inscrito inscrito) {
		inscritos.add(inscrito);
	}

	@Override
	public void adicionarNoticia(String noticia) {
		noticiasGeradas.add(noticia);
		notificarTodosInscritos(noticia);
	}

	private void notificarTodosInscritos(String noticia) {
		inscritos.forEach(i -> i.atualizar(noticia));
	}

}
