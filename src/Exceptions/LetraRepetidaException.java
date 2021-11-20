package Exceptions;

public class LetraRepetidaException extends RuntimeException {
    public LetraRepetidaException () {
        super("A letra fornecida já foi escrita anteriormente e está repetindo.");
    }
}
