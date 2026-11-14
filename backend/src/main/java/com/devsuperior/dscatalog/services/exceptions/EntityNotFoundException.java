package com.devsuperior.dscatalog.services.exceptions;

public class EntityNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public EntityNotFoundException(String msg) {
		super(msg); //quando vc faz um contrutor e quer repassar o argumento para o construtor da superclasse
	}

	
	
	
	
}
