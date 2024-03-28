package webapp.crud_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import webapp.crud_escola.Model.Administrador;
import webapp.crud_escola.Repository.AdministradorRepository;
import webapp.crud_escola.Repository.VerificaCadastroAdmRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AdministradorController  {
    @Autowired
    private AdministradorRepository ar ;
    @Autowired
    private VerificaCadastroAdmRepository vcar;

    @PostMapping("/cad-adm")
    public ModelAndView postCadAdm (Administrador adm) {
        boolean verificaCpf = vcar.existsById(adm.getCpf());

  ModelAndView mv = new ModelAndView("adm/login-adm");
        if (verificaCpf) {
            ar.save(adm);
            String mensagem = "Cadastro Realizado com sucesso";
            System.out.println(mensagem);
            mv.addObject("msg", mensagem);
           
        }else{
            String mensagem = "Cadastro não realizado . . .";
            System.out.println(mensagem);
            mv.addObject("msg", mensagem);
        }
      
        return mv;
    }
    
    
}