package org.example;

public class OperacaoFactory {

    public static Operacao obterOperacao(String operacao) {
        switch (operacao.toUpperCase()) {
            case "SOMAR":
                return OperacaoSomar.getInstance();
            case "SUBTRAIR":
                return OperacaoSubtrair.getInstance();
            case "MULTIPLICAR":
                return OperacaoMultiplicar.getInstance();
            case "DIVIDIR":
                return OperacaoDividir.getInstance();
            case "MEDIA":
                return OperacaoMedia.getInstance();
            default:
                throw new IllegalArgumentException("Operação inválida");
        }
    }
}
