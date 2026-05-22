Com certeza! Vamos dar sequência e consolidar o conceito de **leitura de atributos**. Nos exercícios anteriores, você focou bastante em *escrever* (preencher) os dados. Agora, o foco é entender como o Java *recupera* esses dados da memória para utilizá-los no programa.

Como de costume, os espaços para as saídas do terminal estão sinalizados para você preencher com os resultados da sua máquina, acompanhados das respostas teóricas prontas:

---

## Atividade 1 - Executando o código base

**O que fazer:** *[Execute o arquivo Principal.java original e cole a saída do terminal aqui]*

### Respostas:

* **O que significa ler um atributo?**
R. Significa consultar, recuperar ou acessar o valor que está guardado dentro daquela variável do objeto na memória, para podermos exibi-lo no console, usá-lo em um cálculo ou passá-lo para outra parte do programa.
* **Qual atributo foi lido em cada println?**
R. No primeiro println foi lido o atributo nome, e no segundo println foi lido o atributo idade.

---

## Atividade 2 - Alterando valores e lendo novamente

**O que fazer:** *[Cole aqui a nova saída do seu terminal exibindo "Ana" e "17"]*

### Respostas:

* **O que mudou na leitura dos atributos?**
R. Os valores exibidos no terminal mudaram. Em vez de exibir os dados do aluno anterior, o programa agora imprimiu os novos valores atribuídos.
* **Por que a saída mudou?**
R. Porque a leitura sempre reflete o **estado atual** do objeto na memória. Como os valores guardados nas caixinhas de nome e idade foram substituídos por "Ana" e "17", o comando de leitura buscou e exibiu essas novas informações.

---

## Atividade 3 - Lendo em forma de texto

**O que fazer:** *[Cole aqui a saída formatada do terminal, mostrando "Aluno: Ana" e "Idade: 17"]*

### Respostas:

* **Qual é a diferença entre imprimir apenas o valor e imprimir com texto?**
R. A diferença está na experiência do usuário e na clareza da informação (chamada de concatenação). Imprimir apenas o valor joga o dado puro na tela; imprimir com texto contextualiza o que aquele dado significa.
* **O conteúdo lido mudou?**
R. **Não.** O conteúdo extraído do objeto continua exatamente o mesmo ("Ana" e 17). O que mudou foi apenas a forma como nós formatamos e exibimos essa informação para quem está lendo o terminal.

---

## Atividade 4 - Lendo antes de preencher

**O que fazer:** *[Cole aqui a saída do terminal que mostra primeiro "null" e "0", e depois mostra "Lucas" e "21"]*

### Respostas:

* **Quais valores aparecem antes de preencher?**
R. Aparecem os valores **null** para o nome e **0** para a idade.
* **Por que esses valores aparecem?**
R. Porque são os **valores padrão (default)** que o Java atribui automaticamente na criação do objeto através do new, garantindo que nenhum atributo de classe comece com lixo de memória.

---

## Atividade 5 - Lendo valores de mais de um objeto

**O que fazer:** *[Cole aqui a saída que mostra os dados da Ana seguidos pelos dados do Lucas]*

### Respostas:

* **Como a leitura confirma que existem objetos diferentes?**
R. Ela confirma isso porque, ao chamarmos os mesmos atributos (nome e idade) usando variáveis diferentes (objetoAluno e aluno2), o Java nos devolveu dados totalmente distintos. Isso prova que eles estão buscando informações em lugares separados da memória.
* **O que aconteceria se ambos os objetos fossem o mesmo?**
R. Se fossem o mesmo objeto (ou seja, se as duas variáveis apontassem para a mesma referência), a leitura exibiria exatamente os mesmos dados repetidos duas vezes. Qualquer alteração feita em uma variável mudaria o valor da outra instantaneamente.

---

## Atividade 6 - Explicação final

### Respostas:

* **O que é ler um atributo em Java?**
R. É o ato de buscar e capturar o valor armazenado em uma propriedade específica de um objeto para utilizá-lo no fluxo de execução do código.
* **Qual a diferença entre preencher e ler?**
R. **Preencher (Escrita)** é colocar um dado para dentro do objeto utilizando o operador =. **Ler (Leitura)** é tirar o dado de dentro do objeto para usá-lo (por exemplo, dentro de um System.out.println).
* **O que significa acessar objeto.atributo?**
R. Significa usar o operador ponto para direcionar o Java a entrar no endereço de memória daquele objeto específico e localizar a variável informada em atributo.
* **O que você aprendeu neste exercício?**
R. *[Dica para sua resposta pessoal]:* Aprendi que a leitura de dados reflete fielmente o estado do objeto no instante exato da execução. Também compreendi como usar a concatenação para deixar as saídas mais amigáveis e como a leitura de variáveis diferentes nos prova o isolamento de múltiplos objetos criados na memória.