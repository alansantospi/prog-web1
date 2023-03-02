package com.example.aulajstl01;

import java.util.*;
import java.io.*;
public class ColecaoDeNomes implements Serializable{
    private Collection nomes = new ArrayList();
    public ColecaoDeNomes() {
        nomes.add("Maria");
        nomes.add("Zeca");
        nomes.add("Carlos");
    }
    public Collection getNomes() { return nomes; }

    public String getNomesAsString() {
        StringBuilder builder = new StringBuilder();
        nomes.stream().forEach(nome -> builder.append(nome).append(","));
        return builder.toString();
    }
}

