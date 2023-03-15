package font.code.api.model.medico;

public record ListDataMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade

) {

    public ListDataMedico(Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
