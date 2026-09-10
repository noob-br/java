// Exemplo 1: Sem sobrescrever toString()
// Demonstra o comportamento padrão herdado diretamente da classe Object.
class TimeSemToString {
    private int hora;
    private int minuto;
    private int segundo;

    public TimeSemToString(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Como NÃO existe um método toString() implementado aqui,
    // o Java usa a implementação da classe mãe (java.lang.Object).
    // O retorno padrão do Object é: getClass().getName() + '@' + Integer.toHexString(hashCode())
    // Exemplo de saída: TimeSemToString@1dbd16a6 (como a "etiqueta de fábrica/código de barras")
}

public class ExemploSemToString {
    public static void main(String[] args) {
        TimeSemToString time1 = new TimeSemToString(10, 30, 45);

        System.out.println("--- Exemplo Sem Sobrescrever toString() ---");
        // Ao passar o objeto para println ou chamar .toString(), é chamado o método de Object:
        System.out.println("Chamando time1.toString(): " + time1.toString());
        System.out.println("Passando time1 direto:     " + time1);
    }
}
