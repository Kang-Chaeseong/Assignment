package Elon.Elon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElonController {
    @GetMapping("/Elon")
    public String Elon_Serve(Model model){
        model.addAttribute("data","Helloworld");
        return "Elon";
    }
}
