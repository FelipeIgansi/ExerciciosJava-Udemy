package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o salário de Janeiro: ");
        String valorJaneiro = teclado.nextLine().replace(",", ".");
        System.out.print("Informe o salário de Fevereiro: ");
        String valorFevereiro = teclado.nextLine().replace(",", ".");
        System.out.print("Informe o salário de Março: ");
        String valorMarco = teclado.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(valorJaneiro);
        double salario2 = Double.parseDouble(valorFevereiro);
        double salario3 = Double.parseDouble(valorMarco);

        System.out.println("A média salárial no primeiro trimestre foi:  " + ((salario1 + salario2 + salario3) / 3));

        teclado.close();
    }
}
