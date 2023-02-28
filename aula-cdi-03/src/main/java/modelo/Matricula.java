package modelo;

public class Matricula {

    private int codigo;
    private Aluno aluno;
    private Curso curso;

    private static int codAtual;
    public Matricula(Aluno aluno, Curso curso) {
        this.codigo = ++codAtual;
        this.aluno = aluno;
        this.curso = curso;
    }
}
