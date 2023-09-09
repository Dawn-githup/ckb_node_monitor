package org.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/count")
    public int getCount() {
        JsonArrayObjectCount get = new JsonArrayObjectCount();
        return get.getNode();
    }
}

