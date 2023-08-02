package com.in28min.spring.learnspringframework;

import com.in28min.spring.learnspringframework.enterprise.example.MyWebController;
import com.in28min.spring.learnspringframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		//MarioGame game = new MarioGame();
		//SuperContraGame game2 = new SuperContraGame();
		//GamingConsole game = new PacmanGame();
		//GameRunner runner = new GameRunner(game);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());



	}

}
