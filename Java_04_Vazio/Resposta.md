Com certeza! Vamos continuar avançando nessa trilha. Este exercício aborda um comportamento muito importante do Java: os **valores padrão de inicialização** (default values). Quando criamos um objeto e não atribuímos valores aos seus atributos imediatamente, o Java faz isso por nós para evitar dados corrompidos na memória.

Assim como nos exercícios anteriores, deixei os espaços textuais das saídas de terminal marcados para você completar com o que rodar na sua máquina, e abaixo estão as respostas teóricas prontas:

---

## Atividade 1 - Rodando o programa

**O que fazer:** *[Execute o arquivo Principal.java original e cole a saída do terminal aqui]*

### Respostas:

* **Qual valor apareceu para nome? O que significa esse valor?**
R. Para o atributo nome, apareceu o valor **null**. Isso significa que a variável é uma referência a um objeto (neste caso, uma String), mas ela atualmente não está apontando para lugar nenhum na memória; ela está completamente vazia e sem texto associado.
* **Qual valor apareceu para idade? Por que não aparece vazio?**
R. Para o atributo idade, apareceu o valor **0**. Não aparece vazio porque int é um tipo primitivo numérico no Java e tipos primitivos não podem ser nulos (null). Por padrão, o Java inicializa automaticamente atributos numéricos inteiros com o valor zero.

---

## Atividade 2 - Preenchendo os atributos

**O que fazer:** *[Cole aqui a nova saída do seu terminal após preencher os dados, mostrando os novos valores "Ana" e "17"]*

### Respostas:

* **O que muda quando você preenche nome e idade manualmente?**
R. Os valores padrão de inicialização (null e 0) são substituídos e sobrescritos pelos novos dados inseridos. O objeto aluno passa a ter um **estado definido**, onde o atributo nome agora aponta para um texto real na memória ("Ana") e o atributo idade passa a armazenar o valor numérico efetivo (17).