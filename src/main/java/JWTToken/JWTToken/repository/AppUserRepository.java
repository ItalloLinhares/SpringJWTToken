package JWTToken.JWTToken.repository;

import JWTToken.JWTToken.model.AppUser;
import JWTToken.JWTToken.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByusername(String username);}
