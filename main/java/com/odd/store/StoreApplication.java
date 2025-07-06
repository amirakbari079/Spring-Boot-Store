package com.odd.store;

import com.odd.store.entities.Address;
import com.odd.store.entities.Profile;
import com.odd.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder().name("amir").email("email").password("password").build();
        var address= Address.builder().street("street").city("city").zip("zip").build();
        var profile= Profile.builder().name("profile").bio("bio").build();


        System.out.println(user);

    }

}
