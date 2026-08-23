/// exercicio cavaleiro
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chess xadrez = new Chess();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a linha: ");
        int x = sc.nextInt();
        System.out.println("Digite a coluna: ");
        int y = sc.nextInt();
        sc.close();

        xadrez.imprimirPosicao(x, y);

    }

}
