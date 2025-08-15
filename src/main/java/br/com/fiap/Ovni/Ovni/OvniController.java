package br.com.fiap.Ovni.Ovni;

import br.com.fiap.Ovni.Ovni.OvniService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/ovni")
public class OvniController {
    private final OvniService ovniService;
    
    public OvniController(OvniService ovniService){
        this.ovniService=ovniService;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute( "ovnis", ovniService.getAllTasks());
        return "index";
    }

    @GetMapping("/form")
    public String form(){
        return "form";
    }
    
    @PostMapping("/form")
    public String create(Ovni ovni,RedirectAttributes redirect){
        ovniService.save(ovni);
        redirect.addFlashAttribute("message","Aparição de ovni registrada!");
        return "redirect:/ovni";

    }
}

