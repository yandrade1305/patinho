package src.menu;

import src.util.NumeroPorExtenso;

public abstract class Menu {

    public static void imprimeMenu(){
        System.out.println("================================================");
        System.out.println("              SEJA BEM-VINDO AO              ");
        System.out.println("         _____      _   _       _           \n" +
                "        |  __ \\    | | (_)     | |          \n" +
                "        | |__) |_ _| |_ _ _ __ | |__   ___  \n" +
                "        |  ___/ _` | __| | '_ \\| '_ \\ / _ \\ \n" +
                "        | |  | (_| | |_| | | | | | | | (_) |\n" +
                "        |_|   \\__,_|\\__|_|_| |_|_| |_|\\___/ \n" +
                "                                     ");
        System.out.println("================================================");
        System.out.println("Sobre: O programa patinho imprime a letra da");
        System.out.println("música Cinco patinhos da Xuxa. Com base no numero");
        System.out.println("que você usuario inserir.");
        System.out.println("================================================");
        System.out.println("                  OPCOES                  ");
        System.out.println("1:   COMECAR                                      ");
        System.out.println("2:   SAIR                                         ");
        System.out.println("================================================");
        System.out.print("Insira a opcao: ");
    }

    public static void imprimeInserirNumero() {
        System.out.print("Insira um numero entre 1 e 2.147.483.647: ");
    }

    public static void imprimeSaida() {
        System.out.println("Voce saiu da aplicacao, tchau!");
    }

    public static void imprimeOpcaoInvalida() {
        System.out.println("Opcao invalida! Tente novamente");
    }

    public static void imprimeFinal(long i, String s) {
        System.out.println(s + " patinhos foram passear");
        System.out.println("Álem das montanhas");
        System.out.println("para brincar");
        System.out.println("A mamãe gritou");
        System.out.println("Quá, quá, quá, quá");
        System.out.print("Mas só ");
        String s2 = NumeroPorExtenso.get(i - 1);
        System.out.print(s2);
        System.out.println(" patinhos voltaram de lá.");
    }

    public static void imprimeRefrao(Integer n, String s) {
        System.out.println(s + " patinhos foram passear");
        System.out.println("Álem das montanhas");
        System.out.println("para brincar");
        System.out.println("A mamãe gritou");
        System.out.println("Quá, quá, quá, quá");
        System.out.println("Mas nenhum patinho voltou de lá.");
        String s3 = NumeroPorExtenso.get(n);
        System.out.println("A mamãe patinha foi procurar");
        System.out.println("Além das montanhas");
        System.out.println("Na beira do mar");
        System.out.println("A mamãe gritou: Quá, quá, quá, quá");
        System.out.println("E os " + s3 + " patinhos voltaram de lá");
    }

    public static void imprimeCaractereInvalido(){
        System.out.println("Entrada inválida, digite um número");
    }
}
