package com.example.demo.repository;

import com.example.demo.service.SignupServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SignupRepo {

    static final Logger log =
            LoggerFactory.getLogger(SignupRepo.class);

    @Autowired
    JdbcTemplate jdbc;

    public void signupInfo(String id, String pw, String nick){

        log.info("signupInfo repo");

        String query = "insert into Register (id, pw, nickname) values (?, ?, ?)";
        jdbc.update(query, id, pw, nick);
    }
}
