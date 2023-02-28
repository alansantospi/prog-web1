package services;

import jakarta.inject.Qualifier;
import modelo.Aluno;

import java.lang.annotation.Documented;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
public class AlunoService {

    public AlunoService(){}

    public Aluno buscarPorCodigo(int cod){
        Aluno a = new Aluno("João", "123");
        a.setCod(cod);
        return a;
    }

}
