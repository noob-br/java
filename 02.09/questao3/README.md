# Questão 3 - Movimentos Possíveis da Rainha no Xadrez

## Enunciado
Retorna a lista de todas as posições válidas para as quais uma rainha pode se mover em um único lance em um tabuleiro de xadrez 8x8.

A rainha combina os movimentos da torre e do bispo: deslocamento horizontal, vertical e diagonal por qualquer quantidade de casas, permanecendo nos limites do tabuleiro `[0, 7]`.

### Regras e Requisitos:
1. Cada posição retornada deve ser representada por um objeto da classe `IntegerPair`. Apenas posições válidas dentro do tabuleiro devem ser incluídas.
2. A lista deve ser construída percorrendo as direções na seguinte ordem estrita (da casa mais próxima para a mais distante):
   - **Direita**: `(+z, 0)` -> `(x + z, y)`
   - **Esquerda**: `(-z, 0)` -> `(x - z, y)`
   - **Cima**: `(0, +z)` -> `(x, y + z)`
   - **Baixo**: `(0, -z)` -> `(x, y - z)`
   - **Diagonal superior direita**: `(+z, +z)` -> `(x + z, y + z)`
   - **Diagonal inferior direita**: `(+z, -z)` -> `(x + z, y - z)`
   - **Diagonal superior esquerda**: `(-z, +z)` -> `(x - z, y + z)`
   - **Diagonal inferior esquerda**: `(-z, -z)` -> `(x - z, y - z)`
3. Se a posição inicial informada estiver fora do tabuleiro (`x < 0 || x > 7 || y < 0 || y > 7`), o método deve lançar `IllegalArgumentException`.

## Estrutura da Pasta
- `MovimentosRainha.java`: Implementação do algoritmo com iteração radial ordenada pelas 8 direções.
- `IntegerPair.java`: Classe auxiliar para pares ordenados `(first, second)`.
- `TesteQuestao3.java`: Suíte de testes com cantos, centro e validações de erro.

## Como Executar
```bash
javac *.java
java TesteQuestao3
```
