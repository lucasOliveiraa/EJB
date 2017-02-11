package br.com.dextra.treinamento.model.service.interceptor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.interceptor.InvocationContext;

public class LogInterceptor {
	
	//Gerenciando Callbaks
	
	//Por padrão todos os métodos seguidos da Annotations
	//ele tem que ser void e receber um InvocationContext como parâmetro
	
	@PostConstruct
	public void construct(InvocationContext ctx){
		System.out.println("EJB FOI CRIADO" + ctx.getTarget().getClass().getSimpleName());
	}
	
	@PreDestroy
	public void destroy(InvocationContext ctx){
		System.out.println("EJB FOI DESTRUIDO");
	}
	
	@PrePassivate
	public void passavite(InvocationContext ctx){
		System.out.println("EJB ESTÁ PASSIVADO");
	}
	
	@PostActivate
	public void activate(InvocationContext ctx){
		System.out.println("EJB FOI ATIVADO");
	}
}
