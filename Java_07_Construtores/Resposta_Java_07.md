# Exercício 07 — Construtores

## Objetivo

Entender o que é um **construtor** em Java e como ele **inicializa automaticamente** os atributos de um objeto no momento da criação.

Neste exercício você vai aprender:

- O que é um construtor e quando ele é chamado
- A diferença entre construtor **sem parâmetros** (vazio) e **com parâmetros**
- O que significa a palavra-chave `this`
- Por que construtores são úteis (evitam esquecer de preencher atributos)

## Contexto — por que aprender construtores?

Nos exercícios anteriores você criava objetos vazios e preenchia depois:

```java
// Jeito antigo (Ex. 01–06)
Aluno aluno = new Aluno();
aluno.nome = "João";
aluno.idade = 18;
```

Com construtores, você faz tudo de uma vez:

```java
// Jeito novo (Ex. 07)
Aluno aluno = new Aluno("João", 18);
```

## Arquivos

- `Aluno.java` — define a classe com **dois construtores**: vazio e com parâmetros.
- `Principal.java` — demonstra os 4 jeitos diferentes de criar e preencher um objeto.
- `Resposta_Exercicio_07.md` — suas respostas para todas as atividades.

## Estrutura esperada ao final

```
Exercicio07_Construtores/
├── evidencias/
├── Aluno.java
├── Principal.java
└── README.md
```

## Como executar (Windows)

Na raiz do projeto:

```bat
javac Exercicio07_Construtores\Aluno.java Exercicio07_Construtores\Principal.java
java Exercicio07_Construtores.Principal
```

---

## Atividades

### Atividade 1 — Execute e observe

**O que fazer:**

1. Execute o `Principal.java` como está, sem alterar nada.
2. Observe a saída e note os **4 jeitos diferentes** de criar e preencher objetos.
3. Repare como cada jeito usa um construtor diferente.

**O que entregar:**

Copie e cole a saída completa do terminal.

---

### Atividade 2 — Entendendo construtores

No arquivo `Aluno.java`, você encontra dois construtores:

```java
public Aluno() {
    // Construtor vazio — não inicializa nada
}

public Aluno(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}
```

Um construtor é um **método especial** chamado automaticamente quando você usa `new`. Toda vez que você escreve `new`, um construtor é invocado:

```java
new Aluno()               // chama o construtor vazio
new Aluno("João", 18)    // chama o construtor com parâmetros
```

**O que observar:** leia os comentários no `Aluno.java` e entenda o papel de cada construtor antes de continuar.

---

### Atividade 3 — Comparando os jeitos

Copie e complete a tabela no seu arquivo de respostas:

| Jeito | Código | O que acontece | Nome do construtor usado |
|-------|--------|----------------|--------------------------|
| 1 | `Aluno aluno1 = new Aluno();` | Cria vazio, depois preenche manualmente | ? |
| 2 | `Aluno aluno2 = new Aluno("Maria", 20);` | Cria JÁ preenchido | ? |
| 3 | `Aluno aluno3 = new Aluno();` depois `aluno3.nome = ...` | Cria vazio, depois preenche | ? |
| 4 | `Aluno aluno4 = new Aluno("Ana", 21);` | Cria JÁ preenchido | ? |

---

### Atividade 4 — Entendendo `this`

Observe a linha dentro do construtor parametrizado:

```java
this.nome = nome;
```

- `this.nome` — é o **atributo** do objeto
- `nome` — é o **parâmetro** recebido no construtor
- `this` — significa "**este objeto**"

Sem `this`, o Java não conseguiria diferenciar o parâmetro do atributo:

```java
// ERRADO — Java não sabe qual é qual:
public Aluno(String nome, int idade) {
    nome = nome;
    idade = idade;
}

// CORRETO — this deixa claro que é o atributo do objeto:
public Aluno(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}
```

**O que observar:** identifique todas as ocorrências de `this` no `Aluno.java` e explique o que cada uma faz.

---

### Atividade 5 — Perguntas

Responda com suas palavras:

1. O que é um construtor?
2. O que faz a palavra `new`? (Reforce o que aprendeu nos exercícios anteriores.)
3. Qual é a diferença entre `new Aluno()` e `new Aluno("João", 18)`?
4. O que significa `this` no construtor?
5. Por que é vantajoso ter um construtor com parâmetros? (Dica: pense em criar 100 alunos.)
6. A classe `Aluno` tem quantos construtores? Liste cada um.

---

### Atividade 6 — Modificando o código

Abra o `Principal.java` e faça as seguintes alterações. Execute após cada mudança:

1. Crie 3 novos alunos usando o construtor parametrizado (use nomes e idades diferentes).
2. Imprima o nome e a idade de cada um.
3. Crie mais um aluno com o construtor vazio, preencha os atributos manualmente e imprima.

**O que entregar:** copie e cole a saída completa do terminal após as alterações.

---

### Atividade 7 — Reflexão final

Responda:

1. Qual jeito você prefere: construtor vazio ou construtor com parâmetros? Por quê?
2. Se precisasse criar 1000 alunos, qual seria mais prático?
3. É possível ter os dois construtores na mesma classe? Explique.

> Registre suas respostas no arquivo `Resposta_Exercicio_07.md`.

<!-- Java_07_Construtores;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercício 07 - Construtores ===\n");

        // Jeito 1 — construtor vazio, preenche depois
        System.out.println("--- Jeito 1: Construtor vazio ---");
        Aluno aluno1 = new Aluno();
        System.out.println("Criado: aluno1 = new Aluno();");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);
        aluno1.nome = "João Silva";
        aluno1.idade = 18;
        System.out.println("\nDepois de preencher:");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);

        // Jeito 2 — construtor com parâmetros
        System.out.println("\n--- Jeito 2: Construtor com parâmetros ---");
        Aluno aluno2 = new Aluno("Maria Santos", 20);
        System.out.println("Criado: aluno2 = new Aluno(\"Maria Santos\", 20);");
        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Idade: " + aluno2.idade);

        // Jeito 3 — construtor vazio, preenche logo em seguida
        System.out.println("\n--- Jeito 3: Construtor vazio, depois preenche ---");
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Carlos";
        aluno3.idade = 19;
        System.out.println("Nome: " + aluno3.nome);
        System.out.println("Idade: " + aluno3.idade);

        // Jeito 4 — múltiplos objetos com construtor parametrizado
        System.out.println("\n--- Jeito 4: Múltiplos objetos (construtor parametrizado) ---");
        Aluno aluno4 = new Aluno("Ana", 21);
        Aluno aluno5 = new Aluno("Bruno", 17);
        Aluno aluno6 = new Aluno("Carla", 19);
        System.out.println("Aluno 4: " + aluno4.nome + " (" + aluno4.idade + " anos)");
        System.out.println("Aluno 5: " + aluno5.nome + " (" + aluno5.idade + " anos)");
        System.out.println("Aluno 6: " + aluno6.nome + " (" + aluno6.idade + " anos)");

        System.out.println("\n=== Conclusão ===");
        System.out.println("Construtores permitem inicializar o objeto com dados");
        System.out.println("desde o momento da criação, evitando esquecer de preencher.");

        // Atividade 6 — 3 novos alunos parametrizados + 1 vazio preenchido depois
        System.out.println("\n--- Atividade 6: Criando mais alunos ---");
        Aluno aluno7 = new Aluno("Fernando", 22);
        Aluno aluno8 = new Aluno("Gabriela", 19);
        Aluno aluno9 = new Aluno("Helena", 21);
        System.out.println("Aluno 7: " + aluno7.nome + " (" + aluno7.idade + " anos)");
        System.out.println("Aluno 8: " + aluno8.nome + " (" + aluno8.idade + " anos)");
        System.out.println("Aluno 9: " + aluno9.nome + " (" + aluno9.idade + " anos)");

        Aluno aluno10 = new Aluno();
        aluno10.nome = "Igor";
        aluno10.idade = 20;
        System.out.println("Aluno 10: " + aluno10.nome + " (" + aluno10.idade + " anos)");

    }

} -->
