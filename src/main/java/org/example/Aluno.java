package org.example;

public class Aluno {

    private float nota;

    public float getNota() {
        return nota;
    }

    public void somarNota(float nota1, float nota2) {
        this.nota = Calculadora.getInstance().calcular(nota1, nota2, "SOMAR");
    }

    public void subtrairNota(float nota1, float nota2) {
        this.nota = Calculadora.getInstance().calcular(nota1, nota2, "SUBTRAIR");
    }

    public void dividirNota(float nota1, float nota2) {
        this.nota = Calculadora.getInstance().calcular(nota1, nota2, "DIVIDIR");
    }

    public void multiplicarNota(float nota1, float nota2) {
        this.nota = Calculadora.getInstance().calcular(nota1, nota2, "MULTIPLICAR");
    }

    public void calcularMediaNotas(float nota1, float nota2) {
        this.nota = Calculadora.getInstance().calcular(nota1, nota2, "MEDIA");
    }
}
