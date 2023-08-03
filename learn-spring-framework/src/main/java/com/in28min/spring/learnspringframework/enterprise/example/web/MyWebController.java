package com.in28min.spring.learnspringframework.enterprise.example.web;

import com.in28min.spring.learnspringframework.enterprise.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class MyWebController {
@Autowired
    private BusinessService businessService;
    public long returnValueFromBusinessService(){
        return businessService.calculateSum();
    }


    public String returnString(){
       return  businessService.testing() ;
    }
}

