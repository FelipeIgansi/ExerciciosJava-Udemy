package fundamentos.classe;

public class mainProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.nome= "Notebook";
        p1.preco = 4654;
        p1.desconto = 0.25;

        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.desconto);

        Produto p2 = new Produto();

        p2.nome= "Sunsung";
        p2.preco = 2500;
        p2.desconto = 0.75;


        System.out.println(p2.nome);
        System.out.println(p2.preco);
        System.out.println(p2.desconto);


    }
}
