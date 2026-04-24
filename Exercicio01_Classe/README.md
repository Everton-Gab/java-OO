# Exercício 01 — Classe (o "molde")

## Objetivo

Entender o que é uma **classe** em Java e a relação entre:

- nome do arquivo (`Aluno.java`)
- nome da classe (`public class Aluno`)
- execução do programa via `Principal.java`

## Arquivos

- `Aluno.java` — define a classe `Aluno` com atributos simples (`nome`, `idade`).
- `Principal.java` — imprime mensagens para provar que o projeto compila e executa.
- `Professor.java` — criado na Atividade 3 (novo molde).
- `Resposta_Exercicio_01.md` — suas respostas para todas as atividades.

## Estrutura esperada ao final

```
Exercicio01_Classe/
├── evidencias/
├── Aluno.java
├── Principal.java
├── Professor.java
└── README.md
```

## Como executar (Windows)

Na raiz do projeto:

```bat
javac Exercicio01_Classe\Aluno.java Exercicio01_Classe\Principal.java
java Exercicio01_Classe.Principal
```

---

## Atividades

### Atividade 1 — Executando o código

**O que fazer:**

1. Execute o arquivo `Principal.java`.
2. Observe a saída exibida no terminal.

**O que entregar:**

Copie e cole a saída exibida no terminal.

Saída esperada:

```
Exercicio 01 - Classe criada (molde).
Ainda nao existe nenhum aluno de verdade.
```

**O que responder:**

Explique com suas palavras:

- O que é uma classe?
- O que representa o arquivo `Aluno.java`?
- Por que o arquivo `Principal.java` existe?

---

### Atividade 2 — Alterando a mensagem

**O que fazer:**

No arquivo `Principal.java`, altere as mensagens para frases criadas por você.

Exemplo:

```java
System.out.println("Estou aprendendo Java.");
System.out.println("A classe Aluno ainda e apenas um molde.");
```

Execute novamente.

**O que entregar:**

Copie e cole a nova saída exibida.

**O que observar:**

Perceba que apenas a mensagem mudou, mas a estrutura do programa continua a mesma.

---

### Atividade 3 — Criando uma nova classe

**O que fazer:**

Crie um novo arquivo dentro da pasta `Exercicio01_Classe` chamado `Professor.java` com a seguinte estrutura:

```java
package Exercicio01_Classe;

public class Professor {
    public String nome;
    public String disciplina;
}
```

**O que entregar:**

Copie e cole o código criado.

**O que responder:**

- O que essa nova classe representa?
- Quais são os atributos dela?

---

### Atividade 4 — Adicionando um atributo

**O que fazer:**

No arquivo `Aluno.java`, adicione um novo atributo:

```java
public String turma;
```

A classe ficará assim:

```java
public class Aluno {
    public String nome;
    public int idade;
    public String turma;
}
```

**O que entregar:**

Copie e cole a nova versão da classe.

**O que responder:**

- O que é um atributo?
- O que o atributo `turma` representa?

---

### Atividade 5 — Criando erro proposital

**O que fazer:**

No arquivo `Aluno.java`, remova propositalmente um ponto e vírgula.

Troque:

```java
public String nome;
```

Por:

```java
public String nome
```

Tente executar ou compilar.

**O que deve acontecer:**

O Java deve acusar erro de sintaxe.

**O que entregar:**

Copie e cole a mensagem de erro exibida pelo compilador. Depois corrija o erro novamente.

**O que responder:**

- O que faltava no código?
- Por que o Java não aceitou?

---

### Atividade 6 — Explicação final

Responda com suas palavras:

1. O que é uma classe?
2. O que são atributos?
3. Por que `Principal.java` possui o método `main`?
4. Por que `Aluno.java` não executa sozinho?
5. O que você aprendeu neste exercício?

> Registre suas respostas no arquivo `Resposta_Exercicio_01.md`.
