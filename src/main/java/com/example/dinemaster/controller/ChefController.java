/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.dinemaster.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.dinemaster.model.Chef;
import com.example.dinemaster.model.Restaurant;
import com.example.dinemaster.service.ChefJpaService;

import net.bytebuddy.implementation.bytecode.Throw;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;





/**
 * ChefController
 */
@RestController
public class ChefController {
    @Autowired
    ChefJpaService chefService;

    @GetMapping("/restaurants/chefs")
    public ArrayList<Chef> getChefs() {
        return chefService.getChefs();
    }

    @GetMapping("/restaurants/chefs/{id}")
    public Chef getChef(@PathVariable("id") int id) {
        return chefService.getChefById(id);
    }
    

    @GetMapping("/chefs/{id}/restaurant")
    public Restaurant getChefRestaurant(@PathVariable("id") int id) {
        return chefService.getChefRestaurant(id);
    }
    
    @PostMapping("/restaurants/chefs") 
    public Chef addChef(@RequestBody Chef chef) {
        return chefService.addChef(chef);
    }

    @PutMapping("/restaurants/chefs/{id}")
    public Chef updateChef(@PathVariable("id") int id, @RequestBody Chef chef) {
        return chefService.updateChef(id, chef);
    }

    @DeleteMapping("/restaurants/chefs/{id}")
    public void deleteChef(@PathVariable("id") int id) {
        chefService.deleteChef(id);
        throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    }

    
}