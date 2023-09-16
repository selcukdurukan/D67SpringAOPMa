package com.ba.boost.d67springaopibrahim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class D67SpringAopIbrahimApplication {

    public static void main(String[] args) {
        SpringApplication.run(D67SpringAopIbrahimApplication.class, args);
    }

}
