package com.account.supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.function.Supplier;

@SpringBootApplication
public class AccountSupplier {


	public static void main(String[] args) {
		SpringApplication.run(AccountSupplier.class, args);
	}

	@Bean
	public Supplier<Account> publish() {
		return () -> new Account("123", "Andrew", "Roberts");
	}

}

