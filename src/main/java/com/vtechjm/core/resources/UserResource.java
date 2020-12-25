package com.vtechjm.core.resources;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.vtechjm.core.services.IUserService;
import com.vtechjm.core.services.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Users")
public class UserResource {

    private IUserService userService;

   @Autowired
    public UserResource(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    User getUser() throws Exception {
        User user =  userService.getUser();
        return  user;
    }

}
