package controller;

import model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {
        // 1.a
        Aluno aluno1 = new Aluno();
        System.out.println(aluno1);

        Aluno aluno2 = new Aluno();
        System.out.println(aluno2);

        Aluno aluno3 = new Aluno(3, "99999999999", "João", "Silva", "joãosilva@gmail.com");
        System.out.println(aluno3);

        Aluno aluno4 = new Aluno(4, "11111111111", "Marina", "Silva", "marinasilva@gmail.com");
        System.out.println(aluno4);

        Aluno aluno5 = new Aluno(5, "Lara");
        System.out.println(aluno5);

        Aluno aluno6 = new Aluno(6, "Matheus");
        System.out.println(aluno6);

        // 1.b
        aluno1.setId(1);
        aluno1.setCpf("22222222222");
        aluno1.setNome("Cristiano");
        aluno1.setSobrenome("Ronaldo");
        aluno1.setEmail("cristianoronaldo@gmail.com");
        System.out.println(aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());

        aluno2.setId(2);
        aluno2.setCpf("33333333333");
        aluno2.setNome("Lionel");
        aluno2.setSobrenome("Messi");
        aluno2.setEmail("lionelmessi@gmail.com");
        System.out.println(aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail());

        // 2
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);
        System.out.println(alunos);
        Aluno alunoFind = alunos.stream().filter(aluno -> aluno.getId() == 5).findAny().orElse(null);
        System.out.println(alunoFind);
        Collections.reverse(alunos);
        System.out.println(alunos);

        Map<Integer, Aluno> alunosMap = new HashMap<>();
        alunosMap.put(aluno1.getId(), aluno1);
        alunosMap.put(aluno2.getId(), aluno2);
        alunosMap.put(aluno3.getId(), aluno3);
        alunosMap.put(aluno4.getId(), aluno4);
        alunosMap.put(aluno5.getId(), aluno5);
        alunosMap.put(aluno6.getId(), aluno6);
        System.out.println(alunosMap);
        System.out.println(alunosMap.get(5));

    }
}
