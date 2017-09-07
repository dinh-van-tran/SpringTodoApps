package ems.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAsspect {

    @Before("within(ems.controller)")
    public void logBefore(JoinPoint joinPoint) {
        
    }
}
