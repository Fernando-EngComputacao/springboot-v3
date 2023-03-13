package font.code.api.model.medico;

import font.code.api.model.endereco.DataEndereco;

public record DataMedico(String nome, String email, String crm, Especialidade especialidade, DataEndereco endereco) {
}
