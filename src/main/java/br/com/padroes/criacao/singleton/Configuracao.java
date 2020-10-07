package br.com.padroes.criacao.singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuracao {

	private static Configuracao instancia;
	private  Map<String, String> props = new HashMap<String , String>();
	
	private Configuracao() {
		this.props.put("usuario", "root");
		this.props.put("senha", "123456");
	}
	
	public static Configuracao getInstancia() {
		
		if(Configuracao.instancia == null) {
			Configuracao.instancia = new Configuracao();
		}
		
		return Configuracao.instancia;
	}
	
	public String getPropriedade(String key) {
		return this.props.get(key);
	}
	
}
