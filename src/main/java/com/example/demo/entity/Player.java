package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.hateoas.ResourceSupport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="player")
@Entity
public class Player extends ResourceSupport {
	
	@Id
	private long playerId;
	private String playerName;
	private String clubName;
	private double rating;
	
}
