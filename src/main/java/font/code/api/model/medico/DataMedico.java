package font.code.api.model.medico;

import font.code.api.model.endereco.DataEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DataMedico(
        @NotBlank
        String nome,
        @NotBlank @Email
        String email,
        @NotBlank @Pattern(regexp = "\\d{4,6}") // d (dígito) { de 4 a 6 dígitos}
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull @Valid
        DataEndereco endereco
) {}