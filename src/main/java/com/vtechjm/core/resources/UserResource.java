package com.vtechjm.core.resources;

import com.vtechjm.core.services.UserService;
import com.vtechjm.core.services.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Users")
class UserResource {
    private UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    User getUser() throws Exception {
        return userService.getUser();

    }

}
