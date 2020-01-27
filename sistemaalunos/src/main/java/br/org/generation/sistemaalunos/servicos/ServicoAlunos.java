package br.org.generation.sistemaalunos.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.sistemaalunos.dao.IAlunoBD;
import br.org.generation.sistemaalunos.model.Aluno;


@Component
public class ServicoAlunos  implements IAlunoService{
	
	@Autowired //indica que o gerenciamento desse objeto é por conta doSpringBoot
	IAlunoBD repo; //repo é de repositorio (uma alusao ao banco de dados)
	
	public void gravarAlunoNoBanco (Aluno aluno) {
		try {
			repo.save(aluno);
	
		}
		catch(Exception ex) {
			throw new RuntimeException ("Erro ao inserir novo aluno!");
		}
	}
	public void atualizarAlunoNoBanco(Aluno aluno) {
		try{
			repo.save(aluno);
		}
		catch(Exception ex) {
			throw new RuntimeException ("Erro ao atulizar no banco");
		}
		
	}
	public Aluno recuperarAlunoPorId(int id) {
		return repo.findById(id).get();

	}
	
}
