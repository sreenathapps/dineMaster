/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * 
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.dinemaster.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dinemaster.model.Restaurant;
import com.example.dinemaster.repository.RestaurantJpaRepository;
import com.example.dinemaster.repository.RestaurantRepository;

/**
 * RestaurantJpaService
 */
@Service
public class RestaurantJpaService implements RestaurantRepository {

    @Autowired
    RestaurantJpaRepository restaurantJpaRepository;

    @Override
    public ArrayList<Restaurant> getRestaurants() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRestaurants'");
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addRestaurant'");
    }

    @Override
    public Restaurant updateRestaurant(int id, Restaurant restaurant) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateRestaurant'");
    }

    @Override
    public Restaurant getRestaurantById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRestaurantById'");
    }

    @Override
    public void deleteRestaurant(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteRestaurant'");
    }

    
}