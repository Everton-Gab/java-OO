# Java 03 — A palavra `new` e múltiplos objetos

## Objetivo

Perceber que `new` é o que **cria o objeto na memória** e que é possível criar **vários objetos** do mesmo tipo independentes entre si.

## Arquivos

- `Aluno.java` — a classe (molde), com atributos `nome` e `idade`.
- `Principal.java` — cria múltiplos objetos com `new`, preenche atributos e compara referências.
- `Resposta_Java_03_New.md` — suas respostas para todas as atividades.

## Estrutura esperada ao final

```text
Java_03_New/
├── evidencias/
├── Aluno.java
├── Principal.java
└── README.md
```text

## Como executar (Windows)

Na raiz do projeto:

```bat
javac Java_03_New\Aluno.java Java_03_New\Principal.java
java Java_03_New.Principal
```text

---

## Atividades

### Atividade 1 — Criando o primeiro objeto

**O que fazer:**

1. Execute o arquivo `Principal.java` sem alterar nada.
2. Observe a saída exibida no terminal.

**O que entregar:**

Copie e cole a saída do terminal.

Saída esperada:

```text
Java 03 - Criacao de multiplos objetos.
Java_03_New.Aluno@XXXXXXXX
```text

> O código `@XXXXXXXX` muda a cada execução — é a representação da referência do objeto na memória.

**O que responder:**

- O que é um objeto criado com `new`?
- O que acontece quando executamos `Aluno aluno1 = new Aluno();`?

---

### Atividade 2 — Criando vários objetos

**O que fazer:**

Modifique o código para:

```java
Aluno aluno1 = new Aluno();
Aluno aluno2 = new Aluno();
Aluno aluno3 = new Aluno();
System.out.println("Tres objetos foram criados.");
```text

Execute novamente.

**O que entregar:**

Copie e cole o resultado exibido no terminal.

**O que responder:**

- Por que foi possível criar três objetos da mesma classe?
- O que significa dizer que todos foram criados a partir do mesmo "molde"?

---

### Atividade 3 — Preenchendo os dados dos objetos

**O que fazer:**

Adicione no código:

```java
aluno1.nome = "Carlos";
aluno1.idade = 20;
aluno2.nome = "Maria";
aluno2.idade = 19;
aluno3.nome = "Pedro";
aluno3.idade = 22;
System.out.println(aluno1.nome);
System.out.println(aluno2.nome);
System.out.println(aluno3.nome);
```text

Execute novamente.

**O que entregar:**

Copie e cole o resultado exibido no terminal.

**O que responder:**

- Por que cada objeto possui valores diferentes?
- O que isso mostra sobre como os objetos são armazenados na memória?

---

### Atividade 4 — Mostrando todos os dados

**O que fazer:**

Adicione:

```java
System.out.println(aluno1.nome + " - " + aluno1.idade);
System.out.println(aluno2.nome + " - " + aluno2.idade);
System.out.println(aluno3.nome + " - " + aluno3.idade);
```text

Execute novamente.

**O que entregar:**

Copie e cole o resultado exibido no terminal.

**O que responder:**

- Por que cada aluno mantém seus próprios dados?
- O que aconteceria se todos os objetos compartilhassem os mesmos valores?

---

### Atividade 5 — Observando as referências na memória

**O que fazer:**

Adicione no código:

```java
System.out.println(aluno1);
System.out.println(aluno2);
System.out.println(aluno3);
```text

Execute novamente.

**O que entregar:**

Copie e cole o resultado exibido no terminal.

Exemplo esperado:

```text
Java_03_New.Aluno@5acf9800
Java_03_New.Aluno@4617c264
Java_03_New.Aluno@36baf30c
```text

**O que responder:**

- Por que aparecem códigos diferentes para cada objeto?
- O que esses códigos representam na memória?

---

### Atividade 6 — Explicação final

Responda com suas palavras:

1. O que acontece quando criamos vários objetos da mesma classe?
2. O que significa cada objeto possuir sua própria referência?
3. Qual é a relação entre classe e objeto?
4. O que você aprendeu neste exercício?

> Registre suas respostas no arquivo `Resposta_Java_03_New.md`.
