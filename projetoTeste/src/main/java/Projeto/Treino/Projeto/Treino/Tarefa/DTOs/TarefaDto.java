package Projeto.Treino.Projeto.Treino.Tarefa.DTOs;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TarefaDto {
    private Long id;
    private String titulo;
    private String Descricao;
    private LocalDateTime data_incio;
    private Boolean concluido;
}
