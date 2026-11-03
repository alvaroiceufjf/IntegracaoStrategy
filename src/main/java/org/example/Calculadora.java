package org.example;

public class Calculadora {

    private static Calculadora instance = new Calculadora();

    private Calculadora() {}

    public static Calculadora getInstance() {
        return instance;
    }

    public float calcular(float valor1, float valor2, String operacao) {
        Operacao op = OperacaoFactory.obterOperacao(operacao);
        return op.calcular(valor1, valor2);
    }
}
