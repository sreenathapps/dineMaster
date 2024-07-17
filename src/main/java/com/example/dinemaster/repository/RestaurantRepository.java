/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.dinemaster.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.dinemaster.model.Restaurant;

/**
 * RestaurantRepository
 */
@Repository
public interface RestaurantRepository {

    ArrayList<Restaurant> getRestaurants();
    Restaurant addRestaurant(Restaurant restaurant);
    Restaurant updateRestaurant(int id, Restaurant restaurant);
    Restaurant getRestaurantById(int id);
    void deleteRestaurant(int id);


}