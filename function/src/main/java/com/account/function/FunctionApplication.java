package com.account.function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Function;

@SpringBootApplication
public class FunctionApplication {

	private static final Logger logger = LoggerFactory.getLogger(FunctionApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(FunctionApplication.class, args);
	}

	@Bean
	public Function<Message<Account>, String> process() {
		return accountMessage -> {
			logger.info(accountMessage.getPayload().getId());
			logger.info(accountMessage.getHeaders().get("solace_destination").toString());
			return accountMessage.getPayload().getFirstName();
		};
	}
	
}
