# Questão 4 - Estimativa da Constante Matemática $e$

## Enunciado
Estima o valor da constante matemática $e$ (número de Euler) por meio da série de Taylor finita:

$$e \approx 1 + \frac{1}{1!} + \frac{1}{2!} + \frac{1}{3!} + \dots + \frac{1}{n!}$$

### Regras e Requisitos:
1. O parâmetro `numeroDeTermos` corresponde ao maior índice $n$ considerado na soma.
   - Para `numeroDeTermos = 0`: retorna `1.0`.
   - Para `numeroDeTermos = 1`: retorna `1.0 + 1/1! = 2.0`.
   - Para `numeroDeTermos = 2`: retorna `1.0 + 1/1! + 1/2! = 2.5`.
2. Os fatoriais devem ser calculados incrementalmente dentro do laço para evitar recomputação desnecessária ($O(n)$).
3. Se `numeroDeTermos < 0`, deve lançar `IllegalArgumentException`.

## Estrutura da Pasta
- `ConstanteE.java`: Implementação do algoritmo com acumulador de ponto flutuante (`double`).
- `TesteQuestao4.java`: Suíte de testes validando os termos iniciais, convergência com `Math.E` e exceções.

## Como Executar
```bash
javac *.java
java TesteQuestao4
```
