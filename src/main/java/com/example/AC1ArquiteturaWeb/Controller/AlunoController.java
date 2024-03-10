package com.example.AC1ArquiteturaWeb.Controller;

import com.example.AC1ArquiteturaWeb.Model.Aluno;
import com.example.AC1ArquiteturaWeb.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlunoController {
    @Autowired
    private AlunoRepository repository;

    @GetMapping("/alunos")
    public List<Aluno> getAlunos() {
        return repository.findAll();
    }

    @GetMapping("/alunos/{nomeAluno}")
    public Aluno getOne(@PathVariable ("nomeAluno") String nomeAluno) {
        return repository.findByNomeAluno(nomeAluno);
    }

    @DeleteMapping("/alunos/{id}")
    public void deleteAluno(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/alunos")
    public void postAluno(@RequestBody Aluno aluno) {
        repository.save(aluno);
    }

    @PutMapping("/alunos/{id}")
    public String putAluno(@PathVariable("id") Long id, @RequestBody Aluno aluno) {
        return "Aluno com ID " + id + " atualizado com sucesso.";
    }

}
