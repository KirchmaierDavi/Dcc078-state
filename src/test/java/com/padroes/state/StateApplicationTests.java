package com.padroes.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SindicatoTest {

    private Sindicato sindicato;

    @BeforeEach
    void setUp() {
        sindicato = new Sindicato();
    }

    @Test
    void novoMembroDeveSerInadimplente() {
        assertTrue(sindicato.getSituacao() instanceof Inadimplente, "Um novo membro do sindicato deve começar como inadimplente.");
    }

    @Test
    void pagarMensalidadeDeveMudarParaAdimplente() {
        sindicato.pagarMensalidade();
        assertTrue(sindicato.getSituacao() instanceof Adimplente, "Após pagar a mensalidade, a situação deve ser Adimplente.");
    }

    @Test
    void membroAdimplentePodeReceberBeneficio() {
        sindicato.setSituacao(new Adimplente());
        assertDoesNotThrow(() -> sindicato.receberBeneficio());
    }

    @Test
    void membroInadimplenteNaoPodeReceberBeneficio() {
        assertDoesNotThrow(() -> sindicato.receberBeneficio());
        assertTrue(sindicato.getSituacao() instanceof Inadimplente, "A situação não deve mudar ao tentar receber benefício estando inadimplente.");
    }

    @Test
    void pagarMensalidadeQuandoAdimplenteNaoMudaEstado() {
        sindicato.setSituacao(new Adimplente());
        sindicato.pagarMensalidade();
        assertTrue(sindicato.getSituacao() instanceof Adimplente, "Pagar novamente quando já está adimplente não deve alterar o estado.");
    }
}
