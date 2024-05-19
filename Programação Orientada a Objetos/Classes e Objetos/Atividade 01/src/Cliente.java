public class Cliente {
    String nome;
    String rg;
    int idade;
    String cep;
    String telefone;
    String sexo;

    public Cliente() {
    }

    public Cliente(String nome, String rg, int idade, String cep, String telefone, String sexo) {
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
        this.cep = cep;
        this.telefone = telefone;
        this.sexo = sexo;
    }
}