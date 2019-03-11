package com.neri.jwt.nerijwt;

import com.neri.jwt.nerijwt.model.User;
import com.neri.jwt.nerijwt.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class NerijwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(NerijwtApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			initUsers(userRepository, passwordEncoder);
		};

	}

	private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		User user = new User();



		user.setId(UUID.randomUUID().toString().toUpperCase());
		user.setEmail("rodrigogregorioneri@hotmail.com");
		user.setPassword(passwordEncoder.encode("admin"));

		User find = userRepository.findByEmail("rodrigogregorioneri@hotmail.com");
		if (find == null) {
			userRepository.save(user);
		}
	}

}
