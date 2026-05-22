Com certeza! Vamos entrar em um dos conceitos mais elegantes do Java: os **Construtores**. Eles resolvem aquele "trabalhão" de ter que criar o objeto e depois ficar preenchendo linha por linha manualmente, permitindo que a gente crie o objeto já com os dados prontos.

Aqui estão as respostas teóricas prontas e a tabela estruturada para o seu exercício. Lembre-se de preencher os campos de terminal com as saídas da sua máquina:

---

## Atividade 1 - Execute e observe

**O que fazer:** 
Criado: aluno1 = new Aluno();
Nome: null
Idade: 0

Depois de preencher:
Nome: João Silva
Idade: 18

---

## Atividade 2 - Entendendo construtores

### Respostas:

* **O que é um construtor?**
R. Um construtor é um bloco de código especial da classe, muito parecido com um método, cujo objetivo principal é **inicializar o objeto** e preparar seus atributos com valores iniciais no momento em que ele nasce. Ele obrigatoriamente tem o mesmo nome da classe e não possui tipo de retorno. 
* **Quando ele é chamado automaticamente?**
R. Ele é chamado automaticamente no exato momento em que usamos a palavra-chave new para criar uma nova instância daquela classe.

ele chama automaticamente no exato momento que usamos a palavra-chave new para criar uma nova instancia daquela classe
---

## Atividade 3 - Comparando os jeitos

Jeito 1
Código: Aluno aluno1 = new Aluno(); seguido de preenchimento manual.

O que acontece: Cria o objeto totalmente vazio (null e 0) e depois adiciona os valores linha por linha.

Construtor usado: Construtor Vazio.

Jeito 2
Código: Aluno aluno2 = new Aluno("Maria", 20);

O que acontece: Cria o objeto e já preenche o nome e a idade diretamente na mesma linha.

Construtor usado: Construtor com Parâmetros.

Jeito 3
Código: Aluno aluno3 = new Aluno();

O que acontece: Cria outro objeto vazio e isolado na memória, aguardando dados mais tarde.

Construtor usado: Construtor Vazio.

Jeito 4
Código: Aluno aluno4 = new Aluno("Ana", 21);

O que acontece: Cria e inicializa instantaneamente um novo objeto com seus próprios dados em uma única linha.

Construtor usado: Construtor com Parâmetros.
---

## Atividade 4 - Entendendo this

### Respostas:

* **O que significa this.nome nessa linha?**
R. Significa o atributo nome que pertence **àquela instância específica do objeto** que está sendo criada. O this aponta para o próprio objeto atual.
* **O que significa nome (sem this) nessa linha?**
R. Significa o **parâmetro** que foi recebido entre os parênteses do construtor, ou seja, o valor que foi enviado de fora para dentro da classe (o argumento).
* **Por que sem this o Java ficaria confuso?**
R. Porque aconteceria o que chamamos de *sombreamento de variável* (shadowing). Como o atributo e o parâmetro têm exatamente o mesmo nome (nome), escrever nome = nome; faria o Java achar que você está atribuindo o parâmetro a ele mesmo, sem alterar o valor real do objeto. O this serve para desempatar e diferenciar o atributo do parâmetro.

---

## Atividade 5 - Perguntas

### Respostas:

* **O que é um construtor?**
R. É uma estrutura especial da classe usada para criar e inicializar os objetos com dados padrão ou específicos no momento de sua criação.
* **O que faz a palavra new?**
R. Aloca espaço na memória RAM para o objeto e dispara a execução do construtor da classe.
* **Qual é a diferença entre new Aluno() e new Aluno("Joao", 18)?**
R. O new Aluno() chama o construtor vazio, criando o objeto com valores zerados (null e 0). Já o new Aluno("Joao", 18) chama o construtor com parâmetros, criando o objeto já com o nome "Joao" e a idade 18 armazenados.
* **O que significa this no construtor?**
R. É uma palavra reservada que serve como referência para o próprio objeto que está sendo manipulado ou construído naquele instante.
* **Por que é vantajoso ter um construtor com parâmetros?**
R. Porque ele economiza linhas de código, evita o esquecimento de preencher dados obrigatórios e torna a criação do objeto muito mais rápida, limpa e segura em uma única linha.
* **A classe Aluno tem quantos construtores? Liste cada um.**
R. Possui **2 construtores**:
1. O construtor vazio/padrão: public Aluno() { }
2. O construtor parametrizado: public Aluno(String nome, int idade) { ... }



---

## Atividade 6 - Modificando o código

**O que fazer:** *[Cole aqui a nova saída completa do seu terminal após fazer as alterações e adições no arquivo Principal.java]*

---

## Atividade 7 - Reflexão final

### Respostas:

* **Qual jeito você prefere: construtor vazio ou com parâmetros? Por que?**
R. *[Resposta Sugerida]* Prefiro o **construtor com parâmetros**, porque ele torna o código muito mais enxuto, legível e garante que o objeto nasça pronto para uso, sem o risco de esquecermos de preencher algum dado importante.
* **Se precisasse criar 1000 alunos, qual seria mais prático?**
R. Com certeza o **construtor com parâmetros**. Em vez de escrever 3000 linhas de código (3 linhas para cada aluno se feito manualmente), usaríamos apenas 1000 linhas (1 linha por aluno dentro de um laço de repetição, por exemplo).
* **É possível ter os dois construtores na mesma classe? Explique.**
R. **Sim, perfeitamente possível.** Isso acontece graças a um conceito chamado **Sobrecarga de Métodos/Construtores** (Overloading). O Java permite que a classe tenha múltiplos construtores, desde que a lista e os tipos de parâmetros de cada um sejam diferentes para que o compilador saiba exatamente qual deles deve chamar.