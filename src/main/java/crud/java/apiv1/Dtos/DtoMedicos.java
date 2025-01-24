package crud.java.apiv1.Dtos;

import crud.java.apiv1.Enums.EspecialidadeEnum;

public record DtoMedicos(String nome, String email, String crm, EspecialidadeEnum especialidade, DtoEnderecos endereco) {
}
