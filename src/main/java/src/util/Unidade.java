package src.util;

public class Unidade extends Algarismo{

    private static final String[] unidadePorExtenso = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};

    public Unidade(int valor, Algarismo algarismoADireita, Classe classe) {
        super(valor, algarismoADireita, classe);
    }

    @Override
    String conector() {
        if (valor != 0 && algarismoAEsquerda != null && algarismoAEsquerda.valor != 1) {
            return " e ";
        }
        return "";
    }

    @Override
    String representacao() {
        if ((classe.isSegundaClasse() && valor == 1)
                || (algarismoAEsquerda != null && algarismoAEsquerda.valor == 1)) {

            return "";
        }
        return unidadePorExtenso[valor];
    }
}
