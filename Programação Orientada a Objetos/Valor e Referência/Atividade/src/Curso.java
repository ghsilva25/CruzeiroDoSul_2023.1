import java.util.Scanner;

public class Curso {

    public String nome;

    public int quantidadeDeAlunos;

    public String turma;

    public float mensalidade;

    public Curso() {


    }

    public Curso (String n, int q, String t, float m) {

        nome = n;
        quantidadeDeAlunos = q;
        turma = t;
        mensalidade = m;


    }

    public void CursoCadastro() {
        Scanner ScannerCadastroDoCurso = new Scanner (System.in);

        if (nome == null && turma == null && quantidadeDeAlunos == 0 && mensalidade == 0) {
            System.out.println("\n" + "Informe o nome do curso: ");
            nome = ScannerCadastroDoCurso.next();
            System.out.println("Informe a quantidade dos alunos deste curso selecionado: ");
            quantidadeDeAlunos = ScannerCadastroDoCurso.nextInt();
            System.out.println("Informe o número desta turma: ");
            turma = ScannerCadastroDoCurso.next();
            System.out.println("Informe a mensalidade: ");
            mensalidade = ScannerCadastroDoCurso.nextFloat();
            System.out.println("Este curso foi cadastrado com sucesso!");

        } else {
        }

    }

    public void DadosImprimidos() {

        System.out.print("O nome do curso é: " + nome + "\n");
        System.out.print("A quantidade de alunos é: " + quantidadeDeAlunos + "\n");
        System.out.print("O número do curso é: " + turma + "\n");
        System.out.print("O valor da mensalidade é: R$ " + mensalidade + "\n");

    }
    public float calculaTotalMensalidade() { return mensalidade; }

}
