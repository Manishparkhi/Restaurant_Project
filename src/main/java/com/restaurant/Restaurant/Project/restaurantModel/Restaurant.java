package com.restaurant.Restaurant.Project.restaurantModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    private  String Restaurant_Id;
    private String Restaurant_name;
    private String restaurant_address;
    private String number;
    private String specialty;
    private String total_staffs ;


}
