import java.util.Scanner;

class Pessoa {
    private int idade;
    private String nome;

    // 1. funcao p salvar o nome
    public void setNomer(String nome) {
        this.nome = nome;
    }

    // 2. funcao p ler o nome
    public String getNomer() {
        return this.nome;
    }

    // 3. Funcao para salvar idade
    public void setIdader(int idade) {
        this.idade = idade;
    }

    // 4. Funcao para ler a Idade
    public int getIdader() {
        return this.idade;
    }

}

public class pratica1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // usando o gravador pela primeira vez
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println(name);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is " + age);

        Pessoa p1 = new Pessoa();
        // legado p1.idade = age;
        p1.setIdader(age);
        // legado: p1.nome = name;
        p1.setNomer(name);

        // antes: " + p1.nome);
        System.out.println("Name encapsulado: " + p1.getNomer());
        System.out.println("Idade encapuslada: " + p1.getIdader());
    }

}
