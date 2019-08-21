package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Player;
import com.example.demo.service.PlayerService;

@SpringBootApplication
public class SpringDataHateosApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataHateosApplication.class, args);
		
		//PlayerService service = ctx.getBean(PlayerService.class);
		
		//List<Player> list = ctx.getBean(requiredType, args)
 
//		Player p = ctx.getBean(Player.class);
//		service.save(p);
//		ctx.close();
	}
	
//	@Bean
//	public Player player1() {
//		return new Player(101, "Dhoni", "CSK", 10);
//	}
	
//	@Bean
//	public Player player2() {
//		return new Player(102, "Sachin", "MI", 9);
//	}
//	
//	@Bean
//	public Player player3() {
//		return new Player(103, "Dravid", "RCB", 8);
//	}
//	
//	@Bean
//	public Player player() {
//		return new Player();
//	}
	
//	@Bean
//	public PlayerService playerService() {
//		return new PlayerService();
//	}
	

}
