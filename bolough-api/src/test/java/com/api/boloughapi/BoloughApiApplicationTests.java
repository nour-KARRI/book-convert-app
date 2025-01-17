package com.api.boloughapi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoloughApiApplicationTests {

	@Test
	@DisplayName("")
	@EnabledOnOs(OS.WINDOWS)
	void contextLoads() {
	}

}
