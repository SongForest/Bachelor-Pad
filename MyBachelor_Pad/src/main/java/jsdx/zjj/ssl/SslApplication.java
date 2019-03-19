package jsdx.zjj.ssl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("jsdx.zjj.ssl.dao")
public class SslApplication {

    public static void main(String[] args) {
        SpringApplication.run(SslApplication.class, args);
    }

}
