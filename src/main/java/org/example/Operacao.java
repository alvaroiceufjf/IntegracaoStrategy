package org.example;

public abstract class Operacao {

    public final float calcular(float valor1, float valor2) {
        validar(valor1, valor2);
        return executar(valor1, valor2);
    }

    protected void validar(float valor1, float valor2) {
    }

    protected abstract float executar(float valor1, float valor2);
}
