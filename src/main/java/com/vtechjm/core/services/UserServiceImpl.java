package com.vtechjm.core.services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
//import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.vtechjm.core.UnirestConfig;
import com.vtechjm.core.services.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  IUserService{
    @Override
    public User getUser() throws Exception {

        UnirestConfig.initialize();
       // Unirest.config().setObjectMapper(new JacksonObjectMapper());
        // .unirest.Unirest.config().setObjectMapper(new JacksonObjectM);
        HttpResponse<User> user = Unirest.get("https://api.mocki.io/v1/ce5f60e2").asObject(User.class);
        return user.getBody();

    }
}
