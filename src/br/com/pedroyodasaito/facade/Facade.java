package br.com.pedroyodasaito.facade;

import br.com.pedroyodasaito.facade.subsistema.cep.CepApi;
import br.com.pedroyodasaito.facade.subsistema.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
