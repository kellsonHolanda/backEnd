package br.com.fatorial;

import java.math.BigInteger;

public class FatorialBigInt {

    private static BigInteger fatorialBigInt(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return n.multiply(fatorialBigInt(n.subtract(BigInteger.ONE)));
    }

    private static String formatarResultadoFatorial(BigInteger resultado) {
        String resultadoStr = resultado.toString();
        int tamanho = resultadoStr.length();
        int DIGITOS_MAXIMOS = 15;
        if (tamanho > DIGITOS_MAXIMOS) {
            int expoente = tamanho - 1;
            return "10^" + expoente + "\nEm formatação decimal é: " + resultado.toString();
        } else {
            return resultadoStr;
        }
    }

    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf(110);
        BigInteger resultadoN = fatorialBigInt(n);
        String resultadoFormatadoN = formatarResultadoFatorial(resultadoN);
        System.out.println("O fatorial de " + n + " é: " + resultadoFormatadoN);
    }
}