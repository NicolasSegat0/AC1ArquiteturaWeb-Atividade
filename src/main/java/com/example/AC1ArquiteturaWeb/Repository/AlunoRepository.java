package com.example.AC1ArquiteturaWeb.Repository;

import com.example.AC1ArquiteturaWeb.Model.Aluno;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface AlunoRepository {
    List<Aluno> findAll();
    Aluno findById(Long id);
    Aluno save(Aluno aluno);
}
