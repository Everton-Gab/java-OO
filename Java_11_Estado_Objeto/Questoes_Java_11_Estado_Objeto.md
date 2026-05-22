# Java 11 - Estado do Objeto - Questoes

---

## Atividade 1 - Executando o codigo

**O que fazer:**

- Execute o `Principal.java` e observe a saida.

**Cole a saida completa do terminal abaixo.**

```text

```

**Responda:**

**Os dois `codigoIdentificador` sao iguais? Por que?**

R.

---

## Atividade 2 - Estado do objeto

**Abra o `Aluno.java` e responda:**

**O que define o ESTADO de um objeto?**

R.

**Quais sao os atributos que compoem o estado do objeto `Aluno`?**

R.

**O que define o COMPORTAMENTO de um objeto?**

R.

**Liste os metodos de `Aluno` que sao comportamentos:**

R.

---

## Atividade 3 - Mudanca de estado

**Analise o trecho do `Principal.java`:**

```java
Aluno aluno1 = new Aluno("Maria", 20);
aluno1.definirNome("Maria Santos");
aluno1.definirIdade(21);
```

**Responda:**

**Qual era o estado de `aluno1` logo apos a criacao?**

R.

**Qual era o estado de `aluno1` apos as chamadas de `definirNome` e `definirIdade`?**

R.

**O `codigoIdentificador` mudou tambem? Por que?**

R.

---

## Atividade 4 - Random e codigo unico

**O atributo `codigoIdentificador` e gerado usando `Random`. Abra o `Aluno.java` e observe o construtor.**

**Responda:**

**O que faz a linha `this.aleatorio = new Random()`?**

R.

**O que faz a linha `this.codigoIdentificador = aleatorio.nextDouble()`?**

R.

**Por que e util gerar um codigo automatico no construtor?**

R.

**Execute o programa duas vezes. Os codigos sao iguais ou diferentes entre execucoes?**

R.

---

## Atividade 5 - Garbage Collection

**Analise o trecho:**

```java
Aluno temporario = new Aluno("Temporario", 15);
temporario = null;
System.gc();
```

**Responda:**

**O que acontece quando fazemos `temporario = null`?**

R.

**O que e o Garbage Collector (GC)?**

R.

**O que faz `System.gc()`? E uma ordem ou uma sugestao?**

R.

**O programador pode destruir um objeto manualmente em Java? Por que?**

R.

---

## Atividade 6 - Perguntas finais

**Complete as frases:**

**O estado de um objeto e definido por ___.**

R.

**O comportamento de um objeto e definido por ___.**

R.

**Quando um objeto nao tem mais nenhuma referencia apontando para ele, ele ___.**

R.

**A palavra `import java.util.Random` serve para ___.**

R.

---
