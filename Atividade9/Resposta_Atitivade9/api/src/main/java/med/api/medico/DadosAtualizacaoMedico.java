package med.api.medico;

import jakarta.validation.constraints.NotNull;
import med.api.medico.DadosEndereco;


public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}

