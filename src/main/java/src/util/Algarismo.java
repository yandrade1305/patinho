package src.util;

public abstract class Algarismo {
    protected Algarismo algarismoADireita;
    protected Algarismo algarismoAEsquerda;
    protected int valor;
    protected Classe classe;

    Algarismo(int valor, Algarismo algarismoADireita, Classe classe) {

        this.valor = valor;
        this.classe = classe;
        this.algarismoADireita = algarismoADireita;

        if (algarismoADireita != null) {
            algarismoADireita.algarismoAEsquerda = this;
        }
    }

    abstract String representacao();

    abstract String conector();
}
