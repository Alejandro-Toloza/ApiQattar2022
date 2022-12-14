package com.qatar.ApiMundialQatar.controller;


import com.qatar.ApiMundialQatar.service.TeamService;
import com.qatar.ApiMundialQatar.service.dto.team.TeamResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("worldcup/teams")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public TeamResponse findAll(@RequestHeader( name = "x-token") String token) {
      return this.teamService.findAll(token);
    }

}
