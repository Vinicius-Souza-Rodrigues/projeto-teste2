package Projeto.Treino.Projeto.Treino.Exceptions;

public class TarefaJaExistenteException extends RuntimeException {
    public TarefaJaExistenteException(String mensagem) {
        super(mensagem);
    }
}

