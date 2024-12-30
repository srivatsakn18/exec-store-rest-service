package com.grocery.store.services;

import com.grocery.store.entities.User;
import com.grocery.store.exceptions.ObjectNotFoundException;
import com.grocery.store.exceptions.UserNotFoundException;
import com.grocery.store.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User getUser(String userId) throws ObjectNotFoundException {
        User user = userRepository.findbyUserId(userId);
        if (user == null)
            throw new ObjectNotFoundException("User not Found");
        else
            return user;
    }
}
