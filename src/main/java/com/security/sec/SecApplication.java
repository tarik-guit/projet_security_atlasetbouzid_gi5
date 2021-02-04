package com.security.sec;

import com.security.sec.securitycontroller.AuthController;
import com.security.sec.securitymodels.ERole;
import com.security.sec.securitymodels.Role;
import com.security.sec.securitymodels.repositories.Rolerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecApplication implements CommandLineRunner {
@Autowired
private Rolerepo repc;
    @Autowired
    private AuthController u;


    public static void main(String[] args) {
        SpringApplication.run(SecApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Role role =new Role(1, ERole.ROLE_USER);
        Role role2 =new Role(2, ERole.ROLE_ADMIN);
        repc.save(role);
        repc.save(role2);
        u.ajouteradmin();
    }
}
