package fundamentos;

public class DesafioAritimeticos {
    public static void main(String[] args) {
        int a = 6 * (3 + 2);
        a = (int) Math.pow(a, 2);
        a = a / 6;

        int b = (1 - 5) * (2 - 7);
        b = b / 2;
        b = (int) Math.pow(b, 2);

        int c = a - b;
        c = (int) Math.pow(c, 3);
        int d = (int) Math.pow(10, 3);
        int total = c / d;

        System.out.println(total);
    }
}
