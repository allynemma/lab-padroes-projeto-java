package one.digitalinnovation.gof.strategy;

public class StatusAbandonado implements Status {

	@Override
	public void mover() {
		System.out.println("Status: Abandonado...");
	}

}
