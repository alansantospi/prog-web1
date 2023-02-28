package services;

import modelo.Aluno;
import modelo.Curso;
import modelo.Matricula;

public class MatriculaService {

    public Matricula matricular(Aluno aluno, Curso curso){
        Matricula mat = new Matricula(aluno, curso);
        curso.getMatriculas().add(mat);

        aluno.setMatricula(mat);
        return mat;
    }
}
