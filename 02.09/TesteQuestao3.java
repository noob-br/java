import java.util.List;

public class TesteQuestao3 {
    public static void main(String[] args) {
        System.out.println("=== Teste 1: Canto inferior esquerdo (0, 0) ===");
        try {
            List<IntegerPair> res = AvaliacaoDS1p1.movimentosPossiveisRainha(0, 0);
            System.out.println("Resultado: " + res);
            System.out.println("Total de movimentos: " + (res != null ? res.size() : "null") + " (esperado: 21)");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=== Teste 2: Centro (3, 3) ===");
        try {
            List<IntegerPair> res = AvaliacaoDS1p1.movimentosPossiveisRainha(3, 3);
            System.out.println("Resultado: " + res);
            System.out.println("Total de movimentos: " + (res != null ? res.size() : "null") + " (esperado: 27)");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=== Teste 3: Posição inválida (-1, 0) ===");
        try {
            AvaliacaoDS1p1.movimentosPossiveisRainha(-1, 0);
            System.out.println("FALHA: Deveria ter lançado IllegalArgumentException!");
        } catch (IllegalArgumentException e) {
            System.out.println("SUCESSO: IllegalArgumentException capturada para (-1, 0).");
        } catch (Exception e) {
            System.out.println("FALHA: Exceção inesperada: " + e);
        }

        System.out.println("\n=== Teste 4: Posição inválida fora do tabuleiro (8, 3) ===");
        try {
            AvaliacaoDS1p1.movimentosPossiveisRainha(8, 3);
            System.out.println("FALHA: Deveria ter lançado IllegalArgumentException!");
        } catch (IllegalArgumentException e) {
            System.out.println("SUCESSO: IllegalArgumentException capturada para (8, 3).");
        } catch (Exception e) {
            System.out.println("FALHA: Exceção inesperada: " + e);
        }
    }
}

