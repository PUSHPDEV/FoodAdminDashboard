package com.FoodAdminProject.Service;

import java.util.List;

import com.FoodAdminProject.Entity.Food;

public interface FoodAdminService {

	Food addFood(Food food);

	List<Food> getFoods();

	Food updateFood(Food food);

	String deleteFood(int fid);







}
