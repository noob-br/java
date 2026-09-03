public class ConstanteE {

    /**
     * Estima o valor da constante matemática e por meio da soma finita:
     * e ≈ 1 + 1/1! + 1/2! + 1/3! + ... + 1/n!
     *
     * @param numeroDeTermos maior índice fatorial considerado na aproximação.
     * @return valor aproximado de e.
     * @throws IllegalArgumentException se numeroDeTermos < 0.
     */
    public static double estimarConstanteE(int numeroDeTermos) {
        if (numeroDeTermos < 0) {
            throw new IllegalArgumentException("O número de termos não pode ser negativo: " + numeroDeTermos);
        }

        double fatorial = 1.0;
        double e = 1.0;

        for (int i = 1; i <= numeroDeTermos; i++) {
            fatorial = i * fatorial;
            e += (1.0 / fatorial);
        }

        return e;
    }
}
