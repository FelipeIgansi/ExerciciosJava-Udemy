package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("Teste");
        System.out.printf("Numeros da mega da virada:  %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.1f", 1234.56789);

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nDigite seu nome:  ");
        String nome = teclado.nextLine();
        System.out.print("\nDigite seu sobrenome:  ");
        String sobrenome = teclado.nextLine();
        System.out.print("\nDigite sua idade:  ");
        int idade = teclado.nextInt();

        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        teclado.close();
    }
}