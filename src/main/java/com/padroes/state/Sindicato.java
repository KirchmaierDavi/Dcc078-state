package com.padroes.state;

public class Sindicato {

    private Situacao situacao;

    public Sindicato() {
        this.situacao = new Inadimplente();
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Situacao getSituacao() {
        return this.situacao;
    }

    public void pagarMensalidade() {
        situacao.pagarMensalidade(this);
    }

    public void receberBeneficio() {
        situacao.receberBeneficio(this);
    }
}

