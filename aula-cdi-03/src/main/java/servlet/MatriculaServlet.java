package servlet;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import modelo.Aluno;
import modelo.Curso;
import modelo.Matricula;
import services.CursoService;
import services.MatriculaService;

import java.io.IOException;

import services.*;

@WebServlet(name="MatriculaServlet", value="/mat")
public class MatriculaServlet extends HttpServlet {

    @Inject
    private AlunoService alunoService;
    @Inject
    private CursoService cursoService;
    @Inject
    private MatriculaService matriculaService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String codAluno = req.getParameter("codAluno");
        String codCurso = req.getParameter("codCurso");

        Aluno a = alunoService.buscarPorCodigo( Integer.parseInt(codAluno));
        Curso c = cursoService.buscarPorCurso( Integer.parseInt(codCurso));
        Matricula mat = matriculaService.matricular(a, c);

        // colocar a matricula no response...

    }
}
