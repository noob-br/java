# Questão 2 - Movimentos Possíveis do Cavalo no Xadrez

## Enunciado
Retorna a lista de todas as posições válidas para as quais um cavalo pode se mover em um único lance em um tabuleiro de xadrez 8x8.

As coordenadas do tabuleiro variam de `0` a `7` tanto no eixo horizontal (`x`) quanto no eixo vertical (`y`). O cavalo realiza movimentos em formato de L: duas casas em uma direção e uma casa em direção perpendicular.

### Regras e Requisitos:
1. Cada posição retornada deve ser representada por um objeto da classe `IntegerPair`. Apenas posições válidas dentro do tabuleiro devem ser incluídas.
2. A lista deve ser construída na seguinte ordem estrita de tentativas de deslocamento:
   - `(+2, +1)`
   - `(+1, +2)`
   - `(-1, +2)`
   - `(-2, +1)`
   - `(-2, -1)`
   - `(-1, -2)`
   - `(+1, -2)`
   - `(+2, -1)`
3. Se a posição inicial informada estiver fora do tabuleiro (`x < 0 || x > 7 || y < 0 || y > 7`), o método deve lançar `IllegalArgumentException`.

## Estrutura da Pasta
- `MovimentosCavalo.java`: Implementação do algoritmo com verificação de limites do tabuleiro.
- `IntegerPair.java`: Classe auxiliar para pares ordenados `(first, second)`.
- `TesteQuestao2.java`: Suíte de testes com posições centrais, cantos e validações de erro.

## Como Executar
```bash
javac *.java
java TesteQuestao2
```
