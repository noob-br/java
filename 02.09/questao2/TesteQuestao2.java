import java.util.List;

public class TesteQuestao2 {
    public static void main(String[] args) {
        System.out.println("=== Teste Questão 2: Movimentos do Cavalo ===");

        System.out.println("\n--- Teste 1: Centro do tabuleiro (4, 4) ---");
        List<IntegerPair> centro = MovimentosCavalo.movimentosPossiveisCavalo(4, 4);
        System.out.println("Posições obtidas: " + centro);
        System.out.println("Total de movimentos: " + centro.size() + " (Esperado: 8)");

        System.out.println("\n--- Teste 2: Canto inferior esquerdo (0, 0) ---");
        List<IntegerPair> canto0 = MovimentosCavalo.movimentosPossiveisCavalo(0, 0);
        System.out.println("Posições obtidas: " + canto0);
        System.out.println("Total de movimentos: " + canto0.size() + " (Esperado: 2 -> [(2, 1), (1, 2)])");

        System.out.println("\n--- Teste 3: Canto superior direito (7, 7) ---");
        List<IntegerPair> canto7 = MovimentosCavalo.movimentosPossiveisCavalo(7, 7);
        System.out.println("Posições obtidas: " + canto7);
        System.out.println("Total de movimentos: " + canto7.size() + " (Esperado: 2 -> [(5, 6), (6, 5)])");

        System.out.println("\n--- Teste 4: Validação de exceção (-1, 0) ---");
        try {
            MovimentosCavalo.movimentosPossiveisCavalo(-1, 0);
            System.out.println("FALHA: Deveria ter lançado IllegalArgumentException!");
        } catch (IllegalArgumentException e) {
            System.out.println("SUCESSO: Exceção capturada com sucesso (" + e.getMessage() + ")");
        }

        System.out.println("\n--- Teste 5: Validação de exceção (8, 4) ---");
        try {
            MovimentosCavalo.movimentosPossiveisCavalo(8, 4);
            System.out.println("FALHA: Deveria ter lançado IllegalArgumentException!");
        } catch (IllegalArgumentException e) {
            System.out.println("SUCESSO: Exceção capturada com sucesso (" + e.getMessage() + ")");
        }
    }
}
