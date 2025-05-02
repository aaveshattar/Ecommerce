package com.java.ecommerce.service;

import com.java.ecommerce.model.User;

public interface UserService {

     User findUserByJwtToken(String jwt) throws Exception;
     
     User findUserByEmail(String email) throws Exception;
}
