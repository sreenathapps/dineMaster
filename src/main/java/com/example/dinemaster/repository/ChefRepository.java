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

import com.example.dinemaster.model.Chef;
import com.example.dinemaster.model.Restaurant;

/**
 * ChefRepository
 */
@Repository
public interface ChefRepository {

    ArrayList<Chef> getChefs();
    Chef getChefById(int id);
    Chef updateChef(int id, Chef chef);
    Chef addChef(Chef chef);
    void deleteChef(int id);
    Restaurant getChefRestaurant(int id);

}