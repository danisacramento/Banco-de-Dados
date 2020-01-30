package br.org.generation.sistemaalunoecurso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.sistemaalunoecurso.dao.AlunoRepo;
import br.org.generation.sistemaalunoecurso.model.Aluno;

@Component
public class AlunoServiceImpl implements IAlunoService {
	@Autowired
private AlunoRepo repo;
	@Override
	public List<Aluno> recuperarTodos() {
		// TODO Auto-generated method stub
		return (List<Aluno>)repo.findAll();
	}
	
	@Override
	public void novoAluno(Aluno aluno) {
	repo.save(aluno);
	}

	@Override
	public Aluno recuperarPorId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
	

}
