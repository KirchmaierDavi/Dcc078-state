package com.padroes.state;

public class Inadimplente implements Situacao {

    @Override
    public void pagarMensalidade(Sindicato sindicato) {
        System.out.println("Pagamento recebido. Situação regularizada.");
        sindicato.setSituacao(new Adimplente());
    }

    @Override
    public void receberBeneficio(Sindicato sindicato) {
        System.out.println("Não é possível receber benefício, situação irregular.");
    }
}

