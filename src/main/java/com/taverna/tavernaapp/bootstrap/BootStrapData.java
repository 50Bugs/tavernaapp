package com.taverna.tavernaapp.bootstrap;

import com.taverna.tavernaapp.domain.Restaurant;
import com.taverna.tavernaapp.parsing.ParsingData;
import com.taverna.tavernaapp.repositories.RestaurantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
//@SuppressWarnings("unused")
public class BootStrapData implements CommandLineRunner {

    private final RestaurantRepository restaurantRepository;

    public BootStrapData(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        ArrayList<Restaurant> restaurants = ParsingData.parseFromDlabComUA();

        for(Restaurant r : restaurants){
            restaurantRepository.save(r);
            //System.out.println(r);
        }

        System.out.println(restaurantRepository.count());
    }
}
