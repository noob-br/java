import java.util.Scanner;
public class xadrez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] list = new int[8][8];

        System.out.print("Linha: ");
        int a = input.nextInt();

        System.out.print("Coluna: ");
        int b = input.nextInt();
        list[a][b] = 1;
        if (a+2 < 8 && b+1 < 8){
            list[a+2][b+1] = 1;
        }
        if (a+1 < 8 && b+2 < 8){
            list[a+1][b+2] = 1;
        }
        if (a+2 < 8 && b-1 >= 0){
            list[a+2][b-1] = 1;
        }
        if (a+1 < 8 && b-2 >= 0){
            list[a+1][b-2] = 1;
        }
        if (a-2 >= 0 && b+1 < 8){
            list[a-2][b+1] = 1;
        }
        if (a-1 >=0 && b+2 < 8){
            list[a-1][b+2] = 1;
        }
        if (a-2 >= 0 && b-1 >= 0){
            list[a-2][b-1] = 1;
        }
        if (a-1 >= 0 && b-2 >= 0){
            list[a-1][b-2] = 1;
        }
        System.out.print("   ");
        for (int count = 0; count < 8; count++){
            System.out.printf("%d    ",count);
        }
        System.out.println("");
        for(int count = 0; count < 42; count++){
            System.out.print("-");
        }
        System.out.println("");
        for(int linha = 0; linha <= 7; linha++){
            System.out.print(linha);
            for (int coluna = 0; coluna <= 7; coluna++){
                System.out.print("|");
                if (linha == a && coluna == b){
                    System.out.printf(" %s |","K");
                }
                else if (list[linha][coluna] == 1){
                    System.out.print(" "+list[linha][coluna]+" |");
                } else{
                    System.out.printf(" %d |",0);
                }
            }
            System.out.println("");
            System.out.println("");
        }
        input.close();
    }
}

