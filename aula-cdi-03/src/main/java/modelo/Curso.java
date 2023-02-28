package modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private int cod;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    private String nome;
    private String descricao;

    private int ch;

    private List<Matricula> matriculas;

    public Curso(){}

    public Curso(String nome, String desc, int ch) {
        this.nome = nome;
        this.descricao = desc;
        this.ch = ch;
        this.matriculas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
