<<<<<<< HEAD
# Exercícios Java — Orientação a Objetos (javaOO)
=======
# Exercícios Java - Orientação a Objetos (javaOO)
>>>>>>> upstream/main

Conjunto de exercícios para suporte e prática no aprendizado de **Java** e **Orientação a Objetos**.

## Estrutura

<<<<<<< HEAD
### Nível 1 — Fundação (Classe, Objeto, Atributos)

- `Exercicio01_Classe/` — O que é uma classe (molde)
- `Exercicio02_Objeto/` — O que é um objeto (instância)
- `Exercicio03_New/` — Criar múltiplos objetos
- `Exercicio04_Vazio/` — Valores padrão (defaults)
- `Exercicio05_Preencher/` — Preenchendo atributos
- `Exercicio06_Ler_Atributos/` — Lendo atributos

### Nível 2 — Métodos e Construtores

- `Exercicio07_Construtores/` — Inicializar objetos no momento da criação
- `Exercicio08_Metodos/` — Adicionar comportamento (ações) aos objetos
- `Exercicio09_Encapsulamento/` — Proteger dados com `private` e `public`

Cada pasta geralmente possui:

- `Aluno.java` — A classe
- `Principal.java` — Arquivo executável (main) com exemplos
- `README.md` — Objetivo e instruções
- um enunciado (`Exercicio_XX_*.md`) — O que fazer
- um arquivo de respostas (`Resposta_Exercicio_XX.md`) — Respostas esperadas e explicações
=======
### Nível 1 - Fundação (Classe, Objeto, Atributos)

- `Java_01_Classe/` - O que é uma classe (molde)
- `Java_02_Objeto/` - O que é um objeto (instância)
- `Java_03_New/` - Criar múltiplos objetos
- `Java_04_Vazio/` - Valores padrão (defaults)
- `Java_05_Preencher/` - Preenchendo atributos
- `Java_06_Ler_Atributos/` - Lendo atributos

### Nível 2 - Métodos e Construtores

- `Java_07_Construtores/` - Inicializar objetos no momento da criação
- `Java_08_Metodos/` - Adicionar comportamento (ações) aos objetos
- `Java_09_Encapsulamento/` - Proteger dados com `private` e `public`

### Nível 3 - Modificadores, Estado e Relações

- `Java_10_Modificadores/` - Modificadores de acesso (public, private, protected)
- `Java_11_Estado_Objeto/` - Estado do objeto, Random, ciclo de vida e Garbage Collection
- `Java_12_Relacoes/` - Associação, Agregação e Composição entre objetos

Cada pasta geralmente possui:

- `Aluno.java` - A classe
- `Principal.java` - Arquivo executável (main) com exemplos
- `README.md` - Objetivo e instruções e posteriormente edição com a resposta do aluno
>>>>>>> upstream/main

## Roadmap de Aprendizado

Siga nesta ordem para melhor aprendizado:

| Exercício | Conceito | Duração | Status |
| --------- | -------- | ------- | ------ |
| 01 | Classe (molde) | 5 min | ✅ |
| 02 | Objeto (instância) | 5 min | ✅ |
| 03 | Múltiplos objetos | 5 min | ✅ |
| 04 | Valores padrão | 5 min | ✅ |
| 05 | Preenchendo atributos | 10 min | ✅ |
| 06 | Lendo atributos | 10 min | ✅ |
| **07** | **Construtores** | **15 min** | 🆕 |
| **08** | **Métodos** | **20 min** | 🆕 |
| **09** | **Encapsulamento** | **20 min** | 🆕 |
<<<<<<< HEAD

**Próximas (sugestões):**

- Exercício 10: Herança
- Exercício 11: Polimorfismo
- Exercício 12: Interfaces
- Exercício 13: Classes Abstratas
=======
| **10** | **Modificadores de acesso** | **20 min** | 🆕 |
| **11** | **Estado do objeto e GC** | **20 min** | 🆕 |
| **12** | **Associação, Agregação, Composição** | **25 min** | 🆕 |

**Próximas (sugestões):**

- Exercício 13: Herança
- Exercício 14: Polimorfismo
- Exercício 15: Interfaces
- Exercício 16: Classes Abstratas
>>>>>>> upstream/main

## Como executar no Windows (PowerShell / CMD)

Os arquivos usam `package`, então a forma mais simples é compilar e executar a partir da **raiz** do repositório.

Exemplo (Exercício 04):

```bat
<<<<<<< HEAD
javac Exercicio04_Vazio\Aluno.java Exercicio04_Vazio\Principal.java
java Exercicio04_Vazio.Principal
=======
javac Java_04_Vazio\Aluno.java Java_04_Vazio\Principal.java
java Java_04_Vazio.Principal
>>>>>>> upstream/main
```

Observação: em **PowerShell antigo (5.x)** o operador `&&` pode não funcionar. Prefira rodar em duas linhas (como acima).

## Como responder os exercícios

<<<<<<< HEAD
- Leia o enunciado `Exercicio_XX_*.md`.
- Rode o `Principal.java`.
- Copie a saída do console (quando solicitado).
- Responda as perguntas no `Resposta_Exercicio_XX.md` (ou no seu caderno).
=======
- Leia o enunciado `Java__XX_*.md`.
- Rode o `Principal.java`.
- Copie a saída do console (quando solicitado).
- Responda as perguntas no `Resposta_Java__XX.md` (ou no seu caderno).
>>>>>>> upstream/main

## Fork: recebendo atualizações do repositório original (upstream)

Se você fez um fork e quer trazer atualizações do repositório original (upstream) para o seu fork (origin):

### 1) Configurar o upstream (uma vez)

```bat
git remote add upstream URL_DO_REPOSITORIO_ORIGINAL.git
git remote -v
```

### 2) Buscar atualizações

```bat
git fetch upstream
```

### 3) Mesclar na sua branch principal

```bat
git checkout main
git merge upstream/main
```

Se houver conflitos, resolva-os e finalize o merge.

### 4) Enviar para o seu fork (origin)

```bat
git push origin main
```

### Alternativa (interface do GitHub)

No seu fork, use **Sync fork** → **Update branch** quando houver atualizações.
