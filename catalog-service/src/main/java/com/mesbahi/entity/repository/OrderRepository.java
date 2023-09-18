package com.mesbahi.entity.repository;

import com.mesbahi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findByCategory(String category);


}
