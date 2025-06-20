package Projeto.Treino.Projeto.Treino.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TarefaJaExistenteException.class)
    public ResponseEntity<String> handleTarefaJaExistente(TarefaJaExistenteException excep) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(excep.getMessage());
    }

}
