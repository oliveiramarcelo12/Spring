package webapp.crud_escola.Repository;

import org.springframework.data.repository.CrudRepository;


import webapp.crud_escola.Model.VerificaCadastroAluno;

public interface VerificaCadastroAlunoRepository extends CrudRepository<VerificaCadastroAluno, String> {
    VerificaCadastroAluno findByCpf(String cpf);

    VerificaCadastroAluno findByNome(String nome);
}
