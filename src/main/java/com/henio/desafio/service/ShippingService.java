package com.henio.desafio.service;

import com.henio.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        double amount = OrderService.calculateDiscount(order);
        if(amount < 99.99) {
            return 20.00;
        } else if (amount < 199.99) {
            return 12.00;
        }
        return 0.0;
    }
}
