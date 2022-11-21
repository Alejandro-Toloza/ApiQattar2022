package com.qatar.ApiMundialQatar.service;


import com.qatar.ApiMundialQatar.service.dto.user.login.LoginRequest;
import com.qatar.ApiMundialQatar.service.dto.user.login.LoginResponse;
import com.qatar.ApiMundialQatar.service.dto.user.register.RegisterUserRequest;
import com.qatar.ApiMundialQatar.service.dto.user.register.RegisteredUserResponse;

public interface UserService {
    RegisteredUserResponse create(RegisterUserRequest user);
    LoginResponse login(LoginRequest loginRequest);
}
