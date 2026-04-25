# Java 05 - Preencher atributos

## Objetivo

Aprender como **preencher os atributos** de um objeto após criá-lo com `new`, entender o que o operador `.` faz e a diferença entre um objeto recém-criado e um objeto com dados preenchidos.

## Arquivos

- `Aluno.java` - a classe (molde), com atributos `nome` e `idade`.
- `Principal.java` - cria um objeto e preenche seus atributos.
- `Resposta_Java_05_Preencher.md` - suas respostas para as atividades.

## Estrutura esperada ao final

```text
Java_05_Preencher/
├── evidencias/
├── Aluno.java
├── Principal.java
└── README.md
```text

## Como executar (Windows)

```bat
javac Java_05_Preencher\Aluno.java Java_05_Preencher\Principal.java
java Java_05_Preencher.Principal
```text

---

## Atividades

### Atividade 1 - Preenchendo o objeto

**O que fazer:**

1. Execute o `Principal.java` como está.
2. Observe quais valores foram impressos para `aluno.nome` e `aluno.idade`.
3. Altere os valores no código (mude o nome e a idade) e execute novamente.

**O que entregar:** Copie e cole a saída antes e depois da alteração.

---

### Atividade 2 - Perguntas

Responda com suas palavras:

1. Em `aluno.nome = "Joao Silva";`, o que significa `aluno.nome`?
2. O que acontece se você criar o objeto (`new Aluno()`) mas não preencher `nome` e `idade`?
3. O que o operador `.` (ponto) permite fazer quando temos um objeto em uma variável?

> Registre suas respostas no arquivo `Resposta_Java_05_Preencher.md`.
