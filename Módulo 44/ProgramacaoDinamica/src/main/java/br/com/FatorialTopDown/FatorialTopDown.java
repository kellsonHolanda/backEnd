package br.com.FatorialTopDown;

import java.math.BigInteger;
import java.text.DecimalFormat;

public class FatorialTopDown {

    private static BigInteger[] memo;

    private static BigInteger calcularFatorialTopDown(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        if (memo[n] != null) {
            return memo[n];
        }
        memo[n] = BigInteger.valueOf(n).multiply(calcularFatorialTopDown(n - 1));
        return memo[n];
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
        memo = new BigInteger[111];
        int n = 7;
        int n1 = 10;
        int n2 = 110;
        BigInteger resultadoN = calcularFatorialTopDown(n);
        BigInteger resultadoN1 = calcularFatorialTopDown(n1);
        BigInteger resultadoN2 = calcularFatorialTopDown(n2);
        System.out.println("Fatorial de " + n + " é: " + formatarResultadoFatorial(resultadoN));
        System.out.println("Fatorial de " + n1 + " é: " + formatarResultadoFatorial(resultadoN1));
        System.out.println("Fatorial de " + n2 + " é: " + formatarResultadoFatorial(resultadoN2));
        System.out.println("Fatorial de " + n2 + " em decimal: " + resultadoN2);
    }
}