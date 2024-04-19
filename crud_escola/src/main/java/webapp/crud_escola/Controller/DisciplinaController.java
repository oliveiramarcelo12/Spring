package webapp.crud_escola.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;


import java.util.List;

import webapp.crud_escola.Model.Disciplina;
import webapp.crud_escola.Model.Prof;
import webapp.crud_escola.Repository.DisciplinaRepository;
import webapp.crud_escola.Repository.ProfRepository;



@Controller
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Autowired
    private ProfRepository professorRepository;

    @GetMapping("/disciplinas")
    public ModelAndView listarDisciplinas() {
        ModelAndView modelAndView = new ModelAndView("listar-disciplinas");
        Iterable<Disciplina> disciplinas = disciplinaRepository.findAll();
        modelAndView.addObject("disciplinas", disciplinas);
        return modelAndView;
    }

    @GetMapping("/disciplinas/cadastrar")
    public ModelAndView exibirFormularioCadastro() {
        ModelAndView modelAndView = new ModelAndView("cadastro-disciplina");
        List<Prof> professores = (List<Prof>) professorRepository.findAll();
        modelAndView.addObject("professores", professores);
        modelAndView.addObject("disciplina", new Disciplina());
        return modelAndView;
    }

    @PostMapping("/disciplinas/cadastrar")
    public String cadastrarDisciplina(Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
        return "redirect:/disciplinas";
    }
}
