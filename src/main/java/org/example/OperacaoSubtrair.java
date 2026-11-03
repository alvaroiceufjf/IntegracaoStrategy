package org.example;


public class OperacaoSubtrair extends Operacao {

    private static OperacaoSubtrair instance = new OperacaoSubtrair();

    private OperacaoSubtrair() {}

    public static OperacaoSubtrair getInstance() {
        return instance;
    }

    @Override
    protected float executar(float valor1, float valor2) {
        return valor1 - valor2;
    }
}
