package com.example.campus.carinsurance.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.campus.carinsurance.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint)
    {
        System.out.println("执行方法： "+joinPoint.getSignature().getName());
    }
}
