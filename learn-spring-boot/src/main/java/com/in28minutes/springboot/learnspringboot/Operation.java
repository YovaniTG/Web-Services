package com.in28minutes.springboot.learnspringboot;

import org.springframework.stereotype.Component;

@Component
public class Operation {

    public String getOperation(){

        for(int j=0; j > 2 ; j++){
            for(int k=0; k > 10 ; k++){
               if(k==5){
                   return j + "" + k;

               }

            }
        }

        return "";
    }



}
