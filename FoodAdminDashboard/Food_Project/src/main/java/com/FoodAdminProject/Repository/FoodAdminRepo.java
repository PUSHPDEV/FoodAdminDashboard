package com.FoodAdminProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FoodAdminProject.Entity.Food;

public interface FoodAdminRepo extends JpaRepository<Food, Integer>{


}
