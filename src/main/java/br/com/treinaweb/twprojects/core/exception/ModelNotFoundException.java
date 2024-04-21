package br.com.treinaweb.twprojects.core.exception;

public class ModelNotFoundException extends RuntimeException{

    public ModelNotFoundException(String msg) {
        super(msg);
    }
}
