package br.com.treinaweb.twprojects.core.exception;

public class EmployeeNotFoundException extends ModelNotFoundException{

    public EmployeeNotFoundException() {
        super("Funcionário não encontrado.");
    }

    public EmployeeNotFoundException(String msg) {
        super(msg);
    }
}
