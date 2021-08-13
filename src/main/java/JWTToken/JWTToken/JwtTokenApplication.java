package JWTToken.JWTToken;

import JWTToken.JWTToken.model.AppUser;
import JWTToken.JWTToken.model.Role;
import JWTToken.JWTToken.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class JwtTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtTokenApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	@Bean
	CommandLineRunner run(UserService userService) {
		return arg -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));


			userService.saveAppUser(new AppUser(null, "Itallo Linhares", "Itallo", "123", new ArrayList<>()));
			userService.saveAppUser(new AppUser(null, "Eduardo Pereira", "Eduardo", "123", new ArrayList<>()));
			userService.saveAppUser(new AppUser(null, "Nicolas Andalaft", "Nicolas", "123", new ArrayList<>()));
			userService.saveAppUser(new AppUser(null, "Victor Bitencourt", "Victor", "123", new ArrayList<>()));


			userService.addRoleToUser("Itallo", "ROLE_USER");
			userService.addRoleToUser("Itallo", "ROLE_MANAGER");
			userService.addRoleToUser("Eduardo", "ROLE_MANAGER");
			userService.addRoleToUser("Nicolas", "ROLE_MANAGER");
			userService.addRoleToUser("Nicolas", "ROLE_ADMIN");
			userService.addRoleToUser("Nicolas", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("Victor", "ROLE_SUPER_ADMIN");

		};
	}
}
