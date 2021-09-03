package br.com.pedroyodasaito.facade.subsistema.cep;

import java.util.Objects;

public class CepApi {
    private static CepApi instancia;

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        if (Objects.isNull(instancia)) {
            instancia = new CepApi();
        }
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Goiânia";
    }

    public String recuperarEstado(String cep) {
        return "Goiás";
    }

}
