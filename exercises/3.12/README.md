# Exercício 3.12 - Classe Invoice

## Enunciado
Crie uma classe chamada `Invoice` para que uma loja de suprimentos de informática a utilize para representar uma fatura de um item vendido nela.

Uma `Invoice` (fatura) deve incluir quatro variáveis de instância:
- `numero` (tipo `String`)
- `descricao` (tipo `String`)
- `quantidade` (tipo `int`)
- `precoPorItem` (tipo `double`)

### Requisitos:
1. Construtor que inicializa as 4 variáveis de instância.
2. Métodos `get` e `set` para cada variável de instância.
3. Se a quantidade não for positiva, deve ser configurada como `0`.
4. Se o preço por item não for positivo, deve ser configurado como `0.0`.
5. Método `getInvoiceAmount` que calcula o valor da fatura (`quantidade * precoPorItem`) e retorna como `double`.
6. Classe de teste `InvoiceTest` demonstrando o funcionamento da classe `Invoice`.
