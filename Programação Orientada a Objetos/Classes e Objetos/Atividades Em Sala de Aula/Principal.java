import java.sql.SQLOutput;

public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Andrey Alegre";
        pessoa1.cpf = "123.456.789-10";
        pessoa1.idade = 27;

        Pessoa pessoa2 = new Pessoa("Gabriel", 25, "000.000.000-00");

        System.out.println("\n" + "Nome: " + pessoa1.nome + "\n" + "Idade: " + pessoa1.idade + "\n" + "cpf: " + pessoa1.cpf + "\n");

        System.out.println("Nome: " + pessoa2.nome + "\n" + "Idade: " + pessoa2.idade + "\n" + "cpf: " + pessoa2.cpf);
    }

}
