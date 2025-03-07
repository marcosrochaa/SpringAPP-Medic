package medic.system.api.medic;

import medic.system.api.adress.DataAdress;

public record DadosCadastroMedic(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DataAdress endereco) {
}
