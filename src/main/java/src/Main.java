package src;

import src.menu.Menu;
import src.util.NumeroPorExtenso;

import java.util.InputMismatchException;
import java.util.Scanner;

import static src.menu.Menu.imprimeFinal;
import static src.menu.Menu.imprimeRefrao;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer opcao = 0;

        Menu.imprimeMenu();
        try {
            opcao = scanner.nextInt();
        } catch (InputMismatchException ex) {
            Menu.imprimeCaractereInvalido();
        }
        switch (opcao) {
            case 1:
                Menu.imprimeInserirNumero();
                Integer n = scanner.nextInt();
                if (n == 0) {
                    Menu.imprimeOpcaoInvalida();
                } else {
                    for (long i = n; i > 0; i--) {
                        String s = NumeroPorExtenso.get(i);
                        if (i == 1) {
                            imprimeRefrao(n, s);
                        } else {
                            imprimeFinal(i, s);
                        }
                    }
                }
                break;
            case 2:
                Menu.imprimeSaida();
                break;
            default:
                Menu.imprimeOpcaoInvalida();
                break;
        }
    }
}
