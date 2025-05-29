package com.pfe.qualite.backend;

import com.pfe.qualite.backend.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	CommandLineRunner testEmail(MailService emailService) {
		return args -> {
			emailService.sendEmail(
					"chaabiy214@gmail.com",
					"✅ Test d'envoi de mail",
					"Ceci est un email envoyé depuis l'application Qualité."
			);
		};
	}
}
