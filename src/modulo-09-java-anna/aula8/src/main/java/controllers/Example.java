package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RequestParam;
import services.PessoaService;

/**
 * @author Carlos H. Nonnemacher
 */
@Controller
public class Example {

    @Autowired
    PessoaService service;
    
    @RequestMapping(value = "/", method = POST)
    String toIndex(Model model, @RequestParam(required = false) String name) {
        model.addAttribute("name", name == null ? "Anna Luísa Silva" : name);
        model.addAttribut();
        return "index";
    }

   
}
