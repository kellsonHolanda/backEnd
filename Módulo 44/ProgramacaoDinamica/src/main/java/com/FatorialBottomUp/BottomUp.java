package com.FatorialBottomUp;

import java.math.BigInteger;
import java.text.DecimalFormat;

public class BottomUp {

    private static BigInteger calcularFatorialBottomUp(int n) {
        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }

    private static String formatarResultadoFatorial(BigInteger resultado) {
        int DIGITOS_MAXIMOS = 10;
        if (resultado.toString().length() > DIGITOS_MAXIMOS) {
            double valorDouble = resultado.doubleValue();
            DecimalFormat formatador = new DecimalFormat("0.##E0");
            return formatador.format(valorDouble);
        } else {
            return resultado.toString();
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int n1 = 10;
        int n2 = 100;
        BigInteger resultadoN = calcularFatorialBottomUp(n);
        BigInteger resultadoN1 = calcularFatorialBottomUp(n1);
        BigInteger resultadoN2 = calcularFatorialBottomUp(n2);
        System.out.println("Fatorial de " + n + " é: " + formatarResultadoFatorial(resultadoN));
        System.out.println("Fatorial de " + n1 + " é: " + formatarResultadoFatorial(resultadoN1));
        System.out.println("Fatorial de " + n2 + " é: " + formatarResultadoFatorial(resultadoN2));
        System.out.println("Fatorial de " + n2 + " em decimal: " + resultadoN2);
    }
}
