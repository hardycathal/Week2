package ie.atu.week_2_cathal_hardy;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age){
        return "Name: " + name + "\nAge: " + age;
    }
}


