package com.example.AC1ArquiteturaWeb.Model;

@Entity
public class Aluno {
  @ID
  @GeneratedValue(strategy = GenerationType>INDENTITY)
  private Long id; 
  private String nome; 
  private String matricula; 
  private String curso; 
  private int idade; 

  public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getMatricula() {
    return matricula;
}

public void setMatricula(String matricula) {
    this.matricula = matricula;
}

public String getCurso() {
    return curso;
}

public void setCurso(String curso) {
    this.curso = curso;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}




}
