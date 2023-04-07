package subsistema1.crm;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void gravarVaga(String cod, String nivel, String empresa, String local) {
		System.out.println("Vaga salva no sistema de CRM:");
		System.out.println(cod);
		System.out.println(nivel);
		System.out.println(empresa);
		System.out.println(local);
	}
}
