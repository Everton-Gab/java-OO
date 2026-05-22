# Java 06 - Ler atributos - Questoes

---

## Atividade 1 - Executando o codigo base

**O que fazer:**

- Execute o `Principal.java` sem alterar nada.

**Cole a saida do terminal abaixo.**

```text

```

**Responda:**

**O que significa ler um atributo?**

R.

**Qual atributo foi lido em cada `println`?**

R.

---

## Atividade 2 - Alterando valores e lendo novamente

**O que fazer:**

- Altere os valores:
```java
- objetoAluno.nome = "Ana";
- objetoAluno.idade = 17;
```
- Execute novamente.

**Cole a nova saida abaixo.**

```text

```

**Responda:**

**O que mudou na leitura dos atributos?**

R.

**Por que a saida mudou?**

R.

---

## Atividade 3 - Lendo em forma de texto

**O que fazer:**

- Altere a impressao para:
```java
System.out.println("Aluno: " + objetoAluno.nome);
System.out.println("Idade: " + objetoAluno.idade);
```
- Execute novamente.

**Cole o resultado abaixo.**

```text

```

**Responda:**

**Qual e a diferenca entre imprimir apenas o valor e imprimir com texto?**

R.

**O conteudo lido mudou?**

R.

---

## Atividade 4 - Lendo antes de preencher

**O que fazer:**

- Crie outro objeto e leia antes de preencher:
```java
Aluno aluno2 = new Aluno();
System.out.println(aluno2.nome);
System.out.println(aluno2.idade);
```
- Depois preencha e leia novamente:
```java
aluno2.nome = "Lucas";
aluno2.idade = 21;
System.out.println(aluno2.nome);
System.out.println(aluno2.idade);
```
- Execute novamente.

**Cole a saida completa abaixo.**

```text

```

**Responda:**

**Quais valores aparecem antes de preencher?**

R.

**Por que esses valores aparecem?**

R.

---

## Atividade 5 - Lendo valores de mais de um objeto

**O que fazer:**

- Leia os dois objetos em sequencia:
```java
System.out.println(objetoAluno.nome);
System.out.println(objetoAluno.idade);
System.out.println(aluno2.nome);
System.out.println(aluno2.idade);
```
- Execute novamente.

**Cole a saida abaixo.**

```text

```

**Responda:**

**Como a leitura confirma que existem objetos diferentes?**

R.

**O que aconteceria se ambos os objetos fossem o mesmo?**

R.

---

## Atividade 6 - Explicacao final

**Responda:**

**O que e ler um atributo em Java?**

R.

**Qual a diferenca entre preencher e ler?**

R.

**O que significa acessar `objeto.atributo`?**

R.

**O que voce aprendeu neste exercicio?**

R.

---
