package one.digitalinnovation.gof.strategy;

public class StatusEmAndamento implements Status {

	@Override
	public void mover() {
		System.out.println("Status: Em andamento...");
	}

}
