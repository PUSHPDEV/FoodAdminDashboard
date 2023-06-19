package com.FoodAdminProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FoodAdminProject.Entity.Food;
import com.FoodAdminProject.Repository.FoodAdminRepo;

@Service
public class FoodAdminServiceIMPL implements FoodAdminService {

	@Autowired
	private FoodAdminRepo foodadminrepo;

	@Override
	public Food addFood(Food food) {
		foodadminrepo.save(food);
		return food;
	}

	@Override
	public List<Food> getFoods() {
		return foodadminrepo.findAll();
	}

	@Override
	public Food updateFood(Food food) {
		foodadminrepo.save(food);
		return food;
	}
	
	@Override
	public String deleteFood(int fid) {
		foodadminrepo.deleteById(fid);
		return "Deleted"+fid;
	}


}
