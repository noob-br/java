public class TesteFatorial {
    public static void main(String[] args) {

        int numeroDeTermos = 2000;
        if (numeroDeTermos < 0) {
            throw new IllegalArgumentException("Não foi dessa vez cowboy. ");
        }
        int fatorial = 1;
        double e = 1;
        for (int i = 1; i <= numeroDeTermos; i++) {
            fatorial = i * fatorial;
            e += (1.0 / fatorial);
            System.out.println(fatorial);
        }
        System.out.println(e);
    }
}
