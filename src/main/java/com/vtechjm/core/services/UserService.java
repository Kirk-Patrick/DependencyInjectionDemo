package com.vtechjm.core.services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.vtechjm.core.UnirestConfig;
import com.vtechjm.core.services.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    public User getUser() throws Exception {

        UnirestConfig.initialize();
        HttpResponse<User> user = Unirest.get("https://api.mocki.io/v1/ce5f60e2").asObject(User.class);
        return user.getBody();

    }
}
