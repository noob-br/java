import java.util.List;

public class TesteQuestao3 {
    public static void main(String[] args) {
        System.out.println("=== Teste Questão 3: Movimentos da Rainha ===");

        System.out.println("\n--- Teste 1: Canto inferior esquerdo (0, 0) ---");
        List<IntegerPair> canto = MovimentosRainha.movimentosPossiveisRainha(0, 0);
        System.out.println("Posições obtidas: " + canto);
        System.out.println("Total de movimentos: " + canto.size() + " (Esperado: 21)");

        System.out.println("\n--- Teste 2: Centro do tabuleiro (3, 3) ---");
        List<IntegerPair> centro = MovimentosRainha.movimentosPossiveisRainha(3, 3);
        System.out.println("Posições obtidas: " + centro);
        System.out.println("Total de movimentos: " + centro.size() + " (Esperado: 27)");

        System.out.println("\n--- Teste 3: Validação de exceção (-1, 0) ---");
        try {
            MovimentosRainha.movimentosPossiveisRainha(-1, 0);
            System.out.println("FALHA: Deveria ter lançado IllegalArgumentException!");
        } catch (IllegalArgumentException e) {
            System.out.println("SUCESSO: Exceção capturada com sucesso (" + e.getMessage() + ")");
        }

        System.out.println("\n--- Teste 4: Validação de exceção (8, 3) ---");
        try {
            MovimentosRainha.movimentosPossiveisRainha(8, 3);
            System.out.println("FALHA: Deveria ter lançado IllegalArgumentException!");
        } catch (IllegalArgumentException e) {
            System.out.println("SUCESSO: Exceção capturada com sucesso (" + e.getMessage() + ")");
        }
    }
}
