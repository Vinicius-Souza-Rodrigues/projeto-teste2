package Projeto.Treino.Projeto.Treino.Tarefa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    boolean existsBytitulo(String titulo);
}
