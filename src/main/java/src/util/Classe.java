package src.util;

import java.util.ArrayList;
import java.util.List;

public class Classe {

    private static final String[] classeSingular = {"", " mil", " milhão", " bilhão", " trilhão", " quatrilhão"};
    private static final String[] classePlural = {"", " mil", " milhões", " bilhões", " trilhões", " quatrilhões"};

    private int numeroClasse;

    List<Algarismo> algarismos = new ArrayList<>();

    Classe(int numeroClasse) {
        this.numeroClasse = numeroClasse;
    }

    String conector() {

        if (totalClasse() == 0 || souUltimaClasseAEsquerda() || valorCentena() == 0) {
            return "";
        }

        if (totalClasse() % 100 == 0) {
            return " e ";
        }

        return ", ";
    }

    String representacao() {

        if (totalClasse() == 0) {
            return "";
        }

        if (totalClasse() == 1) {
            return classeSingular[numeroClasse];
        }
        return classePlural[numeroClasse];
    }

    boolean isSegundaClasse() {
        return numeroClasse == 1;
    }

    private int totalClasse() {
        StringBuilder total = new StringBuilder();

        for (Algarismo algarismo : algarismos) {
            total.insert(0, algarismo.valor);
        }
        return Integer.parseInt(total.toString());
    }

    private boolean souUltimaClasseAEsquerda() {
        return algarismos.get(algarismos.size() - 1).algarismoAEsquerda == null;
    }

    private int valorCentena() {
        return algarismos.get(algarismos.size() - 1).valor;
    }
}
