package com.SolveProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class calculoTroco {

    public interface Moedas {
        int[] getMoedasDisponiveis();
    }

    public static List<Integer> getContadorMinimo(int valor, final Moedas moedas) {
        List<Integer> resultado = new ArrayList<>();
        int[] moedasDisponiveis = moedas.getMoedasDisponiveis();
        Arrays.sort(moedasDisponiveis);
        for (int i = moedasDisponiveis.length - 1; i >= 0; i--) {
            while (valor >= moedasDisponiveis[i]) {
                valor -= moedasDisponiveis[i];
                resultado.add(moedasDisponiveis[i]);
            }
        }
        return resultado;
    }

    public static class MoedasDisponiveis implements Moedas {
        @Override
        public int[] getMoedasDisponiveis() {
            return new int[] { 5, 2, 1 };
        }
    }

    public static void main(String[] args) {
        int valor = 18;
        Moedas moedas = new MoedasDisponiveis();
        List<Integer> resultado = getContadorMinimo(valor, moedas);
        System.out.println(resultado);
    }
}