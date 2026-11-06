package com.sistemahospitalar.hospital.controller;

import com.sistemahospitalar.hospital.dto.AlterarStatusConsultaRequest;
import com.sistemahospitalar.hospital.model.Atendimento;
import com.sistemahospitalar.hospital.model.enums.StatusAtendimentoEnum;
import com.sistemahospitalar.hospital.service.AtendimentoService;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class AtendimentoController {
    private final AtendimentoService service;

    public AtendimentoController(AtendimentoService service) { this.service = service; }

    @PostMapping
    public ResponseEntity<Atendimento> criar(@Valid @RequestBody Atendimento atendimento) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(atendimento));
    }

    @GetMapping
    public List<Atendimento> listar() { return service.listar(); }

    @PatchMapping(value = "/{id}/status", consumes = "application/json")
    public Atendimento status(@PathVariable Long id, @Valid @RequestBody AlterarStatusConsultaRequest request) {
        return service.alterarStatus(id, request.status());
    }

    @PatchMapping(value = "/{id}/status", params = "valor")
    public Atendimento statusPorParametro(@PathVariable Long id, @RequestParam StatusAtendimentoEnum valor) {
        return service.alterarStatus(id, valor);
    }
}
