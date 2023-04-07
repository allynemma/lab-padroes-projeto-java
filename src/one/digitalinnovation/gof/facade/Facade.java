package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.VagaApi;

public class Facade {

	public void migrarVaga(String cod, String empresa) {
		String nivel = VagaApi.getInstancia().recuperarNivel(cod);
		String local = VagaApi.getInstancia().recuperarLocal(cod);
		
		CrmService.gravarVaga(cod, nivel, empresa, local);
	}
}
