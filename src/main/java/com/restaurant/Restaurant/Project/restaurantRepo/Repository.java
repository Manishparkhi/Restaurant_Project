package com.restaurant.Restaurant.Project.restaurantRepo;

import com.restaurant.Restaurant.Project.restaurantModel.Restaurant;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    ArrayList<Restaurant> allUser = new ArrayList<>();

    public  Repository(){


        allUser.add(new Restaurant("1","DAWAT_RESTAURANT","CHANDRAPUR","7875086330","NON_VEG_CHICKEN","10"));
    }

    public List<Restaurant> findAllUser() {
        return allUser;

    }

    public boolean save(Restaurant data) {
        allUser.add(data);
        return true;
    }
}
