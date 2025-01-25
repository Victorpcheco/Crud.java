package crud.java.apiv1.Dtos;

import crud.java.apiv1.Entities.MedicosEntity;
import crud.java.apiv1.Enums.EspecialidadeEnum;

public record DtoListagemMedicos(String nome, String email, String crm, EspecialidadeEnum especialidade) {


    public DtoListagemMedicos (MedicosEntity medico){

        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
