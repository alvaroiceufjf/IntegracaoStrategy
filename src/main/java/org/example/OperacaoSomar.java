package org.example;


public class OperacaoSomar extends Operacao {

    private static OperacaoSomar instance = new OperacaoSomar();

    private OperacaoSomar() {}

    public static OperacaoSomar getInstance() {
        return instance;
    }

    @Override
    protected float executar(float valor1, float valor2) {
        return valor1 + valor2;
    }
}
