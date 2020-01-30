package br.org.generation.sistemaalunoecurso.services;

import java.util.List;

import br.org.generation.sistemaalunoecurso.model.Curso;

public interface ICursoService {
	
	public void adicionarNovoCurso(Curso curso);
	public Curso recuperarDetalhes(int id);
	public List<Curso> recuperarTodos();
	

}
