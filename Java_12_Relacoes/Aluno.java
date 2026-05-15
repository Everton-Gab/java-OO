package Java_12_Relacoes;

// Aluno: existe independente de qualquer escola
// Relacao com Escola: AGREGACAO (aluno sobrevive mesmo se a escola for extinta)
public class Aluno {

    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() { return nome; }
    public int getMatricula() { return matricula; }

    public void exibir() {
        System.out.println("  Aluno: " + nome + " (matricula: " + matricula + ")");
    }

}
