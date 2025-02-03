package com.example.EsercizioLunedi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double prezzo;
    @OneToMany
    private List<Topping> toppings = new ArrayList<>();

    public void aggiungiTopping(Topping topping) {
        toppings.add(topping);
    }

}
