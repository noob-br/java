# Aula - 10/09: Sobrescrita de Métodos e `toString()` em Java

Nesta aula foi abordado o comportamento padrão herdado da superclasse `java.lang.Object` e a importância de sobrescrever o método `toString()`.

---

### Por que ocorria `Time@1dbd16a6`?
Em Java, toda classe herda implicitamente da classe raiz `Object`. Se uma classe não define sua própria versão de `toString()`, ela utiliza a implementação padrão herdada:
```java
getClass().getName() + '@' + Integer.toHexString(hashCode())
```
Isso resulta em uma "etiqueta de fábrica" com o nome da classe seguido do endereço de hash hexadecimal na memória.

---

### Arquivos de Exemplo Criados

1. **[ExemploSemToString.java](ExemploSemToString.java)**:
   - Mostra o comportamento padrão herdado de `Object` sem `@Override`.
   - Saída obtida: `TimeSemToString@1dbd16a6`.

2. **[ExemploComToString.java](ExemploComToString.java)**:
   - Demonstra a forma recomendada utilizando `@Override public String toString()`.
   - Formata a hora legivelmente como `HH:mm:ss` com `String.format("%02d:%02d:%02d", hora, minuto, segundo)`.
   - Saída obtida: `00:00:00` e `10:30:45`.
