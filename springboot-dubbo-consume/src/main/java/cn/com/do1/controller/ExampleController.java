package cn.com.do1.controller;

import cn.com.do1.example.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @Autowired(required = false)
    private ExampleService exampleService;
    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable  String name){
        return exampleService.sayHello(name);
    }
}
