# Java 12 - Relacoes entre Objetos - Questoes

---

## Atividade 1 - Executando o codigo

**O que fazer:**

- Execute o `Principal.java` e observe a saida.

**Cole a saida completa do terminal abaixo.**

```text

```

---

## Atividade 2 - Identificando as relacoes

**Analise o codigo de `Escola.java` e responda:**

**O `Endereco` e criado dentro do construtor da `Escola`. Que tipo de relacao isso representa?**

R.

**O `Aluno` e criado fora da `Escola` e depois passado para `matricularAluno`. Que tipo de relacao isso representa?**

R.

**O `Departamento` e criado pelo metodo `criarDepartamento` da propria `Escola`. Que tipo de relacao isso representa?**

R.

---

## Atividade 3 - Agregacao vs Composicao

**Complete a tabela:**

| Relacao | Classes | O filho sobrevive sem o pai? | Tipo |
|---------|---------|------------------------------|------|
| Escola - Aluno | ? | ? | ? |
| Escola - Departamento | ? | ? | ? |
| Escola - Endereco | ? | ? | ? |

---

## Atividade 4 - Cardinalidade

**Observe o codigo de `Escola.java`:**

```java
private Departamento[] departamentos; // array de ate 10
private Aluno[] discentes;            // array de ate 1000
```

**Qual e a cardinalidade da relacao Escola-Departamento?**

R.

**Qual e a cardinalidade da relacao Escola-Aluno?**

R.

**Qual e a cardinalidade da relacao Escola-Endereco?**

R.

---

## Atividade 5 - Ciclo de vida

**Imagine que a Escola fecha (objeto `escola` e destruido). Responda:**

**O que acontece com os objetos `Departamento`?**

R.

**O que acontece com os objetos `Aluno`?**

R.

**O que acontece com o objeto `Endereco`?**

R.

**Por que a diferenca entre Aluno e Departamento importa no design do sistema?**

R.

---

## Atividade 6 - Perguntas finais

**O que e Associacao?**

R.

**Qual e a diferenca principal entre Agregacao e Composicao?**

R.

**Composicao e um caso especial de qual outra relacao?**

R.

**Cite um exemplo real (fora do codigo) de cada relacao:**

- Associacao:

R.

- Agregacao:

R.

- Composicao:

R.

---
