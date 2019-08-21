package com.example.demo.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.entity.Player;

@RepositoryRestResource
@RestResource
public interface PlayerDetails extends PagingAndSortingRepository<Player, Long>{

	public Page<Player> findByRating(Double rating, Pageable page);
	
	public Page<Player> findByClubName(String clubName, Pageable page);
	
//	@RestResource(exported = false)
//	public List<Player> findByPlayerClubName(String clubName);
	
}
//Page<Payment> findAllByCustomerName(@Param("customerName") String customerName, Pageable page);