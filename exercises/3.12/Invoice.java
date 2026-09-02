
public class Invoice {
    // 1. Declare as 4 variáveis de instância privadas aqui: 1. Quais são os
    // atributos que todo objeto Invoice terá?
    // - numero (String)
    private String numero;
    // - descricao (String)
    private String descricao;
    // - quantidade (int)
    private int quantidade;
    // - precoPorItem (double)
    private double precoPorItem;

    // 2. Construtor - O que será preenchido?
    public Invoice(String numero, String descricao, int quantidade, double precoPorItem) {
        // Existem dois numero:
        // private String numero; // número LÁ DA CLASSE
        // String numero; // número QUE VEM LÁ DO CONSTRUTOR (Parâmetro)
        this.numero = numero;
        // O numero deste objeto (this.numero) recebe o numero que chegou no construtor.
        // "001" -> Parametro numero -> this.numero -> atributo do objeto
        this.descricao = descricao;
        // pra ca tem validacao
        setQuantidade(quantidade);
        setPrecoPorItem(precoPorItem);
    }

    // 3. Getters e Setters
    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    // setters
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public void setPrecoPorItem(double precoPorItem) {
        if (precoPorItem > 0) {
            this.precoPorItem = precoPorItem;
        } else {
            this.precoPorItem = 0.0;
        }

    }

    // 4. Método getInvoiceAmount - 4. Qual o valor da fatura?
    public double getInvoiceAmount() {
        return precoPorItem * quantidade;
    }
}
