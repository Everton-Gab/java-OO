Com certeza! Vamos estruturar as respostas teóricas desse exercício de forma clara e direta para te ajudar a consolidar esses conceitos fundamentais de Orientação a Objetos em Java.

Como as saídas de terminal e os códigos colados dependem do que você executou na sua máquina, deixei esses espaços sinalizados para você preencher com os seus resultados, combinando com as explicações teóricas abaixo:

---

## Atividade 1 - Executando o código

**O que fazer:** *[Execute o arquivo Principal.java e cole a saída do seu terminal aqui]*

### Respostas:

* **O que é uma classe?**
R. Uma classe é um **molde, modelo ou blueprint** que define as características e comportamentos que os objetos criados a partir dela terão. Ela não é o objeto em si, mas a receita de como criá-lo.
* **O que representa o arquivo Aluno.java?**
R. Representa a estrutura de uma classe chamada Aluno. É o molde abstrato que define quais dados (como nome e idade) todo aluno do sistema terá, mas ainda não representa nenhum aluno real/específico.
* **Por que o arquivo Principal.java existe?**
R. Ele existe porque o Java precisa de um ponto de partida para rodar o sistema. É nele que fica o método main, que avisa ao compilador: "comece a executar o programa por aqui". É onde os moldes (classes) ganham vida.

---

## Atividade 2 - Alterando a mensagem

**O que fazer:** *[Cole aqui a nova saída do seu terminal após alterar as frases dentro do método System.out.println]*

---

## Atividade 3 - Criando uma nova classe

**O que fazer:** *[Cole aqui o código do arquivo Professor.java que você criou]*

### Respostas:

* **O que essa nova classe representa?**
R. Representa o molde para a criação de objetos do tipo Professor dentro do sistema.
* **Quais são os atributos dela?**
R. Os atributos são nome (do tipo String) e disciplina (do tipo String).

---

## Atividade 4 - Adicionando um atributo

**O que fazer:** *[Cole aqui o código atualizado do seu Aluno.java com a inclusão da turma]*

### Respostas:

* **O que é um atributo?**
R. Um atributo é uma variável declarada dentro de uma classe que representa as **características ou propriedades** que o objeto terá. É o que a classe "sabe" sobre si mesma.
* **O que o atributo turma representa?**
R. Representa o dado específico da identificação da turma (como "3º Ano A" ou "Turma 101") à qual aquele aluno pertence.

---

## Atividade 5 - Criando erro proposital

**O que fazer:** *[Cole aqui a mensagem de erro que apareceu no seu terminal, que provavelmente conterá algo como error: ';' expected]*

### Respostas:

* **O que faltava no código?**
R. Faltava o caractere de ponto e vírgula ( ; ) no final da linha de declaração do atributo nome.
* **Por que o Java não aceitou?**
R. Porque o ponto e vírgula é o terminador de instruções obrigatório na sintaxe do Java. Sem ele, o compilador não consegue entender onde uma instrução termina e a outra começa, gerando um erro de compilação.

---

## Atividade 6 - Explicação final

### Respostas:

* **O que é uma classe?**
R. É a estrutura abstrata, o modelo ou "planta baixa" que define os atributos (dados) e métodos (comportamentos) que os objetos gerados a partir dela possuirão.
* **O que são atributos?**
R. São as características ou variáveis de uma classe que armazenam os estados e as informações de um objeto.
* **Por que Principal.java possui o método main?**
R. Porque o método main é o ponto de entrada (entry point) padrão do Java. Sem ele, a Máquina Virtual Java (JVM) não sabe por onde começar a execução do código do projeto.
* **Por que Aluno.java não executa sozinho?**
R. Porque ele é apenas uma classe de modelo (entidade). Ele define a estrutura de um aluno, mas não possui a lógica de inicialização ou o método main para dar ordens de execução ao sistema.
* **O que você aprendeu neste exercício?**
R. *[Dica para sua resposta pessoal]:* Aprendi a diferença entre a classe que serve como molde (Aluno, Professor) e a classe que executa o programa (Principal). Também entendi a importância da sintaxe rígida do Java (como o uso do ponto e vírgula) e como os atributos definem as propriedades de um modelo.