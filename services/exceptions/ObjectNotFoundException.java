package com.curso.WorkshopMongoDB.services.exceptions;

import com.curso.WorkshopMongoDB.domain.User;

import java.util.Optional;

public class ObjectNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
