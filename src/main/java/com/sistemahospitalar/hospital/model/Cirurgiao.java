package com.sistemahospitalar.hospital.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Cirurgiao extends ProfissionalSaude {
    @NotBlank
    @Column(nullable = false, length = 100)
    private String areaCirurgica;

    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "profissionalResponsavel")
    private List<ProcedimentoCirurgico> procedimentosRealizados = new ArrayList<>();

    public void registrarProcedimento(ProcedimentoCirurgico procedimento) {
        if (procedimento == null) throw new IllegalArgumentException("Procedimento obrigatório.");
        if (!procedimentosRealizados.contains(procedimento)) procedimentosRealizados.add(procedimento);
    }
}
