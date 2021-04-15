package fundamentos;

public class ConversaoDeTiposNumericos {
    public static void main(String[] args) {
        double a = 1.45654654654654654;
        // double a = 1;
        // aqui houve uma conversao implicita, pois o valor "1" é inteiro que é
        // diferente do 1.0
        // para o double, porem como o valor em si cabe dentro do float ele fez isso
        // automagicamente
        System.out.println(a);

        float b = (float) 1.45654654654654654; // Conversão EXplicita
        // float b = 1.12020F;
        System.out.println(b);

        int c = 400;
        byte d = (byte) c;
        System.out.println(d);

    }
}
