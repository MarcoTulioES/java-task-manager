package com.sistemahospitalar.hospital.service;

import com.sistemahospitalar.hospital.model.*;
import com.sistemahospitalar.hospital.repository.AtendimentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AtendimentoService {
    private final AtendimentoRepository repository;

    public AtendimentoService(AtendimentoRepository repository) { this.repository = repository; }

    public Atendimento salvar(Atendimento atendimento) {
        if (!atendimento.validarCondicoes()) {
            throw new IllegalArgumentException("As condições do tipo de atendimento não foram atendidas.");
        }
        if (atendimento instanceof ProcedimentoCirurgico procedimento
                && atendimento.getProfissionalResponsavel() instanceof Cirurgiao cirurgiao) {
            cirurgiao.registrarProcedimento(procedimento);
        }
        return repository.save(atendimento);
    }

    public List<Atendimento> listar() { return repository.findAll(); }

    public Atendimento buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Atendimento não encontrado."));
    }

    public Atendimento alterarStatus(Long id, com.sistemahospitalar.hospital.model.enums.StatusAtendimentoEnum status) {
        Atendimento atendimento = buscar(id);
        atendimento.alterarStatus(status);
        return repository.save(atendimento);
    }
}
