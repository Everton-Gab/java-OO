Com certeza! Vamos destrinchar os conceitos sobre **Métodos**. Se os atributos são o que a classe *sabe* sobre si mesma (os dados), os métodos são o que a classe *sabe fazer* (as ações e comportamentos).

Como de costume, os espaços para as saídas do terminal estão marcados para você completar com os resultados da sua máquina, e abaixo estão as respostas teóricas prontas (incluindo a Atividade 2 adaptada em formato de lista simples e direta para o Word, conforme você preferiu no exercício anterior):

---

## Atividade 1 - Execute e observe

**O que fazer:** *[Execute o arquivo Principal.java original e cole a saída do terminal aqui]*

---

## Atividade 2 - Análise dos Métodos (Formato para Word)

### **1. apresentar()**

* **Imprime algo?** Sim
* **Retorna valor?** Não
* **Recebe parâmetro?** Não

### **2. fazer(nota)**

* **Imprime algo?** Sim
* **Retorna valor?** Não
* **Recebe parâmetro?** Sim

### **3. calcularAnoNascimento()**

* **Imprime algo?** Não
* **Retorna valor?** Sim
* **Recebe parâmetro?** Não

### **4. obterCategoria()**

* **Imprime algo?** Não
* **Retorna valor?** Sim
* **Recebe parâmetro?** Não

### **5. multiplicarIdade(mult)**

* **Imprime algo?** Não
* **Retorna valor?** Sim
* **Recebe parâmetro?** Sim

### **6. exibirInfo()**

* **Imprime algo?** Sim
* **Retorna valor?** Não
* **Recebe parâmetro?** Não

---

## Atividade 3 - Perguntas

### Respostas:

* **O que é um método em Java?**
R. Um método é um bloco de código reutilizável dentro de uma classe que executa uma ação ou um conjunto de instruções específicas. É o comportamento do objeto.
* **Qual é a diferença entre um atributo e um método?**
R. O **atributo** representa uma característica ou dado guardado pelo objeto (ex: nome, idade). O **método** representa uma ação que o objeto consegue realizar usando ou não esses dados (ex: correr, calcular).
* **O que significa void em um método?**
R. Significa "vazio". Ele avisa ao compilador Java que o método vai executar suas instruções (pode até imprimir coisas na tela), mas **não vai devolver nenhum valor ou dado** para quem o chamou.
* **Quando usar um método void vs um método com retorno?**
R. Usamos **void** quando a intenção é apenas executar uma ação direta (como exibir um texto ou salvar um dado). Usamos um método **com retorno** quando precisamos que o método faça um cálculo ou processamento e nos devolva esse resultado para ser guardado em uma variável ou usado em outra lógica.
* **Como você chama um método?**
R. Usando a variável que contém o objeto, seguida pelo operador ponto ( . ) e o nome do método com parênteses. Exemplo: objetoAluno.apresentar();.
* **A classe Aluno tem quantos métodos? Liste todos.**
R. Possui **6 métodos**: apresentar(), fazer(), calcularAnoNascimento(), obterCategoria(), multiplicarIdade() e exibirInfo().
* **Qual é o método mais útil na prática? Por que?**
R. *[Resposta Sugerida]* exibirInfo() ou métodos com retorno como calcularAnoNascimento(). Na prática, métodos que processam dados internos e devolvem respostas prontas evitam que a classe principal precise conhecer os detalhes das fórmulas e cálculos do objeto.

---

## Atividade 4 - Modificando o código

**O que fazer:** *[Cole aqui a nova linha de saída do seu terminal exibindo o cálculo da idade em dias do aluno]*

---

## Atividade 5 - Reflexão final

### Respostas:

* **Um método pode ter múltiplos parâmetros?**
R. **Sim, perfeitamente.** Um método pode receber quantos parâmetros forem necessários (separados por vírgula dentro dos parênteses), desde que cada um tenha seu tipo e nome definidos. Ex: public void atualizarDados(String novoNome, int novaIdade).
* **Qual é a vantagem de usar métodos em vez de deixar tudo no main?**
R. Organização, reutilização de código e facilidade de manutenção. Se uma lógica precisar mudar, você altera apenas uma vez dentro do método, em vez de caçar e alterar essa lógica espalhada em vários lugares do main.
* **Se você tivesse 1000 alunos, seria mais fácil usar métodos ou repetir código?**
R. Seria infinitamente mais fácil usar **métodos**. Bastaria chamar o método para cada um dos 1000 alunos. Repetir código geraria milhares de linhas idênticas e tornaria o programa impossível de gerenciar.
* **Qual método você criaria para a classe Aluno que seria útil na prática?**
R. *[Resposta Sugerida]* Um método chamado verificarAprovacao(double mediaMinima) que avalia as notas do aluno e devolve um valor booleano (true ou false) dizendo se ele passou de ano ou não.