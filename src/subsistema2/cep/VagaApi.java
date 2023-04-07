package subsistema2.cep;

public class VagaApi {

	private static VagaApi instancia = new VagaApi();

	private VagaApi() {
		super();
	}

	public static VagaApi getInstancia() {
		return instancia;
	}
	
	public String recuperarNivel(String cod) {
		return "Estágio";
	}
	
	public String recuperarLocal(String cod) {
		return "Santos";
	}
}
