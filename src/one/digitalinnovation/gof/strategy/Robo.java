package one.digitalinnovation.gof.strategy;

public class Robo {
	
	private Status status;

	public void setComportamento(Status status) {
		this.status = status;
	}
	
	public void mover() {
		status.mover();
	}
}
