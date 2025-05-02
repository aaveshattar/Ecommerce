package com.java.ecommerce.service;

import com.java.ecommerce.model.User;

public interface UserService {

     User findUserByJwtToken(String jwt);
     
     User findUserByEmail(String email);
}
