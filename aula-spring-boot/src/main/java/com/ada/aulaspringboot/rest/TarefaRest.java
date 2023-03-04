package com.ada.aulaspringboot.rest;


import com.ada.aulaspringboot.model.Tarefa;
import com.ada.aulaspringboot.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaRest {

    private TarefaService tarefaService;
    @Autowired
    public TarefaRest(TarefaService tarefaService){
        this.tarefaService = tarefaService;
        Tarefa t1 = new Tarefa();
        t1.setTitulo("Lavar louça");
        t1.setDescricao("Lavar todas as louças do jantar #sextou");
        t1.setPrazo(LocalDate.now());
        t1.setConcluida(false);
        this.tarefaService.adicionar(t1);
    }

    @GetMapping("/listar")
    public List<Tarefa> getAll() {
        return tarefaService.buscarTodas();
    }

    @GetMapping("/pesquisar")
    public List<Tarefa> pesquisarPorTitulo(@RequestParam String prefixo){
        List<Tarefa> tarefas = tarefaService.buscarTodas();
        List<Tarefa> encontrados = new ArrayList<>();

         for (Tarefa t : tarefas){
            if (t.getTitulo().startsWith(prefixo)){
                encontrados.add(t);
            }
        }
         return encontrados;
    }
    @GetMapping("/remover/{id}")
    public String remover(@PathVariable Long id){
        tarefaService.remover(id);
        return "Tarefa exluída com sucesso!";
    }
    @PostMapping("/criar")
    public Tarefa criar(@RequestBody Tarefa tarefa){

        tarefaService.adicionar(tarefa);
        return tarefa;
    }

}
