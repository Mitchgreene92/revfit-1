package com.revature.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Workout;

@Repository
public interface WorkoutRepository extends CrudRepository<Workout, Integer>{
	
}
