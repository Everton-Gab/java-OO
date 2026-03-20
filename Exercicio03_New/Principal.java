package Exercicio03_New;

public class Principal{

    public static void main(String[] args) {

        // 'new Aluno()' é a parte que CRIA o objeto na memória.
        // Sem o 'new', nenhum objeto real é criado.
        Aluno a1 = new Aluno();

        // Vamos criar um segundo objeto, para mostrar que podemos criar varios.
        Aluno a2 = new Aluno();

        System.out.println("Exercicio 03 - Criamos dois objetos com new.");
        System.out.println("a1 e a2 sao dois alunos diferentes na memoria.");
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();



        System.out.println( "tres objetos foram criados");
        
        
        aluno1.nome = "pedro";
        aluno1.idade = 22;

        aluno2.nome = "carlos";
        aluno2.idade = 22;

        aluno3.nome = "jaoa";
        aluno3.idade = 22;

        System.out.println(aluno1.nome);
        System.out.println(aluno2.nome);
        System.out.println(aluno3.nome);

        System.out.println(aluno1.nome + " - " + aluno1.idade);
        System.out.println(aluno2.nome + " - " + aluno2.idade);
        System.out.println(aluno3.nome + " - " + aluno3.idade);

        System.out.println(aluno1);
        System .out.println(aluno2);
        System .out.println(aluno3);
    }

}