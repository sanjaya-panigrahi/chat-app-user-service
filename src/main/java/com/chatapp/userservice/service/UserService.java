package com.chatapp.userservice.service;

import com.chatapp.userservice.dto.UserRequest;
import com.chatapp.userservice.entity.User;
import com.chatapp.userservice.repository.UserRepository;
import com.chatapp.userservice.util.GenericUtility;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String saveUser(UserRequest userRequest){
        User user = GenericUtility.mapDTOToEntity(userRequest);
        User userSaved = userRepository.save(user);
        log.info("The User Saved Successfully {}",userSaved);
        return userSaved.getUserName();
    }

}
