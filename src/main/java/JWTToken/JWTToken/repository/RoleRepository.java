package JWTToken.JWTToken.repository;

import JWTToken.JWTToken.model.AppUser;
import JWTToken.JWTToken.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
        Role findByroleName(String username);
    }