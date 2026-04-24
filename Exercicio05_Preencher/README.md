# Exercício 05 — Métodos (comportamentos do objeto)

## Objetivo

Entender o que é um **método** em Java e como objetos podem executar ações
definidas na classe.

## Arquivos

- `Aluno.java` — a classe com atributos e métodos.
- `Principal.java` — cria objetos e chama os métodos.
- `Resposta_Exercicio_05.md` — suas respostas para todas as atividades.

## Estrutura esperada ao final

```
Exercicio05_Metodos/
├── evidencias/
├── Aluno.java
├── Principal.java
└── README.md
```

## Como executar (Windows)

Na raiz do projeto:

```bat
javac Exercicio05_Metodos\Aluno.java Exercicio05_Metodos\Principal.java
java Exercicio05_Metodos.Principal
```

---

## Atividades

### Atividade 1 — Executando o código

**O que fazer:**

1. Execute o arquivo `Principal.java` sem alterar nada.
2. Observe a saída exibida no terminal.

**O que entregar:**

Copie e cole a saída do terminal.

Saída esperada:

```
Aluno: Carlos
Idade: 20
```

**O que responder:**

- O que é um método?
- O que o método `apresentar()` faz?

---

### Atividade 2 — Criando outro objeto

**O que fazer:**

Adicione no código:

```java
Aluno aluno2 = new Aluno();
aluno2.nome = "Maria";
aluno2.idade = 19;
aluno2.apresentar();
```

Execute novamente.

**O que entregar:**

Copie e cole o resultado exibido no terminal.

**O que responder:**

- Por que o método pode ser usado por mais de um objeto?
- O que isso mostra sobre a classe?

---

### Atividade 3 — Criando um novo método

**O que fazer:**

Adicione na classe `Aluno` o método:

```java
public void estudar() {
    System.out.println(nome + " esta estudando.");
}
```

Depois chame no `Principal.java`:

```java
aluno1.estudar();
```

Execute novamente.

**O que entregar:**

Copie e cole o resultado exibido no terminal.

**O que responder:**

- O que significa um objeto executar um método?
- O que representa o método `estudar()`?

---

### Atividade 4 — Chamando o método em vários objetos

**O que fazer:**

Adicione:

```java
aluno2.estudar();
```

Execute novamente.

**O que entregar:**

Copie e cole o resultado exibido no terminal.

**O que responder:**

- Por que os dois objetos conseguem executar o mesmo método?
- O método pertence ao objeto ou à classe?

---

### Atividade 5 — Criando outro comportamento

**O que fazer:**

Na classe `Aluno`, crie:

```java
public void fazerProva() {
    System.out.println(nome + " esta fazendo prova.");
}
```

Depois chame no `Principal.java`:

```java
aluno1.fazerProva();
aluno2.fazerProva();
```

Execute novamente.

**O que entregar:**

Copie e cole o resultado exibido no terminal.

**O que responder:**

- O que são comportamentos de um objeto?
- Por que métodos representam ações?

---

### Atividade 6 — Observando os métodos

Explique com suas palavras:

- O que é um método em Java?
- Qual é a diferença entre atributo e método?

---

### Atividade 7 — Relação entre objeto e método

Explique:

- Por que precisamos de um objeto para executar o método?
- O que significa chamar um método usando `objeto.metodo()`?

---

### Atividade 8 — Explicação final

Responda:

- O que você aprendeu sobre métodos?
- Por que métodos são importantes em programação orientada a objetos?

> Registre suas respostas no arquivo `Resposta_Exercicio_05.md`.
