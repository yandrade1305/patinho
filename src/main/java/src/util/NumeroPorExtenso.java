package src.util;

import java.util.ArrayList;
import java.util.List;

public class NumeroPorExtenso {

    private NumeroPorExtenso() {}

    public static String get(long numero) {

        int[] rawAlgarismos = getAlgarismos(numero);

        List<Classe> classes = buildClassesFromAlgarismos(rawAlgarismos);

        return buildExtensoFromClasses(classes);
    }

    private static List<Classe> buildClassesFromAlgarismos(int[] rawAlgarismos) {

        List<Classe> classes = new ArrayList<>();

        int numeroClasse = 0;
        Classe classe = new Classe(numeroClasse++);
        Algarismo algarismoADireita = null;
        int casa = 0;

        for (int algarismoPos = rawAlgarismos.length - 1; algarismoPos >= 0; algarismoPos--) {

            Algarismo algarismo = AlgarismoFactory.create(casa, rawAlgarismos[algarismoPos], algarismoADireita, classe);

            algarismoADireita = algarismo;

            classe.algarismos.add(algarismo);

            casa++;
            if (casa == 3 || algarismoPos == 0) {
                classes.add(classe);
                classe = new Classe(numeroClasse++);
                casa = 0;
            }
        }
        return classes;
    }

    private static String buildExtensoFromClasses(List<Classe> classes) {

        StringBuilder extenso = new StringBuilder();

        for (Classe classeZ : classes) {

            StringBuilder extensoClasse = new StringBuilder();

            for (Algarismo algarismo : classeZ.algarismos) {
                extensoClasse.insert(0, algarismo.conector() + algarismo.representacao());
            }

            extenso.insert(0, classeZ.conector() + extensoClasse + classeZ.representacao());
        }

        return extenso.toString().trim();
    }

    private static int[] getAlgarismos(long numero) {

        String algarismos = Long.toString(numero);

        int[] result = new int[algarismos.length()];

        for (int i = 0; i < algarismos.length(); i++) {
            result[i] = algarismos.charAt(i) - '0';
        }

        return result;
    }
}