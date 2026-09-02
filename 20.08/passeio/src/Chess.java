public class Chess {
    private int[][] matriz = new int[8][8];

    public void imprimirPosicao(int linha, int coluna) {
        matriz[3][2] = 1;
        System.out.println(matriz[linha][coluna]);

    }

}

// | Δ Linha | Δ Coluna |
// | ------: | -------: |
// | +2 | +1 |
// | +2 | -1 |
// | -2 | +1 |
// | -2 | -1 |
// | +1 | +2 |
// | +1 | -2 |
// | -1 | +2 |
// | -1 | -2 |
