# Questão 1 - Triângulos Pitagóricos

## Enunciado
Retorna a quantidade de triângulos retângulos diferentes cujos lados possuem comprimentos inteiros entre `minimo` e `maximo`, inclusive.

Um triplo de Pitágoras é um conjunto de três inteiros positivos `(cateto1, cateto2, hipotenusa)` tal que:
$$a^2 + b^2 = c^2$$

### Regras:
- Triângulos com os mesmos catetos e hipotenusa trocados (ex: `(3,4,5)` e `(4,3,5)`) contam apenas uma vez.
- Se `minimo < 1` ou `maximo < minimo`, lança `IllegalArgumentException`.

## Estrutura da Pasta
- `TriangulosPitagoricos.java`: Implementação do algoritmo com laços aninhados evitando repetições (`b = a + 1`, `c = b + 1`).
- `TesteQuestao1.java`: Classe para teste da função com diferentes intervalos.
