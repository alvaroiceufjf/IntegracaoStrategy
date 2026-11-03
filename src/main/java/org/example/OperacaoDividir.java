package org.example;

public class OperacaoDividir extends Operacao {

    private static OperacaoDividir instance = new OperacaoDividir();

    private OperacaoDividir() {}

    public static OperacaoDividir getInstance() {
        return instance;
    }

    @Override
    protected void validar(float valor1, float valor2) {
        if (valor2 == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        }
    }

    @Override
    protected float executar(float valor1, float valor2) {
        return valor1 / valor2;
    }
}
