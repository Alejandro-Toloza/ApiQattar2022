package com.qatar.ApiMundialQatar.service.dto.user.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qatar.ApiMundialQatar.service.dto.user.register.RegisteredDataUser;
import lombok.Data;

@Data
public class LoginResponse {

    private String status;
    @JsonProperty("data")
    private RegisteredDataUser registeredDataUser;
}
