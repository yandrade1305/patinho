package src.util;

public class Dezena extends Algarismo{

    private static final String[]
            dezenaPorExtenso = {"", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};

    private static final String[]
            onzeADezenove = {"", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};

    public Dezena(int valor, Algarismo algarismoADireita, Classe classe) {
        super(valor, algarismoADireita, classe);
    }

    @Override
    String conector() {
        if (valor != 0 && algarismoAEsquerda != null) {
            return " e ";
        }
        return "";
    }

    @Override
    String representacao() {
        if (valor == 1 && algarismoADireita.valor > 0) {
            return onzeADezenove[algarismoADireita.valor];
        }

        return dezenaPorExtenso[valor];
    }
}
