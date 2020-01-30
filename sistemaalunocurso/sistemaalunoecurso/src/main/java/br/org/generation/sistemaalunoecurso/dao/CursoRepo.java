package br.org.generation.sistemaalunoecurso.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.sistemaalunoecurso.model.Curso;

public interface CursoRepo extends CrudRepository<Curso,Integer> {

}
