package webapp.crud_escola.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    // método
    @GetMapping("/")
    public ModelAndView abrirIndex() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @GetMapping("/home")
    public ModelAndView homeIndex() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    // método
    @GetMapping("/login-adm")
    public ModelAndView abrirLoginAdm() {
        ModelAndView mv = new ModelAndView("adm/login-adm");
        return mv;
    }

    @GetMapping("/cad-adm") // endereço da pagina no site
    public ModelAndView abrirCadAdm() {
        ModelAndView mv = new ModelAndView("adm/cad-adm");
        return mv;
    }
    @GetMapping("/login-prof")
    public ModelAndView abrirLoginProf() {
        ModelAndView mv = new ModelAndView("prof/login-prof");
        return mv;
    }

    @GetMapping("/cad-prof") // endereço da pagina no site
    public ModelAndView abrirCadProf() {
        ModelAndView mv = new ModelAndView("prof/cad-prof");
        return mv;
    }
    @GetMapping("/login-aluno")
    public ModelAndView abrirLoginAluno() {
        ModelAndView mv = new ModelAndView("aluno/login-aluno");
        return mv;
    }

    @GetMapping("/cad-aluno") // endereço da pagina no site
    public ModelAndView abrirCadAluno() {
        ModelAndView mv = new ModelAndView("aluno/cad-aluno");
        return mv;
    }
}

