package com.example.Jenkinsexp;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsexpApplicationTests {

	public static Logger log =LoggerFactory.getLogger(JenkinsexpApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Testing...");
		log.info("Testing by bala...");
		log.info("Testing by bala2..sucesss");
		log.info("Testing by bala2..PIPEline testing");
		assertEquals(true,true);
	}

}
