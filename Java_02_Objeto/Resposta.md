Com certeza! Vamos continuar nessa jornada. Agora que você já domina o conceito de "molde" (Classe), este exercício foca em como damos vida a esse molde, criando os **Objetos (Instâncias)** na memória do computador.

Assim como no anterior, deixei os espaços textuais das saídas de terminal sinalizados para você preencher com os resultados da sua máquina, acompanhados das respostas teóricas prontas abaixo:

---

## Atividade 1 - Executando o código original

**O que fazer:** *[Execute o arquivo Principal.java original e cole a saída do terminal aqui]*

### Respostas:

* **O que é um objeto?**
R. Um objeto é a representação física e real de uma classe. Se a classe é a planta de uma casa, o objeto é a casa construída na memória do computador, pronta para armazenar dados e executar ações.
* **O que a palavra new faz no código?**
R. A palavra new é o operador responsável por **instanciar** um objeto. Ela diz ao Java: "vá até a memória do computador, reserve um espaço para essa estrutura e crie um objeto novinho baseado nessa classe".
* **O que significa dizer que um objeto é uma instância de uma classe?**
R. Significa que o objeto foi "gerado a partir" daquela classe específica. Ele é um exemplar real nascido daquele molde (por exemplo, "o objetoAluno é uma instância concreta da classe Aluno").

---

## Atividade 2 - Criando mais um objeto

**O que fazer:** *[Java_02_Objeto.Aluno@36baf30c]*

### Respostas:

* **Por que os dois objetos são diferentes?**
R. Porque cada vez que usamos a palavra new, o Java cria um objeto totalmente isolado. Mesmo que eles venham do mesmo molde (Aluno), eles são duas entidades independentes no sistema.
* **O que significa cada objeto ocupar um espaço diferente na memória?**
R. Significa que eles possuem endereços de memória distintos. Alterar as informações ou dados de um objeto jamais afetará ou modificará os dados do outro.

---

## Atividade 3 - Preenchendo atributos

**O que fazer:** *[Cole aqui a saída do terminal que agora exibe os dados "Carlos" e "20"]*

### Respostas:

* **O que significa preencher um atributo?**
R. Significa atribuir um valor real e específico a uma variável do objeto. É dar uma característica concreta àquela instância através do operador de atribuição (=).
* **O que os atributos nome e idade representam no objeto?**
R. Representam o **estado atual** daquele objeto. Eles dizem quem aquele aluno é especificamente no momento (um aluno que se chama Carlos e tem 20 anos).

---

## Atividade 4 - Alterando os valores

**O que fazer:** *[Cole aqui a nova saída do terminal mostrando que os dados mudaram para "Maria" e "18"]*

### Respostas:

* **Por que foi possível alterar os valores do objeto?**
R. Foi possível porque os atributos foram declarados com o modificador public, o que permite que outras classes (como a Principal) acessem e modifiquem seus valores diretamente a qualquer momento.
* **O objeto continua sendo o mesmo?**
R. **Sim, o objeto é exatamente o mesmo.** Ele continua no mesmo lugar da memória, o que mudou foram apenas as informações internas guardadas dentro dele (o seu "estado"). É como uma pessoa que mudou de nome e cortou o cabelo: ela mudou de aparência, mas continua sendo a mesma pessoa.

---

## Atividade 5 - Criando outro aluno

**O que fazer:** *[Cole aqui a saída do terminal que exibe os dados do Pedro (22)]*

### Respostas:

* **O que diferencia objetoAluno de objetoAluno2?**
R. Eles se diferenciam por serem instâncias separadas na memória e, consequentemente, guardarem informações (estados) totalmente diferentes: um guarda os dados da Maria e o outro guarda os dados do Pedro.
* **Por que os dois podem ter valores diferentes?**
R. Porque as caixinhas de memória deles são independentes. O molde Aluno diz que *todo* aluno deve ter nome e idade, mas *cada* objeto gerado tem suas próprias caixinhas para preencher como quiser.

---

## Atividade 6 - Observando o objeto na memória

**O que fazer:** *[Cole aqui as duas linhas de saída do terminal que mostram os códigos de referência na memória, ex: NomeDaClasse@15db9742 e NomeDaClasse@6d06d69c]*

### Respostas:

* **Por que aparecem códigos diferentes?**
R. Porque esses códigos representam a **referência de memória** (um identificador baseado no endereço/Hashcode) de onde cada objeto está fisicamente guardado. Como são dois objetos distintos, seus endereços precisam ser diferentes.
* **O que isso representa na memória?**
R. Representa o local exato onde o Java alocou os recursos para cada um na memória *Heap* do computador. Mostra visualmente que o Java enxerga objetoAluno e objetoAluno2 como duas coisas totalmente separadas.

---

## Atividade 7 - Explicação final

### Respostas:

* **O que é um objeto em Java?**
R. É uma instância concreta de uma classe, criada dinamicamente na memória do computador usando o operador new, capaz de armazenar dados em seus atributos.
* **Qual é a diferença entre classe e objeto?**
R. A **classe** é o molde conceitual, a teoria, o código escrito no arquivo .java que diz como as coisas devem ser. O **objeto** é a prática, a estrutura que ganhou vida na memória e que realmente armazena os dados durante a execução do programa.
* **O que faz a palavra new?**
R. Ela gerencia a memória: aloca espaço físico na memória RAM, cria uma nova instância da classe especificada e retorna a referência (o endereço) desse novo objeto.
* **O que são atributos?**
R. São as variáveis que definem as características ou propriedades de uma classe/objeto. São os campos que armazenam o estado do objeto.
* **O que você aprendeu neste exercício?**
R. *[Dica para sua resposta pessoal]:* Aprendi a instanciar objetos usando a palavra new e compreendi que múltiplos objetos criados a partir de uma mesma classe são completamente independentes na memória, permitindo que cada um armazene seus próprios valores em seus atributos de forma isolada.