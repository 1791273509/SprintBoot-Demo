package cn.huanzi.qch.springbootjackson;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

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
}