import java.util.List;

public class TesteQuestao2 {
    public static void main(String[] args) {
        System.out.println("=== Teste 1: Centro do tabuleiro (4, 4) ===");
        try {
            List<IntegerPair> centro = AvaliacaoDS1p1.movimentosPossiveisCavalo(4, 4);
            System.out.println("Resultado: " + centro);
            System.out.println("Total de movimentos: " + (centro != null ? centro.size() : "null") + " (esperado: 8)");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=== Teste 2: Canto do tabuleiro (0, 0) ===");
        try {
            List<IntegerPair> canto = AvaliacaoDS1p1.movimentosPossiveisCavalo(0, 0);
            System.out.println("Resultado: " + canto);
            System.out.println("Total de movimentos: " + (canto != null ? canto.size() : "null")
                    + " (esperado: 2 -> [(2, 1), (1, 2)])");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=== Teste 3: Outro canto do tabuleiro (7, 7) ===");
        try {
            List<IntegerPair> cantoSuperior = AvaliacaoDS1p1.movimentosPossiveisCavalo(7, 7);
            System.out.println("Resultado: " + cantoSuperior);
            System.out.println("Total de movimentos: " + (cantoSuperior != null ? cantoSuperior.size() : "null")
                    + " (esperado: 2 -> [(5, 6), (6, 5)])");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=== Teste 4: Posição inválida (-1, 0) ===");
        try {
            AvaliacaoDS1p1.movimentosPossiveisCavalo(-1, 0);
            System.out.println("FALHA: Deveria ter lançado IllegalArgumentException!");
        } catch (IllegalArgumentException e) {
            System.out.println("SUCESSO: Exceção capturada corretamente para (-1, 0).");
        } catch (Exception e) {
            System.out.println("FALHA: Exceção inesperada: " + e);
        }

        System.out.println("\n=== Teste 5: Posição inválida fora do tabuleiro (8, 4) ===");
        try {
            AvaliacaoDS1p1.movimentosPossiveisCavalo(8, 4);
            System.out.println("FALHA: Deveria ter lançado IllegalArgumentException!");
        } catch (IllegalArgumentException e) {
            System.out.println("SUCESSO: Exceção capturada corretamente para (8, 4).");
        } catch (Exception e) {
            System.out.println("FALHA: Exceção inesperada: " + e);
        }
    }
}
