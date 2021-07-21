package utils;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest extends Report{
	@BeforeTest
	void setData() {
			desc ="first test";
			author ="koushik";
			category="sanity";
	}	
	@Test
	void myTest(){
		System.out.println("Test begins");
		stepReport("pass", "some description");
		System.out.println("Test ends");
	}

}
