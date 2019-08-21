package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Player;
import com.example.demo.service.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService service;
	
	@GetMapping("/getAll/{rating}/{pageNo}/{pageSize}/{sortBy}")
    public Iterable<Player> getAllPlayers(@PathVariable("rating") double rating, @PathVariable("pageNo") Integer pageNo,
    			@PathVariable("pageSize") Integer pageSize, @PathVariable("sortBy") String sortBy)	{
		
		return this.service.getAllPlayers(rating, pageNo, pageSize, sortBy);
	}
	
	@GetMapping("/getAll")
    public Iterable<Player> getAll()	{
		
		return this.service.findAll();
	}
	
}
