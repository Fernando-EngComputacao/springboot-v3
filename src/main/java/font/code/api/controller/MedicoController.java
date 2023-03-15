package font.code.api.controller;

import font.code.api.model.medico.DataMedico;
import font.code.api.model.medico.ListDataMedico;
import font.code.api.model.medico.Medico;
import font.code.api.repository.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DataMedico dados) {
        medicoRepository.save(new Medico(dados));
    }

    @GetMapping
    public Page<ListDataMedico> buscar(@PageableDefault(size = 10, sort = {"nome"}) Pageable page) {//sort -> ordena de de acordo com o {"atributo"}
        return medicoRepository.findAll(page).map(ListDataMedico::new);
    }
}

