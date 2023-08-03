package com.in28min.spring.learnspringframework.enterprise.example.business;

import com.in28min.spring.learnspringframework.enterprise.example.data.TestDataService;
import com.in28min.spring.learnspringframework.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {
    @Autowired
    private DataService dataService;
    @Autowired
    private TestDataService testDataService;

    public long calculateSum(){
      List<Integer> data =  dataService.getData();
     return data.stream().reduce(Integer::sum).get(); //FUNCTIONAL PROGRAMMING.
    }

    public String testing(){
        return testDataService.message();
    }
}


