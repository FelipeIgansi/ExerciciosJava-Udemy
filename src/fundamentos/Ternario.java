package fundamentos;

public class Ternario {
    public static void main(String[] args) {
        // Exemplo1

        double media = 7.6;
        String resultado = media >= 7 ? "Aprovado" : "Reprovado";
        // (se media >= 7) True : False

        System.out.println("O aluno está:  " + resultado);

        // Exemplo 2

        media = 7.6;
        String resultadoParcial = media >= 5 ? "Em recuperação" : "Reprovado";
        String resultadoFinal = media >= 7 ? "Aprovado" : resultadoParcial;
        // (se media >= 7) True : False
        // Obs: para iniciar um ternário tem que ser uma operação lógica
        // String resultadoFinal2 = media - 7 ? "Aprovado" : resultadoParcial; DA ERRO

        System.out.println("O aluno está:  " + resultadoFinal);
    }
}
