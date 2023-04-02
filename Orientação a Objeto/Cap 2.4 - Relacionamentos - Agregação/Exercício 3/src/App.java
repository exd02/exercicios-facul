import classes.Aluno;
import classes.Telefone;

import java.util.List;
import java.util.ArrayList;

// Usar o Map para fazer uma lista com o ID do array e os DDDs de cada array
import java.util.Map;
import java.util.HashMap;


import java.util.Set; 
import java.util.HashSet;

public class App {
    public static List<Integer> buscarAlunosPeloDdd(Map<Integer, List<String>> listaDddAlunos, String dddBusca)
    {
        List<Integer> alunosDoDdd = new ArrayList<>();

        for (Map.Entry<Integer, List<String>> entry : listaDddAlunos.entrySet()) {
            int id = entry.getKey();
            List<String> ddds = entry.getValue();

            // Verificando se o cliente possui o DDD especificado
            if (ddds.contains(dddBusca))
                alunosDoDdd.add(id);
            
        }

        return alunosDoDdd;
    }
      
    /* Verificar quais alunos são de um mesmo DDD e imprimi-los */
    public static void verificarAlunosComMesmoDdd (Aluno[] alunos) {
        Map<Integer, List<String>> listaDddAlunos = new HashMap<>(); 

        for (int i=0; i<alunos.length; i++)
        {
            for (int j=0; j<alunos[i].getListTelefones().size(); j++)
            {   
                listaDddAlunos.computeIfAbsent(i, k -> new ArrayList<>()).add(alunos[i].getListTelefones().get(j).getDdd());
            }
        }
        // Agora que temos um map com o id do array e os seus DDDs fica mais facíl de fazer a busca

        Set<String> dddsEncontrados = new HashSet<>();
        for (Map.Entry<Integer, List<String>> entry : listaDddAlunos.entrySet())
        {
            List<String> ddds = entry.getValue();
            for (String ddd : ddds) {
                if (dddsEncontrados.contains(ddd))
                continue;

                List<Integer> alunosDoDdd = buscarAlunosPeloDdd(listaDddAlunos, ddd);
                System.out.println("Alunos com DDD " + ddd + ": " + alunosDoDdd);
                dddsEncontrados.add(ddd);
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        Aluno[] alunos = new Aluno[2];
        
        for (int i=0; i<alunos.length; i++)
        {
            alunos[i] = new Aluno();
            alunos[i].fill();
        }

        verificarAlunosComMesmoDdd(alunos);
    }
}
