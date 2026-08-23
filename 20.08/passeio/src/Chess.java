public class Chess {
    private int[][] matriz = new int[8][8];


// esta recebendo o x e y do main.java
    public void imprimirPosicao(int linha, int coluna) {
        int x = linha-1;
        int y = coluna-1;

        matriz[x][y] = 1;

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

        if ((x+2) <= 7 && (y +1) <= 7)
            {matriz[x +2][y +1] = 1;}
        if ((x+2) <= 7 && (y -1) >= 0)
            {matriz[x +2][y -1] = 1;}

        if ((x-2) >= 0 && (y +1) <= 7)
            {matriz[x -2][y +1] = 1;}
        if ((x-2) >= 0 && (y -1) >= 0)
            {matriz[x -2][y -1] = 1;}


        if ((x+1) <= 7 && (y +2) <= 7)
            {matriz[x +1][y +2] = 1;}
        if ((x+1) <= 7 && (y -2) >= 0)
            {matriz[x +1][y -2] = 1;}

        if ((x-1) >= 0 && (y +2) <= 7)
            {matriz[x -1][y +2] = 1;}
        if ((x-1) >= 0 && (y -2) >= 0)
            {matriz[x -1][y -2] = 1;}

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                // acessa matriz[i][j]
                System.out.print(matriz[i][j] + " "); // imprime na mesma linha com espaço
            }
            System.out.println(); //pulaproxlinha
        }
    }

}



