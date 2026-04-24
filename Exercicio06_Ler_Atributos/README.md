# Exercício 06 — Ler atributos

## Objetivo

Praticar a leitura de atributos de um objeto:

- Criar um objeto com `new`
- Preencher atributos usando `.`
- **Ler** os atributos e imprimir no console

## Arquivos

- `Aluno.java` — a classe (molde), com atributos `nome` e `idade`.
- `Principal.java` — cria um objeto, preenche e lê os atributos.
- `Resposta_Exercicio_06.md` — suas respostas para todas as atividades.

## Estrutura esperada ao final

```
Exercicio06_Ler_Atributos/
├── evidencias/
├── Aluno.java
├── Principal.java
└── README.md
```

## Como executar (Windows)

Na raiz do projeto:

```bat
javac Exercicio06_Ler_Atributos\Aluno.java Exercicio06_Ler_Atributos\Principal.java
java Exercicio06_Ler_Atributos.Principal
```

---

## Atividades

### Atividade 1 — Executando o código base

**O que fazer:**

1. Execute o arquivo `Principal.java` sem alterar nada.
2. Observe a saída exibida no terminal.

**O que entregar:**

Copie e cole a saída do terminal.

Saída esperada:

```
Maria
20
```

**O que responder:**

- O que significa "ler" um atributo?
- Qual atributo foi lido em cada `println`?

---

### Atividade 2 — Alterando valores e lendo novamente

**O que fazer:**

No arquivo `Principal.java`, altere os valores atribuídos:

```java
objetoAluno.nome = "Ana";
objetoAluno.idade = 17;
```

Execute novamente.

**O que entregar:**

Copie e cole a nova saída.

**O que responder:**

- O que mudou na leitura dos atributos?
- Por que a saída mudou?

---

### Atividade 3 — Lendo em forma de texto

**O que fazer:**

Altere a impressão para mostrar em forma de frase:

```java
System.out.println("Aluno: " + objetoAluno.nome);
System.out.println("Idade: " + objetoAluno.idade);
```

Execute novamente.

**O que entregar:**

Copie e cole o resultado exibido.

**O que responder:**

- Qual é a diferença entre imprimir apenas o valor e imprimir com texto?
- O conteúdo lido mudou?

---

### Atividade 4 — Lendo antes de preencher (objeto recém-criado)

**O que fazer:**

Crie outro objeto e leia antes de preencher:

```java
Aluno aluno2 = new Aluno();
System.out.println(aluno2.nome);
System.out.println(aluno2.idade);
```

Depois preencha e leia novamente:

```java
aluno2.nome = "Lucas";
aluno2.idade = 21;
System.out.println(aluno2.nome);
System.out.println(aluno2.idade);
```

Execute novamente.

**O que entregar:**

Copie e cole a saída completa.

**O que responder:**

- Quais valores aparecem inicialmente antes de preencher?
- Por que esses valores aparecem?

---

### Atividade 5 — Lendo valores de mais de um objeto

**O que fazer:**

Leia os atributos dos dois objetos em sequência:

```java
System.out.println(objetoAluno.nome);
System.out.println(objetoAluno.idade);
System.out.println(aluno2.nome);
System.out.println(aluno2.idade);
```

Execute novamente.

**O que entregar:**

Copie e cole a saída.

**O que responder:**

- Como a leitura confirma que existem objetos diferentes?
- O que aconteceria se ambos os objetos fossem o mesmo?

---

### Atividade 6 — Explicação final

Responda com suas palavras:

1. O que é "ler um atributo" em Java?
2. Qual a diferença entre preencher e ler?
3. O que significa acessar `objeto.atributo`?
4. O que você aprendeu neste exercício?

> Registre suas respostas no arquivo `Resposta_Exercicio_06.md`.
