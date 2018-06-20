package com.jrr.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;

import com.jrr.delivery.model.Order;
import com.jrr.delivery.repository.OrderRepository;

public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Order save(@Validated Order order){
		return orderRepository.save(order);
	}
	
	public Order findById(Integer id){
		return orderRepository.findOne(id);
	}
	
	public Iterable<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public void delete(Integer id){
		orderRepository.delete(id);
	}

}
