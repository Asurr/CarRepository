package com.compramos.tu.coche.es.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
		
	private static final Logger LOGGER = LoggerFactory.getLogger(AfterAopAspect.class);

	@AfterReturning(value = "execution(* com.compramos.tu.coche.es.service.*.*(..))", 
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		LOGGER.info("{} returned with value {}", joinPoint, result);
	}


}
