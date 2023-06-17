package com.dev.ums.service;

import com.dev.ums.dto.UserRegistrationDto;
import com.dev.ums.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);

}
