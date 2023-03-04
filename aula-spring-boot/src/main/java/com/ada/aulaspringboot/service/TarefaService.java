package com.ada.aulaspringboot.service;

import com.ada.aulaspringboot.model.Tarefa;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TarefaService {

    private List<Tarefa> tarefas = new ArrayList<Tarefa>();
    private static int proximoId = 1;

    public List<Tarefa> buscarTodas(){
        return tarefas;
    }
    public Tarefa adicionar(Tarefa tarefa){
        tarefa.setId( Long.valueOf(proximoId++));
        tarefas.add(tarefa);
        return tarefa;
    }

    public void remover(Long id){
        tarefas.removeIf(t -> t.getId() == id);
    }

}
