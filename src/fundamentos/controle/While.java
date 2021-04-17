package fundamentos.controle;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.printf("i = %d\n", i);
            i++;
        }

        // Exemplo 2

        Scanner entrada = new Scanner(System.in);
        String valor = "";
        // while(!valor.equalsIgnoreCase("Sair"))
        while (!valor.toLowerCase().equals("sair")) {
            System.out.print("Diga:  ");
            valor = entrada.nextLine();
        }
        entrada.close();

    }
}
