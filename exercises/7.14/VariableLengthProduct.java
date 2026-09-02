public class VariableLengthProduct {

    public static int product(int... numbers) {
        int produto = 1;
        for (int num : numbers) {
            produto = num * produto;
        }
        return produto;
    }

    public static void main(String[] args) {
        int resultado = product(2, 3);
        System.out.println("Produto de 2 e 3 = " + resultado);

        // testando diferentes possibilidades
        System.out.println("Produto de 2 e 3 e 4 e 5 = " + product(2, 3, 4, 5));
        System.out.println("Produto de 1 e 2 e 3 e 4 e 5 = " + product(1, 2, 3, 4, 5));
        System.out.println("Produto de 1 = " + product(1));
    }
}
