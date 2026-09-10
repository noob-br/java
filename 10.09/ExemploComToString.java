// Exemplo 2: Forma correta utilizando @Override no toString()
// Demonstra como customizar a representação textual do objeto.
class TimeComToString {
    private int hora;
    private int minuto;
    private int segundo;

    // Construtor padrão (inicia com 00:00:00)
    public TimeComToString() {
        this(0, 0, 0);
    }

    // Construtor parametrizado
    public TimeComToString(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    /**
     * A anotação @Override indica que estamos substituindo o método toString()
     * que veio da classe mãe java.lang.Object pela nossa própria implementação.
     * Agora, quem imprimir este objeto verá uma hora formatada e compreensível,
     * em vez daquele código hash estranho de memória.
     */
    @Override
    public String toString() {
        // String.format("%02d:%02d:%02d", ...) garante que números menores que 10 tenham um zero à esquerda (ex: 09:05:07)
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}

public class ExemploComToString {
    public static void main(String[] args) {
        TimeComToString time1 = new TimeComToString();
        TimeComToString time2 = new TimeComToString(10, 30, 45);

        System.out.println("--- Exemplo Com Sobrescrever toString() (@Override) ---");
        // O Java chama automaticamente o nosso método toString() customizado:
        System.out.println("time1 formatado: " + time1); // chama time1.toString()
        System.out.println("time2 formatado: " + time2.toString());
    }
}
