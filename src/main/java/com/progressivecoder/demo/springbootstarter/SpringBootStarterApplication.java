package com.progressivecoder.demo.springbootstarter;

import com.progressivecoder.demo.springbootstarter.entities.Mobile;
import com.progressivecoder.demo.springbootstarter.repositories.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.UUID;

@SpringBootApplication
public class SpringBootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterApplication.class, args);
	}

}

@Component
class DemoCommandLineRunner implements CommandLineRunner{

	@Autowired
	private MobileRepository mobileRepository;

	@Override
	public void run(String... args) throws Exception {

		Mobile apple = new Mobile();
		apple.setId(UUID.randomUUID());
		apple.setMobileIMEI("Reg#1234");
		apple.setMake("Apple");
		apple.setModel("12 Pro");

		mobileRepository.save(apple);

		Mobile samsung = new Mobile();
		samsung.setId(UUID.randomUUID());
		samsung.setMobileIMEI("Reg#6789");
		samsung.setMake("Samsung");
		samsung.setModel("S12");

		mobileRepository.save(samsung);
	}
}

