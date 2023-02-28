package services;

import modelo.Curso;
public class CursoService {

    public Curso buscarPorCurso(int codCurso){
        Curso c = new Curso("Prog Web", "Programação Web", 10);
        c.setCod(codCurso);
        return c;
    }

}
