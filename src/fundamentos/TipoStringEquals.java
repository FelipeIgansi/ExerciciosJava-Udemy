package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String s2 = teclado.nextLine();
        // Obs: o "next" já faz por padrão o trim, porem o "nextLine" não.
        String s1 = teclado.next();

        System.out.println("S1:" + s1);
        System.out.println("S2:" + s2);
        System.out.println("\n2" == s1);
        System.out.println("2".equals(s1));
        System.out.println("2".equals(s2));
        teclado.close();
    }
}
