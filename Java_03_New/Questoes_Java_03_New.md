# Java 03 - A palavra new e multiplos objetos - Questoes

---

## Atividade 1 - Criando o primeiro objeto

**O que fazer:**

- Execute o arquivo `Principal.java` sem alterar nada.

> **Observacao:** O codigo `@XXXXXXXX` muda a cada execucao.

**Cole a saida do terminal abaixo.**

```text

```

**Responda:**

**O que e um objeto criado com `new`?**

R.

**O que acontece quando executamos `Aluno aluno1 = new Aluno();`?**

R.

---

## Atividade 2 - Criando varios objetos

**O que fazer:**

- Modifique o codigo para criar mais dois objetos:

```java
Aluno aluno2 = new Aluno();
Aluno aluno3 = new Aluno();
System.out.println("Tres objetos foram criados.");
```

- Execute novamente.

**Cole a saida do terminal abaixo.**

```text

```

**Responda:**

**Por que foi possivel criar tres objetos da mesma classe?**

R.

**O que significa dizer que todos foram criados a partir do mesmo molde?**

R.

---

## Atividade 3 - Preenchendo os dados dos objetos

**O que fazer:**

- Adicione no codigo:

```java
aluno1.nome = "Carlos"; aluno1.idade = 20;
aluno2.nome = "Maria";  aluno2.idade = 19;
aluno3.nome = "Pedro";  aluno3.idade = 22;
System.out.println(aluno1.nome);
System.out.println(aluno2.nome);
System.out.println(aluno3.nome);
```

- Execute novamente.

**Cole a saida do terminal abaixo.**

```text

```

**Responda:**

**Por que cada objeto possui valores diferentes?**

R.

**O que isso mostra sobre como os objetos sao armazenados na memoria?**

R.

---

## Atividade 4 - Mostrando todos os dados

**O que fazer:**

- Adicione:

```java
System.out.println(aluno1.nome + " - " + aluno1.idade);
System.out.println(aluno2.nome + " - " + aluno2.idade);
System.out.println(aluno3.nome + " - " + aluno3.idade);
```

- Execute novamente.

**Cole a saida do terminal abaixo.**

```text

```

**Responda:**

**Por que cada aluno mantem seus proprios dados?**

R.

**O que aconteceria se todos os objetos compartilhassem os mesmos valores?**

R.

---

## Atividade 5 - Observando as referencias na memoria

**O que fazer:**

- Adicione:

```java
System.out.println(aluno1);
System.out.println(aluno2);
System.out.println(aluno3);
```

- Execute novamente.

**Cole a saida do terminal abaixo.**

```text

```

**Responda:**

**Por que aparecem codigos diferentes para cada objeto?**

R.

**O que esses codigos representam na memoria?**

R.

---

## Atividade 6 - Explicacao final

**Responda:**

**O que acontece quando criamos varios objetos da mesma classe?**

R.

**O que significa cada objeto possuir sua propria referencia?**

R.

**Qual e a relacao entre classe e objeto?**

R.

**O que voce aprendeu neste exercicio?**

R.

---
