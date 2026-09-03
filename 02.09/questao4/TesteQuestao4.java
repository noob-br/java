public class TesteQuestao4 {
    public static void main(String[] args) {
        System.out.println("=== Teste Questão 4: Estimativa da Constante e ===");

        // Teste 1: n = 0 -> Esperado: 1.0
        double e0 = ConstanteE.estimarConstanteE(0);
        System.out.printf("n = 0: %.6f (Esperado: 1.000000)\n", e0);

        // Teste 2: n = 1 -> Esperado: 1 + 1/1! = 2.0
        double e1 = ConstanteE.estimarConstanteE(1);
        System.out.printf("n = 1: %.6f (Esperado: 2.000000)\n", e1);

        // Teste 3: n = 2 -> Esperado: 1 + 1 + 0.5 = 2.5
        double e2 = ConstanteE.estimarConstanteE(2);
        System.out.printf("n = 2: %.6f (Esperado: 2.500000)\n", e2);

        // Teste 4: n = 5 -> Esperado: ~2.716667
        double e5 = ConstanteE.estimarConstanteE(5);
        System.out.printf("n = 5: %.6f (Esperado: ~2.716667)\n", e5);

        // Teste 5: n = 10 -> Comparação com Math.E
        double e10 = ConstanteE.estimarConstanteE(10);
        System.out.printf("n = 10: %.8f (Math.E = %.8f)\n", e10, Math.E);

        // Teste 6: n = 20 -> Alta precisão
        double e20 = ConstanteE.estimarConstanteE(20);
        System.out.printf("n = 20: %.15f (Math.E = %.15f)\n", e20, Math.E);

        // Teste 7: Validação de exceção com n < 0
        System.out.println("\n--- Teste de Exceção (n = -1) ---");
        try {
            ConstanteE.estimarConstanteE(-1);
            System.out.println("FALHA: Deveria ter lançado IllegalArgumentException!");
        } catch (IllegalArgumentException ex) {
            System.out.println("SUCESSO: Exceção capturada com sucesso (" + ex.getMessage() + ")");
        }
    }
}
