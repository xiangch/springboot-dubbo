package cn.com.do1.example;

import org.springframework.stereotype.Service;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{
    @Override
    public String sayHello(String name) {
        return "hello "+name+"!";
    }
}
