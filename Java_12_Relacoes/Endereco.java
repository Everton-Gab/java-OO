package Java_12_Relacoes;

// Endereco: classe simples usada por Escola
// Relacao com Escola: COMPOSICAO (endereco nao existe sem a escola)
public class Endereco {

    private String rua;
    private String cidade;
    private String cep;

    public Endereco(String rua, String cidade, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getRua() { return rua; }
    public String getCidade() { return cidade; }
    public String getCep() { return cep; }

    public void exibir() {
        System.out.println("  Endereco: " + rua + ", " + cidade + " - CEP: " + cep);
    }

}
