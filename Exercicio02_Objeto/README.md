# Exercício 02 — Objeto (instância)

## Objetivo

Entender o que é um **objeto** e o papel da palavra `new` na criação de uma instância.

## Arquivos

- `Aluno.java` — a classe (molde), com atributos `nome` e `idade`.
- `Principal.java` — cria objetos com `new` e demonstra o uso de atributos.
- `Resposta_Exercicio_02.md` — suas respostas para todas as atividades.

## Estrutura esperada ao final

```
Exercicio02_Objeto/
├── evidencias/
├── Aluno.java
├── Principal.java
└── README.md
```

## Como executar (Windows)

Na raiz do projeto:

```bat
javac Exercicio02_Objeto\Aluno.java Exercicio02_Objeto\Principal.java
java Exercicio02_Objeto.Principal
```

---

## Atividades

### Atividade 1 — Executando o código original

**O que fazer:**

1. Execute o arquivo `Principal.java` sem alterar nada.
2. Observe a saída exibida no terminal.

**O que entregar:**

Copie e cole a saída do terminal.

Saída esperada:

```
Exercicio 02 - Objeto criado com sucesso.
Esse objetoAluno é um Aluno real (instancia) criado a partir da classe Aluno.
```

**O que responder:**

- O que é um objeto?
- O que a palavra `new` faz no código?
- O que significa dizer que um objeto é uma instância de uma classe?

---

### Atividade 2 — Criando mais um objeto

**O que fazer:**

No arquivo `Principal.java`, crie um segundo objeto:

```java
Aluno objetoAluno2 = new Aluno();
```

Depois adicione:

```java
System.out.println(objetoAluno2);
```

Execute novamente o programa.

**O que entregar:**

Copie e cole a saída do terminal.

**O que observar:**

Você verá dois objetos diferentes na memória.

**O que responder:**

- Por que os dois objetos são diferentes?
- O que significa cada objeto ocupar um espaço diferente na memória?

---

### Atividade 3 — Preenchendo atributos

**O que fazer:**

Adicione no código:

```java
objetoAluno.nome = "Carlos";
objetoAluno.idade = 20;
System.out.println(objetoAluno.nome);
System.out.println(objetoAluno.idade);
```

Execute novamente.

**O que entregar:**

Copie e cole o resultado exibido no terminal.

**O que responder:**

- O que significa preencher um atributo?
- O que os atributos `nome` e `idade` representam no objeto?

---

### Atividade 4 — Alterando os valores

**O que fazer:**

Modifique o código para:

```java
objetoAluno.nome = "Maria";
objetoAluno.idade = 18;
```

Execute novamente.

**O que entregar:**

Copie e cole o novo resultado.

**O que responder:**

- Por que foi possível alterar os valores do objeto?
- O objeto continua sendo o mesmo?

---

### Atividade 5 — Criando outro aluno

**O que fazer:**

Adicione:

```java
objetoAluno2.nome = "Pedro";
objetoAluno2.idade = 22;
System.out.println(objetoAluno2.nome);
System.out.println(objetoAluno2.idade);
```

Execute novamente.

**O que entregar:**

Copie e cole o resultado exibido.

**O que responder:**

- O que diferencia `objetoAluno` de `objetoAluno2`?
- Por que os dois podem ter valores diferentes?

---

### Atividade 6 — Observando o objeto na memória

**O que fazer:**

Adicione:

```java
System.out.println(objetoAluno);
System.out.println(objetoAluno2);
```

Execute novamente.

**O que entregar:**

Copie e cole o resultado.

Exemplo esperado:

```
Exercicio02_Objeto.Aluno@4e25154f
Exercicio02_Objeto.Aluno@70dea4e
```

**O que responder:**

- Por que aparecem códigos diferentes?
- O que isso representa na memória?

---

### Atividade 7 — Explicação final

Responda com suas palavras:

1. O que é um objeto em Java?
2. Qual é a diferença entre classe e objeto?
3. O que faz a palavra `new`?
4. O que são atributos?
5. O que você aprendeu neste exercício?

> Registre suas respostas no arquivo `Resposta_Exercicio_02.md`.
