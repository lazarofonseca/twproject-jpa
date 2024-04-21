package br.com.treinaweb.twprojects.core.exception;

public class EmployeeNoteFoundException extends ModelNotFoundException{

    public EmployeeNoteFoundException() {
        super("Funcionário não encontrado.");
    }

    public EmployeeNoteFoundException(String msg) {
        super(msg);
    }
}
