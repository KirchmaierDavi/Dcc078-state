package com.padroes.state;

public class Adimplente implements Situacao {

    @Override
    public void pagarMensalidade(Sindicato sindicato) {
        System.out.println("Pagamento já está em dia.");
    }

    @Override
    public void receberBeneficio(Sindicato sindicato) {
        System.out.println("Benefício concedido.");
    }
}

