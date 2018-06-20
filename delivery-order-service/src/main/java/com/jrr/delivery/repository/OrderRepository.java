package com.jrr.delivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.jrr.delivery.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {
	

}
