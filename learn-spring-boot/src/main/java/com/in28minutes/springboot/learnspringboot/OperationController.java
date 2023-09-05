package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class OperationController{
    @Autowired
    private Operation operation;

    @RequestMapping("/operation")
    public String totalOperation(){
        return operation.getOperation();
    }
}
