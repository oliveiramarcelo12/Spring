package webapp.crud_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import webapp.crud_escola.Model.Administrador;
import webapp.crud_escola.Repository.AdministradorRepository;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AdministradorController {
    @Autowired
    private AdministradorRepository ar ;

    @PostMapping("/cad-adm")
    public String postCadAdm (Administrador adm) {
        ar.save(adm);
        return "adm/login-adm";
    }
    
    
}