package com.example.simplespring.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.simplespring.entity.Cycles;

public interface CyclesRepository extends CrudRepository<Cycles, Integer> {
	
	@Query(value = "select * from Cycles where available=true", nativeQuery = true)
	List<Cycles> findByAvailable();
	
}
