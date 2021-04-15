package fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer num1 = 1000;
        System.out.println(num1.toString().length());

        int num2 = 1000;
        System.out.println(Integer.toString(num2));

        System.out.println(("" + num2).length());// É possivel, porem né não use

        // Esses exeplos tbm servem para os outros tipos primitivos

    }
}
