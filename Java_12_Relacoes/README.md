# Java 12 - Relacoes entre Objetos

## Objetivo

Entender os tres tipos de relacoes entre objetos em Java:
- **Associacao**: objetos se usam, existencias independentes.
- **Agregacao**: objeto pai contem filhos que sobrevivem sem o pai (ex: Escola e Aluno).
- **Composicao**: objeto pai contem filhos que NAO existem sem o pai (ex: Escola e Departamento).

## Arquivos

- `Aluno.java` - classe simples com existencia propria (agregacao).
- `Departamento.java` - criado e gerenciado pela Escola (composicao).
- `Endereco.java` - criado dentro da Escola (composicao).
- `Escola.java` - classe principal que centraliza as tres relacoes.
- `Principal.java` - demonstra as relacoes na pratica.
- `Questoes_Java_12_Relacoes.md` - enunciado e espaco para suas respostas.

## Como executar (Windows)

```bat
javac Java_12_Relacoes\Endereco.java Java_12_Relacoes\Departamento.java Java_12_Relacoes\Aluno.java Java_12_Relacoes\Escola.java Java_12_Relacoes\Principal.java
java Java_12_Relacoes.Principal
```
