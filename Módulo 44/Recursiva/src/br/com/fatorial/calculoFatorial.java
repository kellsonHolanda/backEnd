package br.com.fatorial;

import java.math.BigInteger;

public class calculoFatorial {
	private static BigInteger calcularFatorial(BigInteger n) {
		if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
			return BigInteger.ONE;
		}
		return n.multiply(calcularFatorial(n.subtract(BigInteger.ONE)));
	}

	public static void main(String[] args) {
		BigInteger n = BigInteger.valueOf(7);
		BigInteger n1 = BigInteger.valueOf(10);
		BigInteger n2 = BigInteger.valueOf(100);

		BigInteger resultadoN = calcularFatorial(n);
		BigInteger resultadoN1 = calcularFatorial(n1);
		BigInteger resultadoN2 = calcularFatorial(n2);

		System.out.println("Fatorial de " + n + " é: " + resultadoN);
		System.out.println("Fatorial de " + n1 + " é: " + resultadoN1);
		System.out.println("Fatorial de " + n2 + " é: " + resultadoN2);
	}
}
