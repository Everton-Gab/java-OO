package Java_10_Modificadores;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 10 - Modificadores de Acesso ===\n");

        Aluno aluno1 = new Aluno("Joao", 18, "TI-01");

        // ---- ACESSO A ATRIBUTOS ----
        System.out.println("--- Acesso a atributos ---");

        // public -> permitido de qualquer lugar
        System.out.println("nome  (public)    : " + aluno1.nome);

        // private -> PROIBIDO acessar diretamente de fora da classe
        // aluno1.idade = 19;  <- isso causaria ERRO de compilacao
        // Usamos o getter (metodo publico) para acessar
        System.out.println("idade (via getter) : " + aluno1.getIdade());

        // protected -> acessivel no mesmo pacote
        System.out.println("turma (protected) : " + aluno1.turma);

        // package-private -> acessivel no mesmo pacote
        System.out.println("escola (sem mod.) : " + aluno1.escola);

        // ---- CHAMANDO METODOS ----
        System.out.println("\n--- Chamando metodos publicos ---");
        aluno1.apresentar();
        aluno1.exibirCodigo();

        // aluno1.gerarCodigo()  <- ERRO: metodo private, nao acessivel aqui

        // ---- MODIFICANDO ATRIBUTOS ----
        System.out.println("\n--- Modificando atributos ---");
        aluno1.nome = "Joao Silva"; // OK: public
        // aluno1.idade = 25;      <- ERRO: private
        System.out.println("Nome alterado: " + aluno1.nome);

        // ---- RESUMO ----
        System.out.println("\n=== Resumo dos Modificadores ===");
        System.out.println("public    -> visivel para todos");
        System.out.println("private   -> visivel so dentro da propria classe");
        System.out.println("protected -> visivel na classe e em subclasses");
        System.out.println("(nenhum)  -> visivel apenas no mesmo pacote");

    }

}
