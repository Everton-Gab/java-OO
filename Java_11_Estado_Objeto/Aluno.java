package Java_11_Estado_Objeto;

import java.util.Random;

public class Aluno {

    // Atributos: definem o ESTADO do objeto
    private String nome;
    private int idade;
    private double codigoIdentificador;
    private Random aleatorio;

    // Construtor com parametros
    // A instrucao "new" sempre e seguida da chamada ao construtor
    public Aluno(String nome, int idade) {
        this.aleatorio = new Random();
        this.nome = nome;
        this.idade = idade;
        // Cada objeto gera seu proprio codigo unico automaticamente
        this.codigoIdentificador = aleatorio.nextDouble();
    }

    // COMPORTAMENTOS (metodos) que definem o que o objeto faz

    public void definirNome(String nome) {
        this.nome = nome;
    }

    public void definirIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getCodigoIdentificador() {
        return codigoIdentificador;
    }

    // Exibe o estado atual completo do objeto
    public void exibirEstado() {
        System.out.println("=== Estado do Objeto Aluno ===");
        System.out.println("Nome : " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Cod. : %.6f%n", codigoIdentificador);
        System.out.println("==============================");
    }

}
