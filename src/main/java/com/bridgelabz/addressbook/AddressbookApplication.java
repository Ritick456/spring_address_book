package com.bridgelabz.addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@Slf4j
@SpringBootApplication
public class AddressbookApplication {

	public static void main(String[] args) {

		SpringApplication.run(AddressbookApplication.class, args);
		ApplicationContext Context = SpringApplication.run(AddressbookApplication.class, args);
		log.info("AddressBook app is started in {} Environment", Context.getEnvironment().getProperty("environment"));
	}

}
