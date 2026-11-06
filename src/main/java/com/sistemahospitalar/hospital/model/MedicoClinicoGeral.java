package com.sistemahospitalar.hospital.model;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MedicoClinicoGeral extends ProfissionalSaude {
    public void encaminharPaciente(Paciente paciente, MedicoEspecialista especialista) {
        if (paciente == null) throw new IllegalArgumentException("Paciente obrigatório para encaminhamento.");
        if (especialista == null) throw new IllegalArgumentException("Especialista obrigatório para encaminhamento.");
    }
}
