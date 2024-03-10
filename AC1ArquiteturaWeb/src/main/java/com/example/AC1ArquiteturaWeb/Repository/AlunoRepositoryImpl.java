package com.example.AC1ArquiteturaWeb.Repository;

import com.example.AC1ArquiteturaWeb.Model.Aluno;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {
    public Aluno save(Aluno aluno){
        if (aluno.getId()==null) {
            System.out.println("SAVE - Recebendo o aluno na camada repositório");
        } else {
            System.out.println("UPDATE - Recebemdo o aluno na camada de repositório");
        }
        System.out.println(aluno);
        return aluno;
    }
    public void deleteById(Long id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Aluno> findAll(){
        System.out.print("LIST - Listando os alunos do sistema");
        List<Aluno> alunos = new ArrayList<>();;
        alunos.add(new Aluno("Nicolas", "1234", "ADS", 19));
        alunos.add(new Aluno("Guilherme", "5678", "ADS", 19));
        return alunos;
    }
    public Aluno findById(Long id) {
        System.out.print(String.format("FIND/id - Recebendo o id: %d para localizar um aluno", id));
        return new Aluno("Nicolas", "1234", "ADS", 19);
    }
    public Aluno findByNomeAluno(String nomeAluno){
        System.out.print(String.format("FIND/nomeAluno - Recebendo o nomeAluno: %s para localizar um aluno", nomeAluno));
        return new Aluno("Nicolas", "1234", "ADS", 19);
    }


}
