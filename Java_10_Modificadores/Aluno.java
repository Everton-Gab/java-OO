package Java_10_Modificadores;

public class Aluno {

    // public: visivel para todos (qualquer classe, qualquer pacote)
    public String nome;

    // private: visivel SOMENTE dentro desta classe
    private int idade;

    // protected: visivel dentro da classe e em subclasses (veremos em Heranca)
    protected String turma;

    // sem modificador (package-private): visivel apenas dentro do mesmo pacote
    String escola;

    public Aluno(String nome, int idade, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
        this.escola = "Escola Padrao";
    }

    // Metodo publico: acessivel de qualquer lugar
    public int getIdade() {
        return idade;
    }

    // Metodo privado: so pode ser chamado dentro desta classe
    private String gerarCodigo() {
        return turma + "-" + nome.charAt(0) + idade;
    }

    // Metodo publico que usa o privado internamente
    public void exibirCodigo() {
        System.out.println("Codigo: " + gerarCodigo());
    }

    public void apresentar() {
        System.out.println("Nome: " + nome + " | Turma: " + turma + " | Idade: " + getIdade());
    }

}
