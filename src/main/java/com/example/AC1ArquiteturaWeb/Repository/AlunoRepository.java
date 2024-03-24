package com.example.AC1ArquiteturaWeb.Repository;

import com.example.AC1ArquiteturaWeb.Model.Aluno;

import java.util.List;

public interface AlunoRepository {
    List<Aluno> findAll();
    Aluno findById(Long id);
    Aluno save(Aluno aluno);
}
