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

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
        List<Restaurant> restaurantList = restaurantJpaRepository.findAll();
        return new ArrayList<>(restaurantList);

    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantJpaRepository.save(restaurant);
    }

    @Override
    public Restaurant updateRestaurant(int id, Restaurant restaurant) {
        try {
            Restaurant newRestaurant = restaurantJpaRepository.findById(id).get();
            if (restaurant.getAddress() != null) {
                newRestaurant.setAddress(restaurant.getAddress());
            }
            if (restaurant.getCuisineType() != null) {
                newRestaurant.setCuisineType(restaurant.getCuisineType());
            }
            if (restaurant.getName() != null) {
                newRestaurant.setName(restaurant.getName());
            }
            if (restaurant.getRating() != 0) {
                newRestaurant.setRating(restaurant.getRating());
            }

            return restaurantJpaRepository.save(newRestaurant);

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Restaurant getRestaurantById(int id) {
        try {
            return restaurantJpaRepository.findById(id).get();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void deleteRestaurant(int id) {
        try {
            restaurantJpaRepository.deleteById(id);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}