package com.infotrix.repositary;

import com.infotrix.model.Currancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CurrancyRepositary extends JpaRepository<Currancy,Integer>
{
     //To Fetch Exchange rate of Currancy
     @Query("select c.exchangeRate from Currancy c where c.convertFrom=:convertFrom and c.convertTo=:convertTo")
     double getByExchangeRate(@Param("convertFrom") String convertFrom, @Param("convertTo") String convertTo);

}
