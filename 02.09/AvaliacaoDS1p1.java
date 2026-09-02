import java.util.ArrayList;
import java.util.List;

/**
 * UFSC/CTC/INE/INE5404
 * Avaliação prática DS1.1 - 2026-1
 *
 * Classe contendo métodos independentes de natureza algorítmica.
 * Cada método corresponde a uma questão da avaliação.
 *
 * @author Professor Cancian
 */
class AvaliacaoDS1p1 {

    /**
     * Retorna a quantidade de triângulos retângulos diferentes cujos lados possuem
     * comprimentos inteiros entre {@code minimo} e {@code maximo}, inclusive.
     *
     * <p>
     * Um triplo de Pitágoras é um conjunto de três inteiros positivos
     * {@code (cateto1, cateto2, hipotenusa)} tal que:
     * </p>
     *
     * <pre>
     * cateto1² + cateto2² = hipotenusa²
     * </pre>
     *
     * <p>
     * Este método deve utilizar um laço {@code for} triplamente aninhado, testando
     * todas as combinações possíveis no intervalo informado. Triângulos com os
     * mesmos
     * dois catetos e a mesma hipotenusa não devem ser contados duas vezes quando os
     * catetos aparecem trocados. Assim, por exemplo, {@code (3,4,5)} e
     * {@code (4,3,5)}
     * representam o mesmo triângulo e contam apenas uma vez.
     * </p>
     *
     * <p>
     * Antes de executar o algoritmo, o método deve validar os parâmetros recebidos.
     * Se o intervalo informado for inválido, deve lançar
     * {@link IllegalArgumentException}.
     * </p>
     *
     * @param minimo menor valor inteiro permitido para cada lado do triângulo.
     * @param maximo maior valor inteiro permitido para cada lado do triângulo.
     * @return a quantidade de triângulos retângulos diferentes no intervalo dado.
     * @throws IllegalArgumentException se {@code minimo < 1} ou se
     *                                  {@code maximo < minimo}.
     */
    public static int quantidadeTriangulosPitagoricos(int minimo, int maximo) {

        if (minimo < 1 || maximo < minimo) {
            throw new IllegalArgumentException();
        }
        if (maximo - minimo < 2) {
            return 0;
        }

        int resultado = 0;

        for (int a = minimo; a <= maximo; a++) {
            for (int b = a + 1; b <= maximo; b++) {
                for (int c = b + 1; c <= maximo; c++) {
                    if (a * a + b * b == c * c) {
                        resultado += 1;
                    }
                }
            }
        }
        return resultado;
    }

    /**
     * Retorna a lista de todas as posições válidas para as quais um cavalo pode se
     * mover
     * em um único lance em um tabuleiro de xadrez 8x8.
     *
     * <p>
     * As coordenadas do tabuleiro variam de {@code 0} a {@code 7} tanto no eixo
     * horizontal ({@code x}) quanto no eixo vertical ({@code y}). O cavalo realiza
     * movimentos em formato de L: duas casas em uma direção e uma casa em direção
     * perpendicular.
     * </p>
     *
     * <p>
     * Cada posição retornada deve ser representada por um objeto da classe
     * {@link IntegerPair}. Apenas posições válidas dentro do tabuleiro devem ser
     * incluídas na lista.
     * </p>
     *
     * <p>
     * A lista deve ser construída na seguinte ordem de tentativas de deslocamento:
     * {@code (+2,+1)}, {@code (+1,+2)}, {@code (-1,+2)}, {@code (-2,+1)},
     * {@code (-2,-1)}, {@code (-1,-2)}, {@code (+1,-2)} e {@code (+2,-1)}.
     * Apenas os deslocamentos que gerarem posições válidas devem ser adicionados,
     * preservando-se essa ordem relativa.
     * </p>
     *
     * <p>
     * Antes de executar o algoritmo, o método deve validar os parâmetros recebidos.
     * Se a posição inicial estiver fora do tabuleiro, deve lançar
     * {@link IllegalArgumentException}.
     * </p>
     *
     * @param x coordenada horizontal da posição atual do cavalo.
     * @param y coordenada vertical da posição atual do cavalo.
     * @return lista com todas as posições alcançáveis em um único movimento.
     * @throws IllegalArgumentException se a posição informada estiver fora do
     *                                  tabuleiro.
     */
    public static List<IntegerPair> movimentosPossiveisCavalo(int x, int y) {
        /* COMPLETE */
        return null;
    }

    /**
     * Retorna a lista de todas as posições válidas para as quais uma rainha pode se
     * mover
     * em um único lance em um tabuleiro de xadrez 8x8.
     *
     * <p>
     * A rainha combina os movimentos da torre e do bispo. Portanto, pode se
     * deslocar
     * horizontalmente, verticalmente ou diagonalmente, por qualquer quantidade de
     * casas,
     * desde que permaneça dentro dos limites do tabuleiro.
     * </p>
     *
     * <p>
     * Cada posição retornada deve ser representada por um objeto da classe
     * {@link IntegerPair}. Apenas posições válidas dentro do tabuleiro devem ser
     * incluídas na lista.
     * </p>
     *
     * <p>
     * A lista deve ser construída percorrendo as direções nesta ordem:
     * direita, esquerda, cima, baixo, diagonal superior direita,
     * diagonal inferior direita, diagonal superior esquerda e diagonal inferior
     * esquerda.
     * Em cada direção, as posições devem ser adicionadas da mais próxima para a
     * mais distante.
     * </p>
     *
     * <p>
     * Antes de executar o algoritmo, o método deve validar os parâmetros recebidos.
     * Se a posição inicial estiver fora do tabuleiro, deve lançar
     * {@link IllegalArgumentException}.
     * </p>
     *
     * @param x coordenada horizontal da posição atual da rainha.
     * @param y coordenada vertical da posição atual da rainha.
     * @return lista com todas as posições alcançáveis em um único movimento.
     * @throws IllegalArgumentException se a posição informada estiver fora do
     *                                  tabuleiro.
     */
    public static List<IntegerPair> movimentosPossiveisRainha(int x, int y) {
        /* COMPLETE */
        return null;
    }

    /**
     * Estima o valor da constante matemática {@code e} por meio da soma finita:
     *
     * <pre>
     * e ≈ 1 + 1/1! + 1/2! + 1/3! + ... + 1/n!
     * </pre>
     *
     * <p>
     * O parâmetro {@code numeroDeTermos} corresponde ao maior valor de {@code n}
     * considerado na soma. Assim:
     * </p>
     *
     * <ul>
     * <li>se {@code numeroDeTermos = 0}, o método retorna {@code 1.0};</li>
     * <li>se {@code numeroDeTermos = 1}, o método retorna {@code 1 + 1/1!};</li>
     * <li>e assim sucessivamente.</li>
     * </ul>
     *
     * <p>
     * Recomenda-se calcular os fatoriais incrementalmente, evitando recomputação
     * desnecessária.
     * </p>
     *
     * <p>
     * Antes de executar o algoritmo, o método deve validar o parâmetro recebido.
     * Se {@code numeroDeTermos < 0}, deve lançar {@link IllegalArgumentException}.
     * </p>
     *
     * @param numeroDeTermos maior índice fatorial considerado na aproximação.
     * @return valor aproximado de {@code e}.
     * @throws IllegalArgumentException se {@code numeroDeTermos < 0}.
     */
    public static double estimarConstanteE(int numeroDeTermos) {
        return 0;
        /* COMPLETE */
    }

    /* Você pode implementar outros métodos estáticos e privados, se desejar */
}
