package com.qatar.ApiMundialQatar.service;

import com.qatar.ApiMundialQatar.service.dto.team.TeamResponse;


public interface TeamService {
  TeamResponse findAll(String token);
}
