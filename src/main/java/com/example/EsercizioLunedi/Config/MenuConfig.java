package com.example.EsercizioLunedi.Config;

import com.example.EsercizioLunedi.Entity.Menu;
import com.example.EsercizioLunedi.Entity.Pizza;
import com.example.EsercizioLunedi.Entity.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MenuConfig {

    @Bean
    public List<Pizza> listaPizze() {
        Pizza margherita = new Pizza("Pizza Margherita", 8, 99,new ArrayList<>());
    }

    // @Bean
    //  public Menu ConfiguraMenu(){

    // Menu menu=new Menu();
    // menu.
    // }
}
