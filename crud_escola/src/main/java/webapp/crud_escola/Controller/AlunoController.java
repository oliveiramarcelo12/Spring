package webapp.crud_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import webapp.crud_escola.Model.Aluno;
import webapp.crud_escola.Repository.AlunoRepository;
import webapp.crud_escola.Repository.VerificaCadastroAlunoRepository;



@Controller
public class AlunoController {
    @Autowired
    private AlunoRepository ar;
    @Autowired
    private VerificaCadastroAlunoRepository  vcar;

    @PostMapping("/cad-aluno")
    public String postCadAluno(Aluno aluno) {
        String cpfVerificar = vcar.findByCpf(aluno.getCpf()).getCpf();
        if (cpfVerificar.equals(aluno.getCpf())) {
            ar.save(aluno);
        }

        return "aluno/login-aluno";
    }
}
