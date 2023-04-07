package one.digitalinnovation.gof.strategy;

public class StatusFinalizado implements Status {

	@Override
	public void mover() {
		System.out.println("Status: Finalizado...");
	}

}
