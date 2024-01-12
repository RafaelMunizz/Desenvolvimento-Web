package med.api.medico;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

public record DadosListagemMedico(Long id, String nome, String email, String crm, Especialidade especialidade) {


    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
    
    @RequestBody @Valid DadosCadastroMedico dados):
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosCadastroMedico dados) {


    }



}


