public class Curso {
    String nomeDoCurso;
    String periodo;
    int numeroDoEstabelecimento;
    String unidade;
    int quantidadeDeMaterias;
    int sala;
    String nomeDoInstrutor;
    int andar;

    public Curso() {
    }

    public Curso(String nomeDoCurso, String periodo, int numeroDoEstabelecimento, String unidade, int quantidadeDeMaterias, int sala, String nomeDoInstrutor, int andar) {
        this.nomeDoCurso = nomeDoCurso;
        this.periodo = periodo;
        this.numeroDoEstabelecimento = numeroDoEstabelecimento;
        this.unidade = unidade;
        this.quantidadeDeMaterias = quantidadeDeMaterias;
        this.sala = sala;
        this.nomeDoInstrutor = nomeDoInstrutor;
        this.andar = andar;
    }
}