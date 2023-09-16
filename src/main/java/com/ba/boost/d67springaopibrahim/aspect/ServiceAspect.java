package com.ba.boost.d67springaopibrahim.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {


    @Before(value = "execution(* com.ba.boost.d67springaopibrahim.aopservice.MessageService.giveMessage(..))")
    public void beforeGiveMessage(JoinPoint joinPoint){
        System.out.println("Before giveMessage method... " + joinPoint.getArgs()[0]);
    }

    @After(value = "execution(* com.ba.boost.d67springaopibrahim.aopservice.*.*(..))")
    public void afterGiveMessage(JoinPoint joinPoint) {
        System.out.println("After giveMessage method... " + joinPoint.getArgs()[0]);
    }

    @AfterReturning(pointcut = "execution(* com.ba.boost.d67springaopibrahim.aopservice.MessageService.giveMessage(..))", returning = "retVal")
    public void afterReturningGiveMessage(Object retVal) {
        System.out.println("After returning giveMessage... " +retVal);
    }


    //Around olursa yukarda 3'u çalışmaz
//    @Around(value = "execution(* com.ba.boost.d67springaopibrahim.aopservice.*.*(..))")
//    public void aroundGiveMessage(ProceedingJoinPoint joinPoint) {
//        System.out.println("Around GiveMessage..." + joinPoint.getArgs()[0]);
//    }


}


