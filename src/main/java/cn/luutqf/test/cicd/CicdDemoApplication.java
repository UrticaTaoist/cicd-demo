package cn.luutqf.test.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdDemoApplication.class, args);
    }

    @GetMapping
    public Object get(){
        return "2019-2-16 15:54:12 by master d  ds";
    }
}

