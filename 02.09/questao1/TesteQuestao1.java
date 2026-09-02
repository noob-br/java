public class TesteQuestao1 {
    public static void main(String[] args) {
        System.out.println("=== Teste Questão 1: Triângulos Pitagóricos ===");

        int teste1 = TriangulosPitagoricos.quantidadeTriangulosPitagoricos(1, 20);
        System.out.println("Intervalo [1, 20] -> " + teste1 + " triângulos (Esperado: 6)");

        int teste2 = TriangulosPitagoricos.quantidadeTriangulosPitagoricos(50, 1000);
        System.out.println("Intervalo [50, 1000] -> " + teste2 + " triângulos");
    }
}
