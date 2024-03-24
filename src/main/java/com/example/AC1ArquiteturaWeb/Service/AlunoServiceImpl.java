package com.example.AC1ArquiteturaWeb.Service;

import com.example.AC1ArquiteturaWeb.Model.Aluno;
import com.example.AC1ArquiteturaWeb.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements AlunoService{

    @Autowired
    private AlunoRepository alunoRepository;
    private Optional<Object> alunoOptional;

    @Override
    public List<Aluno> getAllAluno() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno getAlunoById(Long id) {
        return alunoRepository.findById(id);
    }

    @Override
    public Aluno createAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno findByNomeAluno(String nomeAluno) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void save(Aluno aluno) {

    }
}
