package src.util;

public class Centena extends Algarismo{

    private static final String[] centenaPorExtenso = {"", "cem", "duzentos", "trezentos", "quatrocentos",
            "quinhentos", "seissentos", "setecentos", "oitocentos", "novecentos"};

    private static final String CENTO = "cento";

    public Centena(int valor, Algarismo algarismoADireita, Classe classe) {
        super(valor, algarismoADireita, classe);
    }

    @Override
    String conector() {
        return "";
    }

    @Override
    String representacao() {
        if (valor == 1
                && ((algarismoADireita.valor > 0) || (algarismoADireita.algarismoADireita.valor > 0))) {

            return CENTO;
        }
        return centenaPorExtenso[valor];
    }
}
