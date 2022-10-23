package zaichenko.edu.course.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping("/hello")
    String showHello(){
        return "<h1>Hello from controller</h1>";
    }
}