package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Status;
import one.digitalinnovation.gof.strategy.Robo;
import one.digitalinnovation.gof.strategy.StatusAbandonado;
import one.digitalinnovation.gof.strategy.StatusEmAndamento;
import one.digitalinnovation.gof.strategy.StatusFinalizado;

/**
 * Modificação para o desafio de projeto do bootcamp Orange Tech Backend.
 * 
 * A modificação foi ao invés de ser um sistema de CEP, seria um sistema de controle de vagas de empresas
 * com o intuito de saber o status da vaga (abandonada, em andamento ou concluída)
 * 
 * @author allynemma
 */
public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Status abandonado = new StatusAbandonado();
		Status emAndamento = new StatusEmAndamento();
		Status finalizado = new StatusFinalizado();
		
		Robo robo = new Robo();
		robo.setComportamento(abandonado);
		robo.mover();
		System.out.println("\t----\t");

		robo.setComportamento(emAndamento);
		robo.mover();
		// Facade
		Facade facade = new Facade();
		facade.migrarVaga("001", "DIO");

		System.out.println("\t----\t");
		robo.setComportamento(finalizado);
		robo.mover();
		System.out.println("\t----\t");

	}

}
