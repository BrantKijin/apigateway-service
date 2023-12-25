package com.example.apigatewayservice.filter;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;



@Slf4j
public class CustomFilter {
	// public CustomFilter() {
	// 	super(Config.class);
	// }
	//
	// @Override
	// public GatewayFilter apply(Config config) {
	// 	// Custom Pre Filter
	// 	return (exchange, chain) -> {
	// 		ServerHttpRequest request = exchange.getRequest();
	// 		ServerHttpResponse response = exchange.getResponse();
	//
	// 		log.info("Custom PRE filter: request id -> {}", request.getId());
	//
	// 		// Custom Post Filter
	// 		return chain.filter(exchange).then(Mono.fromRunnable(() -> {
	// 			log.info("Custom POST filter: response code -> {}", response.getStatusCode());
	// 		}));
	// 	};
	// }
	//
	// public static class Config {
	// 	// Put the configuration properties
	// }
}