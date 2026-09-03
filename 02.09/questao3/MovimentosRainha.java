import java.util.ArrayList;
import java.util.List;

public class MovimentosRainha {

    /**
     * Retorna a lista de todas as posições válidas para as quais uma rainha pode se mover
     * em um único lance em um tabuleiro de xadrez 8x8.
     *
     * A rainha combina os movimentos da torre e do bispo (horizontal, vertical e diagonal).
     * A lista deve ser construída percorrendo as direções nesta ordem estrita:
     * 1. Direita
     * 2. Esquerda
     * 3. Cima
     * 4. Baixo
     * 5. Diagonal superior direita (+x, +y)
     * 6. Diagonal inferior direita (+x, -y)
     * 7. Diagonal superior esquerda (-x, +y)
     * 8. Diagonal inferior esquerda (-x, -y)
     *
     * Em cada direção, as posições devem ser adicionadas da mais próxima para a mais distante.
     *
     * @param x coordenada horizontal (0 a 7)
     * @param y coordenada vertical (0 a 7)
     * @return lista com todas as posições alcançáveis em um único movimento
     * @throws IllegalArgumentException se a posição inicial for inválida
     */
    public static List<IntegerPair> movimentosPossiveisRainha(int x, int y) {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new IllegalArgumentException("Posição inicial fora do tabuleiro: (" + x + ", " + y + ")");
        }

        List<IntegerPair> movimentos = new ArrayList<>();

        // 1. Direita
        for (int z = x + 1; z <= 7; z++) {
            movimentos.add(new IntegerPair(z, y));
        }

        // 2. Esquerda
        for (int a = x - 1; a >= 0; a--) {
            movimentos.add(new IntegerPair(a, y));
        }

        // 3. Cima
        for (int b = y + 1; b <= 7; b++) {
            movimentos.add(new IntegerPair(x, b));
        }

        // 4. Baixo
        for (int c = y - 1; c >= 0; c--) {
            movimentos.add(new IntegerPair(x, c));
        }

        // 5. Diagonal superior direita (+x, +y)
        for (int z = 1; x + z <= 7 && y + z <= 7; z++) {
            movimentos.add(new IntegerPair(x + z, y + z));
        }

        // 6. Diagonal inferior direita (+x, -y)
        for (int z = 1; x + z <= 7 && y - z >= 0; z++) {
            movimentos.add(new IntegerPair(x + z, y - z));
        }

        // 7. Diagonal superior esquerda (-x, +y)
        for (int z = 1; x - z >= 0 && y + z <= 7; z++) {
            movimentos.add(new IntegerPair(x - z, y + z));
        }

        // 8. Diagonal inferior esquerda (-x, -y)
        for (int z = 1; x - z >= 0 && y - z >= 0; z++) {
            movimentos.add(new IntegerPair(x - z, y - z));
        }

        return movimentos;
    }
}
