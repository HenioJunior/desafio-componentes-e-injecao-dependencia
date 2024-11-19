package com.henio.desafio;

import com.henio.desafio.entities.Order;
import com.henio.desafio.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dados do pedido: ");
		System.out.println("Código:");
		int code = sc.nextInt();
		System.out.println("Valor básico:");
		double basic = sc.nextDouble();
		System.out.println("Porcentagem de desconto:");
		double discount = sc.nextDouble();
		Order order = new Order(code, basic, discount);


		orderService.total(order);


	}
}
