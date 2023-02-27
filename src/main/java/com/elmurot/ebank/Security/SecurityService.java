package com.elmurot.ebank.Security;

import com.elmurot.ebank.Security.AppRole.AppRole;
import com.elmurot.ebank.Security.AppUser.AppUser;

import java.util.List;

public interface SecurityService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username, String roelName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();

}
