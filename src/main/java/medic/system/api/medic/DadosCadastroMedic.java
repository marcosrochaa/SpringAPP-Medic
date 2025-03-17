package medic.system.api.medic;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import medic.system.api.adress.DataAdress;

public record DadosCadastroMedic(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull
        DataAdress endereco) {
}
