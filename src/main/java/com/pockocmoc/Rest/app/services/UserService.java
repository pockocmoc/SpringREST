package com.pockocmoc.Rest.app.services;


import com.pockocmoc.Rest.app.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // @Autowired
    private NotificationService notificationService;

    // Внедрение зависимости через конструктор
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public User createUser(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);


        notificationService.notifyUser(user);

        return user;
    }
}
