package com.infotrix.controller;

import com.infotrix.model.Currancy;
import com.infotrix.service.CurrancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CurrancyController
{
    @Autowired
    private CurrancyService services;

    //Convert The Currancy
    @GetMapping("/currency/{convertFrom}/{convertTo}/{qty}")
    public double getByExchangeRate
    (@PathVariable(value ="convertFrom")String convertFrom,
     @PathVariable(value ="convertTo")String convertTo,
     @PathVariable(value ="qty") double qty)
    {
        return   services.getByExchangeRate(convertFrom,convertTo,qty);
    }

    // Add New Currancy
    @PostMapping("/currancy")
    public void addNewCurrancy(@RequestBody Currancy currency)
    {
        services.addNewCurrancy(currency);
    }

    // View Existing Currancy
    @GetMapping("/currancy")
    public List<Currancy> getAllCurrancies()
    {
        return services.getAllCurrancies();
    }

    // Update  Existing Currancy
    @PutMapping("/currancy/{id}")
    public void updateCurrancyDetailsById(@PathVariable(value = "id") int id, @RequestBody Currancy curr)
    {
        services.updateCurrancyDetailsById(id, curr);
    }

    // Show ur fav currancy
    @GetMapping ("/currancy/{id}")
    public Currancy getCurrancyById(@PathVariable(value = "id") int id)
    {
        return services.getCurrancyById(id);
    }

}
