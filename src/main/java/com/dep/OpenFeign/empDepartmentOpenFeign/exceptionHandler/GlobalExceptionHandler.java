package com.dep.OpenFeign.empDepartmentOpenFeign.exceptionHandler;

import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public Object exp(Exception e) {

        return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);

    }

}
