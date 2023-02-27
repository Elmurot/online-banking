package com.elmurot.ebank.Security;

import com.elmurot.ebank.Security.AppRole.AppRole;
import com.elmurot.ebank.Security.AppRole.AppRoleRepository;
import com.elmurot.ebank.Security.AppUser.AppUser;
import com.elmurot.ebank.Security.AppUser.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class SecurityServiceImpl implements SecurityService {
    AppUserRepository appUserRepository;
    AppRoleRepository appRoleRepository;
    PasswordEncoder passwordEncoder;
    @Override
    public AppUser addNewUser(AppUser appUser) {
        String password  = appUser.getPassword();
        appUser.setPassword(passwordEncoder.encode(password));
        return appUserRepository.save(appUser);
    }

    @Override
    public AppRole addNewRole(AppRole appRole) {
        return appRoleRepository.save(appRole);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        appUserRepository.findByUsername(username).getAppRoles().add(appRoleRepository
                .findByRoleName(roleName));
    }

    @Override
    public AppUser loadUserByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }

    @Override
    public List<AppUser> listUsers() {
        return appUserRepository.findAll();
    }
}
