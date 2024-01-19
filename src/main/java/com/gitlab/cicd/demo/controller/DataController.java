package com.gitlab.cicd.demo.controller;

import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

@RestController
@RequestMapping("/v1/api")
public class DataController {

	@GetMapping("/healthChk")
	public String healthCheck() {
		return "application is up and running";
	}

	@GetMapping("/nations")
	public JsonNode getRandomNations() {
		var objectMapper = new ObjectMapper();
		var faker = new Faker(new Locale("en-US"));
		var nations = objectMapper.createArrayNode();
		for (int i = 0; i < 10; i++) {
			var nation = faker.nation();
			nations.add(objectMapper.createObjectNode().put("nationality", nation.nationality())
					.put("capitalcity", nation.capitalCity()).put("flag", nation.flag())
					.put("language", nation.language()));
		}
		return nations;
	}

	@GetMapping("/commercies")
	public JsonNode getRandomCommerce() {
		var objectMapper = new ObjectMapper();
		var faker = new Faker(new Locale("en-US"));
		var commerceis = objectMapper.createArrayNode();
		for (int i = 0; i < 20; i++) {
			var commerce = faker.commerce();
			commerceis.add(objectMapper.createObjectNode()
					.put("color", commerce.color())
					.put("department", commerce.department())
					.put("productName", commerce.productName())
					.put("material", commerce.material())
					.put("price", commerce.price())
					.put("promotionCode", commerce.promotionCode()));
		}
		return commerceis;

	}
}
