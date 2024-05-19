public class Instancia {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Gabriel";
        cliente1.idade = 24;
        cliente1.rg = "00.000.000-0";
        cliente1.cep = "00000-000";
        cliente1.sexo = "Masculino";
        cliente1.telefone = "(11) 90000-0000";
        System.out.println("Nome: " + cliente1.nome + "\n" + "Idade: " + cliente1.idade + "\n" +  "RG: " + cliente1.rg + "\n" + "CEP: " + cliente1.cep + "\n" + "Sexo: " + cliente1.sexo + "\n" + "Telefone: " + cliente1.telefone);

        Curso curso1 = new Curso();
        curso1.nomeDoCurso = "Ciencia da Computaçao";
        curso1.periodo = "Noturno";
        curso1.unidade = "Guarulhos-SP";
        curso1.numeroDoEstabelecimento = 200;
        curso1.andar = 2;
        curso1.quantidadeDeMaterias = 4;
        curso1.nomeDoInstrutor = "Jonathan";
        curso1.sala = 203;
        System.out.println("Nome do curso: " + curso1.nomeDoCurso + "\n" + "Periodo: " + curso1.periodo + "\n" + "Unidade: " + curso1.unidade + "\n" + "Numero do estabelecimento: " + curso1.numeroDoEstabelecimento + "\n" + "Andar: " + curso1.andar + "\n" + "Quantidade de materias: " + curso1.quantidadeDeMaterias + "\n" + "Nome do instrutor: " + curso1.nomeDoInstrutor + "\n" + "Numero da sala: " + curso1.sala);
    }
}