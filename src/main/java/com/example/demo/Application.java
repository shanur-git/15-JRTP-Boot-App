package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	HashMap <String , Object> localCache = new HashMap<String , Object> HashMap();
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public void localCache(){
	
		//local caching logic
	
	}

}
