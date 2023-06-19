package com.FoodAdminProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FoodAdminProject.Entity.Food;
import com.FoodAdminProject.Service.FoodAdminService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FoodAdminController {

	@Autowired
	private FoodAdminService service;

	@PostMapping("insert")
	@CrossOrigin(origins = "http://localhost:4200")
	public Food addFood(@RequestBody Food food) {
		return service.addFood(food);
	}

	@GetMapping("view")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Food> getFoods() {
		return this.service.getFoods();
	}

	@PutMapping("update")
	@CrossOrigin(origins = "http://localhost:4200")
	public Food updateFood(@RequestBody Food food) {
		return service.updateFood(food);
	}

	@DeleteMapping("/delete/{fid}")
	@CrossOrigin(origins = "http://localhost:4200")
	public String deleteFood(@PathVariable int fid) {
		service.deleteFood(fid);
return "deleted";
	}

}
