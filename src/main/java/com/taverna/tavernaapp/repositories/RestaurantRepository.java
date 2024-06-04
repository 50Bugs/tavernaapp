package com.taverna.tavernaapp.repositories;

import com.taverna.tavernaapp.domain.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
}
