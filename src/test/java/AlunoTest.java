package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void setUp() {
        aluno = new Aluno();
    }

    @Test
    void deveSomarNotas() {
        aluno.somarNota(7.0f, 8.0f);
        assertEquals(15.0f, aluno.getNota());
    }

    @Test
    void deveSubtrairNotas() {
        aluno.subtrairNota(10.0f, 4.0f);
        assertEquals(6.0f, aluno.getNota());
    }

    @Test
    void deveMultiplicarNotas() {
        aluno.multiplicarNota(5.0f, 3.0f);
        assertEquals(15.0f, aluno.getNota());
    }

    @Test
    void deveDividirNotas() {
        aluno.dividirNota(9.0f, 2.0f);
        assertEquals(4.5f, aluno.getNota());
    }

    @Test
    void deveCalcularMediaNotas() {
        aluno.calcularMediaNotas(8.0f, 6.0f);
        assertEquals(7.0f, aluno.getNota());
    }

    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        try {
            aluno.dividirNota(10.0f, 0.0f);
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoOperacaoInvalida() {
        try {
            Calculadora.getInstance().calcular(10.0f, 2.0f, "INVALIDA");
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Operação inválida", e.getMessage());
        }
    }
}