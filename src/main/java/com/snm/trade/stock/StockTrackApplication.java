package com.snm.trade.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StockTrackApplication {
	public static void main(String[] args) {
		SpringApplication.run(StockTrackApplication.class, args);
	}
}