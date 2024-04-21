package br.com.treinaweb.twprojects.core.exception;

public class ClientNotFoundException extends ModelNotFoundException{

    public ClientNotFoundException(String msg) {
        super(msg);
    }

    public ClientNotFoundException() {
        super("Cliente não encontrado.");
    }
}
