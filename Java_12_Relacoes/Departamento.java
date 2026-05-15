package Java_12_Relacoes;

// Departamento: criado e gerenciado pela Escola
// Relacao com Escola: COMPOSICAO (departamento nao existe sem a escola)
public class Departamento {

    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }

    public void exibir() {
        System.out.println("  Departamento: " + nome);
    }

}
