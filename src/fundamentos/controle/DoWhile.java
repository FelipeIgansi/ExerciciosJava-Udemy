package fundamentos.controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String texto = "";
        do {
            System.out.println("Diga as palavras mágicas ... ");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado.");
        entrada.close();

    }
}
