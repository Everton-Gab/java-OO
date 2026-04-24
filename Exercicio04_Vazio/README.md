# Exercício 04 — Objeto "vazio" e valores padrão

## Objetivo

Entender que, ao nascer, um objeto tem **valores padrão** nos atributos:

- `String` → `null`
- `int` → `0`

## Arquivos

- `Aluno.java` — a classe (molde), com atributos `nome` e `idade`.
- `Principal.java` — cria um `Aluno` sem preencher nada e imprime os atributos.
- `Resposta_Exercicio_04.md` — suas respostas para as atividades.

## Estrutura esperada ao final

```
Exercicio04_Vazio/
├── evidencias/
├── Aluno.java
├── Principal.java
└── README.md
```

## Como executar (Windows)

Na raiz do projeto:

```bat
javac Exercicio04_Vazio\Aluno.java Exercicio04_Vazio\Principal.java
java Exercicio04_Vazio.Principal
```

---

## Atividades

### Atividade 1 — Rodando o programa

**O que fazer:**

1. Execute o arquivo `Principal.java` sem alterar nada.
2. Observe o que aparece no console para `aluno.nome` e `aluno.idade`.

**O que entregar:**

Copie e cole a saída do terminal.

**O que responder:**

- Qual valor apareceu para `nome`? O que significa esse valor?
- Qual valor apareceu para `idade`? Por que não aparece "vazio"?

---

### Atividade 2 — Preenchendo os atributos

**O que fazer:**

Adicione no `Principal.java`, após as primeiras impressões:

```java
aluno.nome = "Ana";
aluno.idade = 17;
System.out.println("Depois de preencher:");
System.out.println("nome  = " + aluno.nome);
System.out.println("idade = " + aluno.idade);
```

Execute novamente.

**O que entregar:**

Copie e cole o novo resultado exibido no terminal.

**O que responder:**

- O que muda quando você preenche `nome` e `idade` manualmente?

> Registre suas respostas no arquivo `Resposta_Exercicio_04.md`.
