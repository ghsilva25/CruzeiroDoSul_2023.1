import java.util.Scanner;
public class CursoPrincipal {

    public static void main(String [] args) {
        Scanner x = new Scanner (System.in);


        Curso curso1 = new Curso();

        curso1.CursoCadastro();
        System.out.println(" Curso 1 ");

        curso1.DadosImprimidos();

        System.out.println("Curso 1: método calculaTotalDestaMensalidade: " );
        System.out.println("O valor total desta mensalidade é de: " + curso1.calculaTotalMensalidade());

        System.out.println("Informe o nome do curso: ");
        String n = x.next();

        System.out.println("Informe a quantidade de alunos: ");
        int a = x.nextInt();

        System.out.println("Informe o número da turma: ");
        String y  = x.next();

        System.out.println("Informe o valor da mensalidade: ");
        float m = x.nextFloat();

        Curso curso2 = new Curso (n, a, y, m);

        curso2.CursoCadastro();
        System.out.println(" Curso 2 ");

        curso2.DadosImprimidos();

        System.out.println("Curso 2: método calculaTotalDaMensalidade() ");
        System.out.println("O valor total da mensalidade é: R$ " + curso2.calculaTotalMensalidade());



    }


}
