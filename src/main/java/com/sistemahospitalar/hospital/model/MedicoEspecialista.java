package com.sistemahospitalar.hospital.model; import jakarta.persistence.*; import jakarta.validation.constraints.*; import lombok.*;
@Entity @Getter @Setter @NoArgsConstructor @EqualsAndHashCode(callSuper=true) public class MedicoEspecialista extends ProfissionalSaude { @NotBlank @Column(nullable=false,length=100) private String especialidade; }
