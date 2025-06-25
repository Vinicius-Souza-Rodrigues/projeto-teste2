package Projeto.Treino.Projeto.Treino.Tarefa;

import Projeto.Treino.Projeto.Treino.Tarefa.DTOs.TarefaDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TarefaController {

    private final TarefaService tarefaService;

    @PostMapping("/criar")
    public ResponseEntity<String> CadastrarTarefar(@RequestBody TarefaDto request) {
        tarefaService.CriarTarefa(
                request.getTitulo(),
                request.getDescricao(),
                request.getData_incio(),
                request.getConcluido()
        );

        return ResponseEntity.ok("Projeto " + request.getTitulo() + " criada com sucesso!");
    }
}
