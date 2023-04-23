package com.restaurant.Restaurant.Project.restaurantController;

import com.restaurant.Restaurant.Project.restaurantModel.Restaurant;
import com.restaurant.Restaurant.Project.restaurantServices.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/findUser/{id}")
    public List<Restaurant> findUser(@PathVariable String id){
        return service.findUser(id);
    }

    @GetMapping("/findAllUser")
    public List<Restaurant> findAllUser(){
        return service.findAllUser();
    }

    @PostMapping("/putData")
    public String postData(@RequestBody Restaurant data){
       return service.postData(data);
    }

    @PutMapping("/updateData/{id}")
    public String updateData(@RequestBody Restaurant data , @PathVariable String id){
        return service.updateInfo(data,id);
    }

    @DeleteMapping("/deleteId/{id}")
    public  String deleteId(@PathVariable String id){
        return service.deleteInfo(id);
    }
}
