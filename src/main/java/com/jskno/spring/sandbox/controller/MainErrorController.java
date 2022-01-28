package com.jskno.spring.sandbox.controller;

import com.jskno.spring.sandbox.persistence.News;
import com.jskno.spring.sandbox.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@ControllerAdvice
public class MainErrorController {

    private final HandlerMapping handlerMapping;

    public MainErrorController(HandlerMapping handlerMapping) {
        this.handlerMapping = handlerMapping;
    }

    @ExceptionHandler(Exception.class)
    public String handleError(HttpServletRequest req, HttpServletResponse res,
                              Exception ex) {
        return "Hello Error";
    }
}
