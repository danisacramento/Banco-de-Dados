package br.org.generation.sistemaalunoecurso.services;

import java.util.List;

import br.org.generation.sistemaalunoecurso.model.Aluno;

public interface IAlunoService {
	public List<Aluno> recuperarTodos();
	public Aluno recuperarPorId(int id);
	public void novoAluno(Aluno aluno); // novo metodo

}

