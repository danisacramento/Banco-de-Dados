package br.org.generation.sistemaalunoecurso.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.sistemaalunoecurso.model.Aluno;

public interface AlunoRepo extends CrudRepository <Aluno,Integer> {

}
