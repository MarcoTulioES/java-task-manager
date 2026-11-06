package com.sistemahospitalar.hospital.model;

import com.sistemahospitalar.hospital.model.enums.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class RegrasDominioTest {
    @Test void quartoRespeitaCapacidade() {
        Quarto q = new Quarto(); q.setCapacidade(1); q.ocuparLeito();
        assertFalse(q.temVagaDisponivel());
        assertThrows(IllegalStateException.class, q::ocuparLeito);
        q.liberarLeito(); assertTrue(q.temVagaDisponivel());
    }
    @Test void consultaNaoPodeVoltarAAgendadaDepoisDeConcluida() {
        ConsultaRotina c = new ConsultaRotina(); c.setStatus(StatusAtendimentoEnum.EM_ATENDIMENTO);
        c.alterarStatus(StatusAtendimentoEnum.CONCLUIDA);
        assertThrows(IllegalStateException.class, () -> c.alterarStatus(StatusAtendimentoEnum.AGENDADA));
    }
    @Test void procedimentoSoConcluiDepoisDeIniciado() {
        ProcedimentoCirurgico p = new ProcedimentoCirurgico();
        assertThrows(IllegalStateException.class, p::concluir);
        p.setStatusProcedimento(StatusProcedimentoEnum.EM_ANDAMENTO); p.concluir();
        assertEquals(StatusProcedimentoEnum.CONCLUIDO, p.getStatusProcedimento());
        assertNotNull(p.getDataHoraEfetiva());
    }
    @Test void consultaEspecializadaExigeAreaCompativel() {
        ConsultaEspecializada c = new ConsultaEspecializada();
        MedicoEspecialista m = new MedicoEspecialista(); m.setEspecialidade("Cardiologia");
        c.setProfissionalResponsavel(m); c.setEspecialidade("Neurologia");
        assertFalse(c.validarCondicoes());
    }
}
