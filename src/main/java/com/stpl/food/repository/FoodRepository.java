package com.stpl.food.repository;

import org.springframework.stereotype.Repository;
import com.stpl.food.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long>{

}
