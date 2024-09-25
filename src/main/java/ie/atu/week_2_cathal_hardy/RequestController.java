package ie.atu.week_2_cathal_hardy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Howdy, " + name + "!";
    }
}


