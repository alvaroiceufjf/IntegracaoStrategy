package org.example;


public class OperacaoMedia extends Operacao {

    private static OperacaoMedia instance = new OperacaoMedia();

    private OperacaoMedia() {}

    public static OperacaoMedia getInstance() {
        return instance;
    }

    @Override
    protected float executar(float valor1, float valor2) {
        return (valor1 + valor2) / 2;
    }
}