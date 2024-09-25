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

    @GetMapping("/calculator")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        int result = 0;
        switch(operation){
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if(num2==0){
                    return "Error, num2 must be greater than 0!";
                }
                result = num1 / num2;
                break;
        }
        return "Result: " + result;
    }
}


