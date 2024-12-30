package com.grocery.store.aop;

import com.grocery.store.models.GetEntitiesResponseDTO;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SuccessfulResponse {

    @Around("execution(* com.grocery.store.controllers..*(..))")
    public Object successfulResponseDTO(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object obj = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("The request took "+ (endTime - startTime) + " milliseconds");
        return obj;

    }

}
