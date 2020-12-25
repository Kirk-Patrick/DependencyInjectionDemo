package com.vtechjm.core.services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.vtechjm.core.services.models.User;
import org.springframework.stereotype.Service;

public interface IUserService{

     User getUser() throws Exception;
}
