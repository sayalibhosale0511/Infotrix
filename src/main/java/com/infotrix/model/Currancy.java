package com.infotrix.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name="currancy_converter")

public class Currancy
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="convert_from")
    private String convertFrom;
    @Column(name="convert_to")
    private String convertTo;
    @Column(name="exchange_rate")
    private double exchangeRate;

}

