package Exercicio02_Objeto;

public class Principal {

    public static void main(String[] args) {

        // OBJETO é o "Aluno de verdade" criado a partir do molde (classe).
        // A variável 'objetoAluno' vai guardar a referência para esse objeto.
        Aluno objetoAluno = new Aluno();

        System.out.println("Exercicio 02 - Objeto criado com sucesso.");
        System.out.println("Esse objetoAluno é um Aluno real (instancia) criado a partir da classe Aluno.");
        System.out.println(objetoAluno);
        objetoAluno.nome = "Teste";
        objetoAluno.idade = 15;
        System.out.println("Objeto criado: " + objetoAluno);
     
        
        Aluno objetoAluno2 = new Aluno();

        System.out.println(objetoAluno2);

        objetoAluno.nome = "carlos";
        objetoAluno.idade = 20;

        System.out.println(objetoAluno.nome);
        System.out.println(objetoAluno.idade);

        
        objetoAluno2.nome = "pedro";
        objetoAluno2.idade = 22;

        System.out.println(objetoAluno2.nome);
        System.out.println(objetoAluno2.idade);

        System.out.println(objetoAluno);
        System.out.println(objetoAluno2);
    }

    
}