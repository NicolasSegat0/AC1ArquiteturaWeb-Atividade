package com.example.AC1ArquiteturaWeb.Service;

import com.example.AC1ArquiteturaWeb.Model.Aluno;

import java.util.List;

public interface AlunoService {
    List<Aluno> getAllAluno();
    Aluno getAlunoById(Long id);
    Aluno createAluno(Aluno aluno);

    List<Aluno> findAll();

    Aluno findByNomeAluno(String nomeAluno);

    void deleteById(Long id);

    void save(Aluno aluno);
}
