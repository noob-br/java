public class TriangulosPitagoricos {

    /**
     * Retorna a quantidade de triângulos retângulos diferentes cujos lados possuem
     * comprimentos inteiros entre minimo e maximo, inclusive.
     */
    public static int quantidadeTriangulosPitagoricos(int minimo, int maximo) {
        if (minimo < 1 || maximo < minimo) {
            throw new IllegalArgumentException("Intervalo inválido: minimo deve ser >= 1 e maximo >= minimo");
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
}
