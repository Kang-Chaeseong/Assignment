package Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeworkController {
    @RequestMapping("/")
    public String home(){
        return "Assignment.html";
    }
}
