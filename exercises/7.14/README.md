# Exercício 7.14 — Lista de Argumentos de Comprimento Variável (Varargs)

- **Disciplina:** Programação Orientada a Objetos II (UFSC / INE5404)
- **Fonte:** Deitel & Deitel · *Java: Como Programar* (Capítulo 7, pág. 235)
- **Tópico:** Lista de argumentos de comprimento variável (`varargs`), métodos estáticos, loops e acumuladores.

---

## 📋 Enunciado

> **7.14 (Lista de argumento de comprimento variável)**  
> Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados para o método `product` utilizando uma lista de argumentos de comprimento variável. Teste seu método com várias chamadas, cada uma com um número diferente de argumentos.

---

## 🎯 Requisitos

1. Criar um método `product` com a assinatura:
   ```java
   public static int product(int... numbers)
   ```
2. Processar a lista de inteiros recebida (que internamente se comporta como um array `int[]`).
3. Retornar o resultado do produto (multiplicação de todos os valores).
4. No método `main`, realizar múltiplos testes:
   - Teste com 2 números (ex: `product(2, 5)`)
   - Teste com 3 números (ex: `product(2, 3, 4)`)
   - Teste com 5 números (ex: `product(1, 2, 3, 4, 5)`)
   - Teste sem argumentos ou com 1 argumento (caso de borda)
