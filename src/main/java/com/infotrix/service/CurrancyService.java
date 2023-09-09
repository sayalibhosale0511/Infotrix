package com.infotrix.service;

import com.infotrix.model.Currancy;
import com.infotrix.repositary.CurrancyRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrancyService
{
    @Autowired
    private CurrancyRepositary repositary;

    //Convert The Currancy
    public double getByExchangeRate (String convertFrom, String convertTo,double qty)
    {
        double exchangeRate= repositary.getByExchangeRate(convertFrom,convertTo);
        return exchangeRate*qty;
    }

    //Add New Currancy
    public void addNewCurrancy(Currancy currency)
    {
        repositary.save(currency);
    }

    //View Existing Currancy
    public List<Currancy> getAllCurrancies()
    {
        List <Currancy> currancyList=repositary.findAll();
        return currancyList;
    }

    //update Existing Currancy
    public void updateCurrancyDetailsById(int id, Currancy curr)
    {
        repositary.save(curr);
    }

    //view or display fav. currancy
    public Currancy getCurrancyById(int id)
    {
        Currancy currancy=repositary.findById(id).orElse(null);
        return currancy;
    }


}
