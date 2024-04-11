package webapp.crud_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import webapp.crud_escola.Model.Prof;
import webapp.crud_escola.Repository.ProfessorRepository;
import webapp.crud_escola.Repository.VerificaCadastroProfRepository;

@Controller
public class ProfController {
    
    @Autowired
    private ProfessorRepository ar;
    @Autowired
    private VerificaCadastroProfRepository vcar;

    @PostMapping("/cad-prof")
    public String postCadProf(Prof prof) {
        String cpfVerificar = vcar.findByCpf(prof.getCpf()).getCpf();
        if (cpfVerificar.equals(prof.getCpf())) {
            ar.save(prof);
        }

        return "prof/login-prof";
    }

}
