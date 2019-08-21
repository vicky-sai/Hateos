package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Player;
import com.example.demo.repo.PlayerDetails;

@Service
public class PlayerService {

	@Autowired
	private PlayerDetails repo;
	
	public Iterable<Player> getAllPlayers(double rating, Integer pageNo, Integer pageSize, String sortBy) {

		Pageable page = PageRequest.of(pageNo, pageSize, Sort.by(sortBy).ascending());
		//Page<Player> pageList =  this.repo.findAll(page);//findByPlayerRating(1, page);
		PlayerDetails details = (PlayerDetails)repo;;
		return details.findByRating(rating, page);
	}

	public Iterable<Player> findAll() {
		return this.repo.findAll();
	}

	
}
