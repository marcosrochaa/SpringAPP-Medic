package medic.system.api.adress;

public record DataAdress(
        String logradouro,
        String bairro,
        String cep,
        String numero,
        String cidade,
        String uf,
        String complemento
) {
}
