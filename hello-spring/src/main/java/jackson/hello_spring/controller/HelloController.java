package jackson.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") //api get method(ex. localhost:8080/{path}
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello"; //view resolver renders resources/templates/{viewName}.html
    }
}
