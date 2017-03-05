package com.lm;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Description:
 * Version:
 * Created by Leaves on 2017/3/4.
 */
@Aspect
public class Audience {

    @Pointcut("execution(**concert.Performance.performance(..))")
    public void performance() {}

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silence cell phones.");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Take seats.");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund.");
    }

    /** 环绕通知 */
    @Pointcut("execution(**concert.Performance.performance(..))")
    public void aroundPerformance() {}

    @Around("aroundPerformance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Silence cell phones.");
            System.out.println("Take seats.");
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund.");
        }
    }
}
