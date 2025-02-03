package com.example.EsercizioLunedi.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topping {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double prezzo;
    private int calorie;

}
