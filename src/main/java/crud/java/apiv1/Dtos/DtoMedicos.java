package crud.java.apiv1.Dtos;

import crud.java.apiv1.Enums.EspecialidadeEnum;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DtoMedicos(

        @NotBlank
        String nome,
        @NotBlank @Email
        String email,
        @NotBlank @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        EspecialidadeEnum especialidade,
        @NotNull @Valid
        DtoEnderecos endereco
) {
}
