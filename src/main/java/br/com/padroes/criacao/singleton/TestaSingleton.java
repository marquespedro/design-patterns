package br.com.padroes.criacao.singleton;

/**
 * @author pedro
 * Singleton e um padrao onde uma unica instancia de um objeto é criada
 * Um construtor privado e um metodo para acesso a instancia criada.
 */
public class TestaSingleton {

	public static void main(String[] args) {
		Configuracao conf = Configuracao.getInstancia();
		String usuario = conf.getPropriedade("usuario");
		String senha = conf.getPropriedade("senha");
		System.out.println(usuario + " " + senha);
	}
}
