package webapp.crud_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;
import webapp.crud_escola.Model.Disciplina;
import webapp.crud_escola.Repository.DisciplinaRepository;
import webapp.crud_escola.Repository.ProfessorRepository;

@Controller
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository DisciplinaRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/cadastro-disciplina")
    public ModelAndView cadastroDisciplina() {
        ModelAndView modelAndView = new ModelAndView("cadastro-disciplina");
        modelAndView.addObject("novaDisciplina", new Disciplina());
        modelAndView.addObject("professores", professorRepository.findAll());
        return modelAndView;
    }
}