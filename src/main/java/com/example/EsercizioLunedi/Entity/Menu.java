package com.example.EsercizioLunedi.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Menu {
    private List<Pizza> pizze = new ArrayList<>();
    private List<Topping> toppings = new ArrayList<>();

}
