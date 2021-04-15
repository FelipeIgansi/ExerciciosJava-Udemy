package fundamentos;

public class Wrapper {
    public static void main(String[] args) {

        // Byte
        Byte b = 100;
        Short s = 1000;

        // Integer
        Integer i = 10000;
        // Integer.parseInt("10000");
        Long l = 1000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo.toString().toUpperCase());
    }
}
