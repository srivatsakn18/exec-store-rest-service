package com.grocery.store.services;

import com.grocery.store.entities.User;
import com.grocery.store.exceptions.AuthorizationException;
import com.grocery.store.exceptions.UserNotFoundException;
import com.grocery.store.models.AuthorizedUserDTO;
import com.grocery.store.repository.UserRepository;
import com.grocery.store.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    private UserRepository userRepository;

    public AuthorizedUserDTO authenticate(String userId, String password) throws AuthorizationException, UserNotFoundException{
        User user = userRepository.findbyUserId(userId);
        if( user == null)
            throw new UserNotFoundException("User Not found. Please register the user");
        else if(!(password.equals(user.getUserPassword())))
            throw new AuthorizationException("Password is incorrect");
        else {
            return new AuthorizedUserDTO(userId, JwtUtil.generateToken(userId), (long) 0);
        }

    }

}
