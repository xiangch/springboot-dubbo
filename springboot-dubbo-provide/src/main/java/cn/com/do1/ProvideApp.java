package cn.com.do1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
@ImportResource({ "classpath:dubbo/*.xml" })
@SpringBootApplication
public class ProvideApp {
    public static void main(String[] args) {
        SpringApplication.run(ProvideApp.class, args);
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
