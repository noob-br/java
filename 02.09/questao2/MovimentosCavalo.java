import java.util.ArrayList;
import java.util.List;

public class MovimentosCavalo {

    /**
     * Retorna a lista de todas as posições válidas para as quais um cavalo pode se mover
     * em um único lance em um tabuleiro de xadrez 8x8.
     *
     * As coordenadas do tabuleiro variam de 0 a 7 tanto no eixo x quanto no eixo y.
     * A ordem das tentativas de deslocamento segue estritamente:
     * (+2,+1), (+1,+2), (-1,+2), (-2,+1), (-2,-1), (-1,-2), (+1,-2) e (+2,-1).
     *
     * @param x coordenada horizontal (0 a 7)
     * @param y coordenada vertical (0 a 7)
     * @return lista de posições válidas alcançáveis em um movimento
     * @throws IllegalArgumentException se a posição inicial for inválida
     */
    public static List<IntegerPair> movimentosPossiveisCavalo(int x, int y) {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new IllegalArgumentException("Posição inválida no tabuleiro: (" + x + ", " + y + ")");
        }

        List<IntegerPair> movimentos = new ArrayList<>();

        // Vetores de deslocamento na ordem estrita solicitada pelo enunciado
        int[][] deltas = {
            { 2,  1},
            { 1,  2},
            {-1,  2},
            {-2,  1},
            {-2, -1},
            {-1, -2},
            { 1, -2},
            { 2, -1}
        };

        for (int[] d : deltas) {
            int novoX = x + d[0];
            int novoY = y + d[1];

            if (novoX >= 0 && novoX <= 7 && novoY >= 0 && novoY <= 7) {
                movimentos.add(new IntegerPair(novoX, novoY));
            }
        }

        return movimentos;
    }
}
