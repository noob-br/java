# INE5404 - Programação Orientada a Objetos II (UFSC)

Repositório de resoluções e exercícios práticos da disciplina de **Programação Orientada a Objetos II (INE5404)** do curso de Sistemas de Informação / Ciências da Computação da Universidade Federal de Santa Catarina (**UFSC**).

---

## 📚 Estrutura de Exercícios

### 📖 Exercícios do Livro Texto (Deitel - *Java Como Programar*)

| Capítulo / Seção | Exercício | Descrição | Status |
| :---: | :---: | :--- | :---: |
| **Cap. 3 (Classes & Objetos)** | [3.12](exercises/3.12/README.md) | Modelagem da classe `Invoice` (Fatura), encapsulamento, validações e cálculo | Concluído ✅ |
| **Cap. 7 (Arrays & Listas)** | [7.14](exercises/7.14/README.md) | Produto de inteiros com lista de argumentos de comprimento variável (`varargs`) | Concluído ✅ |

---

### 📝 Preparação e Avaliação Prática DS1.1 (`02.09`)

Avaliação prática algorítmica e orientada a objetos (Prof. Cancian). Contém a implementação unificada em [`AvaliacaoDS1p1.java`](02.09/AvaliacaoDS1p1.java) e versões modularizadas por questão:

| Questão | Diretório | Descrição | Status |
| :---: | :---: | :--- | :---: |
| **Questão 1** | [questao1](02.09/questao1/README.md) | Contagem de triângulos retângulos inteiros (Triplos de Pitágoras) | Concluído ✅ |
| **Questão 2** | [questao2](02.09/questao2/README.md) | Lista de movimentos válidos em L do Cavalo no tabuleiro de xadrez 8x8 | Concluído ✅ |
| **Questão 3** | [questao3](02.09/questao3/README.md) | Lista ordenada de movimentos da Rainha (8 direções) no xadrez 8x8 | Concluído ✅ |
| **Questão 4** | [questao4](02.09/questao4/README.md) | Estimativa da constante matemática $e$ por meio de série finita | Concluído ✅ |

---

## 📂 Organização das Pastas

```text
POO2/
├── 02.09/                  # Avaliação Prática DS1.1
│   ├── AvaliacaoDS1p1.java # Arquivo unificado da avaliação
│   ├── IntegerPair.java    # Classe auxiliar para coordenadas (x, y)
│   ├── questao1/           # Triângulos Pitagóricos (código + testes + README)
│   ├── questao2/           # Movimentos do Cavalo no Xadrez (código + testes + README)
│   ├── questao3/           # Movimentos da Rainha no Xadrez (código + testes + README)
│   └── questao4/           # Estimativa da Constante e (código + testes + README)
├── exercises/              # Exercícios conceituais e práticos do livro
│   ├── 3.12/               # Classe Invoice (Fatura)
│   └── 7.14/               # Varargs (Produto de números inteiros)
├── 12.08/                  # Primeiras práticas de sintaxe, laços e hello world
├── 19.08/                  # Práticas de classes, métodos e atributos (Pessoa, prática 1)
└── 20.08/                  # Matrizes/arrays multidimensionais e passeio do cavalo
```

---

## 🚀 Como Compilar e Executar

Cada pasta modularizada possui sua própria suíte de testes autocontida. Para rodar qualquer uma das questões ou exercícios pelo terminal:

```bash
# Exemplo: Rodando a Questão 2 (Movimentos do Cavalo)
cd 02.09/questao2
javac *.java
java TesteQuestao2

# Exemplo: Rodando a Questão 3 (Movimentos da Rainha)
cd 02.09/questao3
javac *.java
java TesteQuestao3
```
