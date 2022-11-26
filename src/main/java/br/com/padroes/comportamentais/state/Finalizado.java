package br.com.padroes.comportamentais.state;

/**
 * Padrao State
 * @author 
 * Classe concreta que representa o estado Finalizado
 * O mesmo nao sobrescreve nenhum metodo  da classe SituacaoOrcamento 
 * pois uma vez que esteja no estado finalizado o mesmo nao deve fazer nada 
 * e por sua vez vai chamar o metodo definido na classe mae ->  SituacaoOrcamento
 */
public class Finalizado  extends SituacaoOrcamento{

	
}
