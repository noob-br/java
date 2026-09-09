# Avaliação Prática DS1.1 (02/09) — INE5404

Resoluções e documentação prática dos exercícios da Avaliação DS1.1 (Prof. Cancian).

---

## ⏱️ Registro de Estudo & Performance

Conclusão dos 4 exercícios com foco em **reconstrução manual das soluções**, fixação de sintaxe e domínio da lógica algorítmica:

- **Tempo dedicado**: ~7 horas de estudo distribuídas em 2 dias (~3h tarde, ~1h noite, ~3h manhã seguinte).
- **Abordagem**: Implementação autônoma, teste manual de casos extremos e refatoração incremental.

### 🎯 Principais Pontos Trabalhados e Consolidados
- **Validação defensiva de parâmetros**: Uso correto de `IllegalArgumentException` e operadores lógicos (`&&` vs `||`).
- **Limites e indexação**: Controle rígido dos limites de matriz/tabuleiro `[0, 7]`.
- **Coleções e POO**: Manipulação de `List<IntegerPair>` e instanciação dinâmica com `ArrayList` e `new IntegerPair(x, y)`.
- **Controle de laços**: Indexação dependente em laços aninhados (`b = a + 1`, `c = b + 1`) e percursos multidirecionais.
- **Eficiência e tipos numéricos**: Cálculo incremental de fatorial em $O(n)$ e prevenção de overflow numérico com ponto flutuante (`double`).

---

## 📋 Questões Resolvidas

| Questão | Diretório | Descrição | Status |
| :---: | :---: | :--- | :---: |
| **Questão 1** | [questao1](questao1/README.md) | Triângulos Pitagóricos ($a^2 + b^2 = c^2$) com loops aninhados sem repetição | Concluído ✅ |
| **Questão 2** | [questao2](questao2/README.md) | Movimentos em L do Cavalo no tabuleiro 8x8 seguindo ordem estrita de deltas | Concluído ✅ |
| **Questão 3** | [questao3](questao3/README.md) | Movimentos da Rainha cobrindo 8 direções (ortogonais e diagonais) | Concluído ✅ |
| **Questão 4** | [questao4](questao4/README.md) | Estimativa da constante de Euler ($e$) via série de Taylor finita | Concluído ✅ |

---

## 📂 Arquivos Desta Pasta

- `AvaliacaoDS1p1.java`: Arquivo unificado da avaliação contendo todos os métodos implementados.
- `IntegerPair.java`: Classe utilitária para pares de coordenadas `(first, second)`.
- `questao1/`, `questao2/`, `questao3/`, `questao4/`: Versões modulares e autocontidas com suítes de teste dedicadas.
- `TesteQuestao1.java`, `TesteQuestao2.java`, `TesteQuestao3.java`, `TesteQuestao4.java`: Classes de teste independentes.
