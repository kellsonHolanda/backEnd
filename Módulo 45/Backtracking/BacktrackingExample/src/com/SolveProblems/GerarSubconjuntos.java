package com.SolveProblems;

import java.util.ArrayList;
import java.util.List;

public class GerarSubconjuntos {

    public static void main(String[] args) {
        int[] S1 = { 1, 2, 3 };
        int n1 = 2;
        System.out.println(gerarSubconjuntos(S1, n1));

        int[] S2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n2 = 4;
        System.out.println(gerarSubconjuntos(S2, n2));

        int[] S3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int n3 = 3;
        System.out.println(gerarSubconjuntos(S3, n3));
    }

    private static List<List<Integer>> gerarSubconjuntos(int[] S, int n) {
        List<List<Integer>> sublistas = new ArrayList<>();
        if (n > S.length || n <= 0) {
            return sublistas;
        }
        backtrack(S, n, 0, new ArrayList<>(), sublistas);
        return sublistas;
    }

    private static void backtrack(int[] S, int n, int inicio, List<Integer> sublistaAtual,
            List<List<Integer>> sublistas) {
        if (sublistaAtual.size() == n) {
            sublistas.add(new ArrayList<>(sublistaAtual));
            return;
        }
        for (int i = inicio; i < S.length; i++) {
            sublistaAtual.add(S[i]);
            backtrack(S, n, i + 1, sublistaAtual, sublistas);
            sublistaAtual.remove(sublistaAtual.size() - 1);
        }
    }
}
