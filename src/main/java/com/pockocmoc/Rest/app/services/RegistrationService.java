package com.pockocmoc.Rest.app.services;

import com.pockocmoc.Rest.app.domain.User;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {


    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }


    private DataProcessingService dataProcessingService;

    private UserService userService;

    private NotificationService notificationService;

    public RegistrationService(DataProcessingService dataProcessingService, UserService userService, NotificationService notificationService) {
        this.dataProcessingService = dataProcessingService;
        this.userService = userService;
        this.notificationService = notificationService;
    }

    public void processRegistration(String name, int age, String email) {

        User user = userService.createUser(name, age, email);

        dataProcessingService.addUserToList(user);

    }


}
