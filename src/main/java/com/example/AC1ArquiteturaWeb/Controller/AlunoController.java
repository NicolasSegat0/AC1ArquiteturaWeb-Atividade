package com.example.AC1ArquiteturaWeb.Controller;

import com.example.AC1ArquiteturaWeb.Model.Aluno;
import com.example.AC1ArquiteturaWeb.Repository.AlunoRepositoryImpl;
import com.example.AC1ArquiteturaWeb.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/alunos")
    public List<Aluno> getAlunos() {
        return alunoService.findAll();
    }

    @GetMapping("/alunos/{nomeAluno}")
    public Aluno getOne(@PathVariable ("nomeAluno") String nomeAluno) {
        return alunoService.findByNomeAluno(nomeAluno);
    }

    @DeleteMapping("/alunos/{id}")
    public void deleteAluno(@PathVariable("id") Long id) {
        alunoService.deleteById(id);
    }

    @PostMapping("/alunos")
    public void postAluno(@RequestBody Aluno aluno) {
        alunoService.save(aluno);
    }

    @PutMapping("/alunos/{id}")
    public String putAluno(@PathVariable("id") Long id, @RequestBody Aluno aluno) {
        return "Aluno com ID " + id + " atualizado com sucesso.";
    }

}
