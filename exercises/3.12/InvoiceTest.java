public class InvoiceTest {

    public static void main(String[] args) {
        Invoice fatura = new Invoice("001", "Mouse", -2, -50.00);
        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: " + fatura.getPrecoPorItem());
        System.out.println("Valor da fatura: " + fatura.getInvoiceAmount());
    }

}
