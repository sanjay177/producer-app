package com.sr.basic.boot.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.Date;

@RestController
@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler({NoResourceFoundException.class})
    public ResponseEntity<AppException> handleNoResourceFoundException() {
        AppException appException = new AppException(400, "Requested Resource Not Found", new Date());
        return new ResponseEntity<>(appException, HttpStatus.BAD_REQUEST);
    }
}
