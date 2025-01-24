package crud.java.apiv1.Entities;

import crud.java.apiv1.Dtos.DtoMedicos;
import crud.java.apiv1.Enums.EspecialidadeEnum;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "medicos")
@Entity(name = "MedicosEntity")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class MedicosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private EspecialidadeEnum especialidade;

    @Embedded
    private Endereco endereco;


    public MedicosEntity(DtoMedicos dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());









    }
}
