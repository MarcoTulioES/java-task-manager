package com.sistemahospitalar.hospital.model;
import com.sistemahospitalar.hospital.model.enums.*; import jakarta.persistence.*; import jakarta.validation.constraints.*; import lombok.*; import java.time.*;
@Entity @Getter @Setter @NoArgsConstructor
public class Internacao { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @NotNull @ManyToOne(optional=false) private Paciente paciente; @NotNull @ManyToOne(optional=false) private Quarto quarto; @NotNull @Column(nullable=false) private LocalDateTime dataEntrada; private LocalDateTime dataAlta; @Enumerated(EnumType.STRING) @Column(nullable=false) private SituacaoInternacaoEnum situacao=SituacaoInternacaoEnum.ATIVA; @Size(max=500) private String observacoes; }
