package com.in28min.spring.learnspringframework.enterprise.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class MyWebController {


    public long returnValueFromBusinessService(){
        return 200;
    }


}

class BusinessService{
    private DataService dataService;


    public long calculateSum(){
      List<Integer> data =  dataService.getData();
     return data.stream().reduce(Integer::sum).get(); //FUNCTIONAL PROGRAMMING.
    }
}

class DataService{
    public List<Integer> getData(){
        return Arrays.asList(10,20,30,40);
    }
}