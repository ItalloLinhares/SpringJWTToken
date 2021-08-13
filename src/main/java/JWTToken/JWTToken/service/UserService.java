package JWTToken.JWTToken.service;

import JWTToken.JWTToken.model.AppUser;
import JWTToken.JWTToken.model.Role;

import java.util.List;

public interface UserService {
    AppUser saveAppUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getAppUser(String username);
    List<AppUser> getUsers();
}
