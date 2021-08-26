//package com.spring.mvc.hibernate.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class EmployeeGlobalExceptionHandler {
//    @ExceptionHandler
//    public ResponseEntity<EmployeeIncoorectInput> handlerException
//            (NoSuchEmployee exception){
//        EmployeeIncoorectInput data = new EmployeeIncoorectInput();
//        data.setInfo(exception.getMessage());
//
//        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler
//    public ResponseEntity<EmployeeIncoorectInput> handlerException
//            (Exception exception){
//        EmployeeIncoorectInput data = new EmployeeIncoorectInput();
//        data.setInfo(exception.getMessage());
//        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
//
//    }
//}
