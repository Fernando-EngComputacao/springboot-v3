package font.code.api.controller;

import font.code.api.model.endereco.Endereco;
import font.code.api.model.medico.DataMedico;
import font.code.api.model.medico.Medico;
import font.code.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    public void cadastrar(@RequestBody DataMedico dados) {
        medicoRepository.save(new Medico(dados));
    }
}

