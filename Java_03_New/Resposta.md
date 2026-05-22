Com certeza! Vamos fechar essa trilha de conceitos consolidando o entendimento sobre a palavra-chave new e como o Java lida com **múltiplos objetos** de forma simultânea na memória.

Os espaços para as saídas do terminal continuam marcados para você preencher com os resultados da sua máquina, e abaixo estão as respostas teóricas prontas para o seu exercício:

---

## Atividade 1 - Criando o primeiro objeto

**O que fazer:** *[Execute o arquivo Principal.java original e cole a saída do terminal aqui]*

### Respostas:

* **O que é um objeto criado com new?**
R. É uma instância viva e real de uma classe que foi alocada dinamicamente na memória RAM. A palavra new garante que esse objeto ganhe um endereço próprio e exclusivo para guardar suas informações.
* **O que acontece quando executamos Aluno aluno1 = new Aluno();?**
R. O Java faz três coisas: localiza o molde Aluno, reserva um espaço físico na memória para as variáveis dele (nome e idade) e entrega o endereço desse espaço para a variável aluno1 (que passa a "apontar" para esse objeto).

---

## Atividade 2 - Criando vários objetos

**O que fazer:** *[Cole aqui a saída do terminal que exibe a frase "Tres objetos foram criados."]*

### Respostas:

* **Por que foi possível criar três objetos da mesma classe?**
R. Porque uma classe não tem limite de uso. Ela funciona exatamente como uma fôrma de bolo: você pode usar a mesma fôrma para assar quantos bolos individuais quiser.
* **O que significa dizer que todos foram criados a partir do mesmo molde?**
R. Significa que os três objetos (aluno1, aluno2 e aluno3) compartilham exatamente a mesma estrutura de dados (todos possuem os campos nome e idade), embora o conteúdo de cada um seja individual.

---

## Atividade 3 - Preenchendo os dados dos objetos

**O que fazer:** *[Cole aqui a saída do terminal que mostra os nomes "Carlos", "Maria" e "Pedro" em linhas separadas]*

### Respostas:

* **Por que cada objeto possui valores diferentes?**
R. Porque eles são entidades totalmente independentes. Quando você escreve aluno1.nome = "Carlos", você está alterando apenas a gaveta de memória pertencente ao aluno1, deixando as gavetas de aluno2 e aluno3 intocadas.
* **O que isso mostra sobre como os objetos são armazenados na memória?**
R. Mostra que o Java isola completamente os objetos na memória *Heap*. Eles coexistem lado a lado de forma autônoma, sem nenhuma interferência ou comunicação direta entre seus estados.

---

## Atividade 4 - Mostrando todos os dados

**O que fazer:** *[Cole aqui a saída formatada do terminal, exibindo o nome e a idade de cada um deles]*

### Respostas:

* **Por que cada aluno mantém seus próprios dados?**
R. Porque o Java garante o encapsulamento do estado do objeto. Cada variável de referência (aluno1, aluno2, aluno3) aponta para um endereço de memória exclusivo, assegurando que os dados não se misturem.
* **O que aconteceria se todos os objetos compartilhassem os mesmos valores?**
R. O sistema perderia o propósito da Orientação a Objetos. Se todos compartilhassem os mesmos dados, alterar a idade do Carlos para 20 mudaria automaticamente a idade da Maria e do Pedro para 20, impossibilitando a representação de alunos reais do mundo real.

---

## Atividade 5 - Observando as referências na memória

**O que fazer:** *[Cole aqui as três linhas com os códigos de referência de memória diferentes que o Java gerou para os três alunos]*

### Respostas:

* **Por que aparecem códigos diferentes para cada objeto?**
R. Porque cada código representa a identidade única (o endereço baseado no Hashcode) de onde aquele objeto específico foi plantado na memória RAM. Três chamadas de new resultam em três endereços diferentes.
* **O que esses códigos representam na memória?**
R. Representam a referência (o ponteiro) para o local exato onde os dados de cada aluno começam na memória do computador.

---

## Atividade 6 - Explicação final

### Respostas:

* **O que acontece quando criamos vários objetos da mesma classe?**
R. O Java replica a estrutura definida pela classe em diferentes regiões da memória, gerando múltiplos objetos que possuem as mesmas propriedades, mas dados completamente isolados.
* **O que significa cada objeto possuir sua própria referência?**
R. Significa que o sistema consegue diferenciar perfeitamente quem é quem. A referência é o "RG" do objeto na memória, permitindo que o código saiba exatamente qual objeto ler ou modificar.
* **Qual é a relação entre classe e objeto?**
R. A classe é a definição abstrata e estática (o projeto em código), enquanto o objeto é a manifestação prática e dinâmica (a estrutura rodando em memória cheia de dados).
* **O que você aprendeu neste exercício?**
R. *[Dica para sua resposta pessoal]:* Consolidei a ideia de que a palavra new serve para isolar e dar vida a novas instâncias. Entendi perfeitamente como o Java gerencia a memória para múltiplos objetos vindos de um mesmo molde, permitindo que sistemas guardem centenas de registros diferentes usando a mesma classe estrutural.