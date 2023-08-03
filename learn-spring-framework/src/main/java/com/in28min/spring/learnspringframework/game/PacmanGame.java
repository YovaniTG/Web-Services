package com.in28min.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{
    public void up(){
        System.out.println("Pacman Move up");
    }

    public void down(){
        System.out.println("Pacman Move down");
    }

    public void left(){
        System.out.println("Pacman Move left");
    }

    public void right(){
        System.out.println("Pacman Move right");
    }
}
