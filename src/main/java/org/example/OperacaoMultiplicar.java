package org.example;

public class OperacaoMultiplicar extends Operacao {

    private static OperacaoMultiplicar instance = new OperacaoMultiplicar();

    private OperacaoMultiplicar() {}

    public static OperacaoMultiplicar getInstance() {
        return instance;
    }

    @Override
    protected float executar(float valor1, float valor2) {
        return valor1 * valor2;
    }
}
