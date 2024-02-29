package webapp.hello_world.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class indexController {

@RequestMapping(value = "/", method = RequestMethod.GET)
public ModelAndView abrirIndex() {
ModelAndView mv = new ModelAndView("index");

String mensagem = "Olá, seja bem-vinda(o)!";
mv.addObject("msg", mensagem);

return mv;
}




@RequestMapping(value = "/", method = RequestMethod.POST)
public ModelAndView processarFormulario(@RequestParam("nome") String nome) {
    ModelAndView mv = new ModelAndView("resultado");

    // Aqui você pode processar os dados recebidos do formulário, por exemplo, salvá-los em um banco de dados
    
    // Mensagem personalizada com o nome fornecido no formulário
    String mensagem = "Olá, " + nome + "! Dados adicionados com sucesso!";
    mv.addObject("mensagem", mensagem);

    return mv;
}
}