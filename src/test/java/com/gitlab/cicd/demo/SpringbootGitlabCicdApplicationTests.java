package com.gitlab.cicd.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootGitlabCicdApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void applicationContextTest() {
		SpringbootGitlabCicdApplication.main(new String[] {});
	}
}
