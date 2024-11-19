package com.henio.desafio.service;

import com.henio.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public static double calculateDiscount(Order order) {
        return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));
    }

    public void total(Order order) {
        System.out.println("Pedido código " + order.getCode());
        System.out.printf("Valor total: R$ %.2f %n", calculateDiscount(order) + shippingService.shipment(order));
    }
}
