package Projeto.Treino.Projeto.Treino.Tarefa;

import Projeto.Treino.Projeto.Treino.Exceptions.TarefaJaExistenteException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public void CriarTarefa(String titulo, String descricao, LocalDateTime data_inicio, boolean concluida) {

        if (tarefaRepository.existsBytitulo(titulo)) {
            throw new TarefaJaExistenteException("tarefa com esse titulo ja existe!");
        }

        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo(titulo);
        tarefa.setDescricao(descricao);
        tarefa.setData_inicio(LocalDateTime.now());
        tarefa.setConcluida(concluida);

        tarefaRepository.save(tarefa);
    }

    public void FinalizarTarefa() {

    }

    public void ListarTarefa() {

    }

}
