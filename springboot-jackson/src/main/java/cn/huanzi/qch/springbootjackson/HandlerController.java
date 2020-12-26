package cn.huanzi.qch.springbootjackson;

import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wenbaoxie
 * @Date 2020/11/12
 */
@ControllerAdvice
@RestController
public class HandlerController {
    @ExceptionHandler({BindException.class})
    public String nullPointerException(BindException e){

        return "BindException" + e.getMessage();
    }
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public String indexOutOfBoundsException(){
        return "NullPointerException";
    }

    public static void main(String[] args) {
        System.out.println();
    }
}