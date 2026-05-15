package Java_11_Estado_Objeto;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 11 - Estado do Objeto ===\n");

        // --- ESTADO INICIAL ---
        System.out.println("--- Estado inicial de aluno1 ---");
        Aluno aluno1 = new Aluno("Maria", 20);
        aluno1.exibirEstado();

        // --- MUDANDO O ESTADO ---
        System.out.println("\n--- Alterando o estado (definirNome) ---");
        aluno1.definirNome("Maria Santos");
        aluno1.definirIdade(21);
        aluno1.exibirEstado();

        // --- DOIS OBJETOS, DOIS ESTADOS INDEPENDENTES ---
        System.out.println("\n--- Dois objetos: estados independentes ---");
        Aluno aluno2 = new Aluno("Carlos", 22);
        System.out.println("aluno1 nome : " + aluno1.getNome());
        System.out.println("aluno2 nome : " + aluno2.getNome());
        System.out.printf("aluno1 cod. : %.6f%n", aluno1.getCodigoIdentificador());
        System.out.printf("aluno2 cod. : %.6f%n", aluno2.getCodigoIdentificador());
        System.out.println("(Codigos diferentes: cada objeto tem seu proprio estado)");

        // --- GARBAGE COLLECTION ---
        System.out.println("\n--- Ciclo de vida: Garbage Collection ---");
        Aluno temporario = new Aluno("Temporario", 15);
        System.out.println("Objeto criado  : " + temporario.getNome());

        temporario = null; // remove a referencia -> objeto elegivel para GC
        System.out.println("Referencia removida (temporario = null)");
        System.out.println("O objeto nao tem mais referencia -> pode ser destruido pela JVM.");

        System.gc(); // solicita ao JVM (nao e uma ordem, e uma sugestao)
        System.out.println("System.gc() chamado -> JVM decidira quando coletar.");

        // --- CONCLUSAO ---
        System.out.println("\n=== Conclusao ===");
        System.out.println("Estado      = valores dos atributos no momento.");
        System.out.println("Comportamento = acoes que o objeto realiza (metodos).");
        System.out.println("GC          = JVM destroi objetos sem referencia automaticamente.");

    }

}
