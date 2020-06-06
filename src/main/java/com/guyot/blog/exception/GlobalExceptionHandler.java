package com.guyot.blog.exception;

import com.guyot.blog.vo.BaseResponse;
import com.guyot.blog.vo.ResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.TypeMismatchException;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.net.BindException;

@ConditionalOnWebApplication
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler({
            NoHandlerFoundException.class,
            HttpRequestMethodNotSupportedException.class,
            HttpMediaTypeNotSupportedException.class,
            MissingServletRequestParameterException.class,
            TypeMismatchException.class,
            HttpMessageNotReadableException.class,
            HttpMessageNotWritableException.class,
            HttpMediaTypeNotAcceptableException.class,
            ServletRequestBindingException.class,
            ConversionNotSupportedException.class,
            MissingServletRequestPartException.class
    })
    public BaseResponse handlerServletException(Exception e) {
        log.error(e.getMessage(), e);
        return new BaseResponse(ResultEnum.BAD_REQUEST, e.getMessage());
    }

    @ExceptionHandler({
            BindException.class,
            MethodArgumentNotValidException.class
    })
    public BaseResponse validException(Exception e) {
        log.error(e.getMessage(), e);
        return new BaseResponse(ResultEnum.BAD_REQUEST, e.getMessage());
    }

    @ExceptionHandler({ServiceException.class}
    )
    public BaseResponse serviceException(ServiceException serviceException) {
        log.error(serviceException.getMessage(), serviceException);
        return new BaseResponse(ResultEnum.INTERNAL_SERVER_ERROR, serviceException.getMessage());
    }

    @ExceptionHandler({RuntimeException.class,
            Exception.class,
            Throwable.class})
    public BaseResponse exception(Throwable throwable) {
        log.error(throwable.getMessage(), throwable);
        return new BaseResponse(ResultEnum.INTERNAL_SERVER_ERROR, throwable.getMessage());
    }
}
