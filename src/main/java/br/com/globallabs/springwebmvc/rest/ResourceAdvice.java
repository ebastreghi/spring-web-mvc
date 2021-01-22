package br.com.globallabs.springwebmvc.rest;

import br.com.globallabs.springwebmvc.exception.JediNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ResourceAdvice {

    //using AOP itś gonna return NOT_FOUND when occur JediNotFoundException
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(JediNotFoundException.class)
    public void notFound(){

    }
}
