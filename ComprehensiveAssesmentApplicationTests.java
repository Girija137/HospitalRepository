package com.comprehensive.comprehensiveassesment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ComprehensiveAssesmentApplicationTests {

	@BeforeAll
	void beforeAll() {
		System.out.println("Initialize Connection to database");
	}
	
	@AfterAll
	void afterAll() {
		System.out.println("Close Connection to database");
	}
	
	@BeforeEach
	void beforeEach(TestInfo ino) {
		System.out.println("Initialize Test Data for each test");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Clean up Test Data");
	}
	
	
	
	@Test
	void toUpperCase() {
		String str="abcd";
		String result=str.toUpperCase();
		assertNotNull(result);
		assertEquals("ABCD",result);
	}
	
	

}
