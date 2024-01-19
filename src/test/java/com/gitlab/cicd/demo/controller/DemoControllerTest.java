package com.gitlab.cicd.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoControllerTest {

	@Autowired
	DataController dataController;

	@Test
	void healthCheck() {
		assertEquals("application is up and running", dataController.healthCheck());
	}

	@Test
	void nationsLength() {
		Integer nationsLngth = dataController.getRandomNations().size();
		assertEquals(10, nationsLngth);
	}

	@Test
	void commerceLength() {
		Integer commerceLngth = dataController.getRandomCommerce().size();
		assertEquals(20, commerceLngth);
	}

}
