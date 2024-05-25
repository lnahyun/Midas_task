package task1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyWorksController {

    @GetMapping("/")
    public String controller() {
        return "nahyun.html";
    }
}
