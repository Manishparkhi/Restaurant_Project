package com.restaurant.Restaurant.Project.restaurantServices;

import com.restaurant.Restaurant.Project.restaurantModel.Restaurant;
import com.restaurant.Restaurant.Project.restaurantRepo.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repo;
    public List<Restaurant> findAllUser() {
       return repo.findAllUser();
    }

    public List<Restaurant> findUser(String id) {
        List<Restaurant> user = new ArrayList<>();

            List<Restaurant> allUser = repo.findAllUser();

            for(Restaurant data : allUser){
                if (data.getRestaurant_Id().equals(id)){
                   user.add(data);

            }
        }
        return user;
    }


    public String postData(Restaurant data) {
        boolean insertion = repo.save(data);

        if(insertion == true){
            return "Addes Successfully";
        }else{
            return "Not Added";
        }
    }

    public String updateInfo(Restaurant data, String id) {
          if(id != null){
              List<Restaurant> allUser = repo.findAllUser();
              for(Restaurant val : allUser){
                  if(val.getRestaurant_Id().equals(id)){
                      val.setNumber(data.getNumber());
                      val.setSpecialty(data.getSpecialty());
                      val.setRestaurant_address(data.getRestaurant_address());
                      val.setTotal_staffs(data.getTotal_staffs());
                      val.setRestaurant_name(data.getRestaurant_name());
                      val.setRestaurant_Id(data.getRestaurant_Id());
                      return "Successfully Updated";
                  }
              }

          }else {
              return "Not Found ID.....!!!!";
          }
          return  "Enter a Id";
    }

    public String deleteInfo(String id) {

        List<Restaurant> allUser = repo.findAllUser();

        for (Restaurant val : allUser) {
            if (val.getRestaurant_Id().equals(id)) {
                allUser.remove(val);
                return "Successfully Deleted Id";
            }

        }
        return "Not Found Id";
    }


}
