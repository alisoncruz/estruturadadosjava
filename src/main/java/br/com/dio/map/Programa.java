package br.com.dio.map;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programa {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Turma", "3a");

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno);

        System.out.println(listaAlunos);

        Map<String,String> aluno2 = new HashMap<>();

        aluno2.put("Nome","maria");
        aluno2.put("Idade","18");
        aluno2.put("Media","8.5");
        aluno2.put("Turma","3.b");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);
    }
}
