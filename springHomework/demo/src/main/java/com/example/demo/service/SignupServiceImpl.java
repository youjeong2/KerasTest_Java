package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.entity.ItemMania;
import com.example.demo.repository.SignupRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignupServiceImpl implements SignupService {

    static final Logger log =
            LoggerFactory.getLogger(SignupServiceImpl.class);

    @Autowired
    SignupRepo repo;

    @Override
    public void signupInfo(String id, String pw, String nick) {
        log.info("signupInfo");
        repo.signupInfo(id, pw, nick);
    }

    @Override
    public List<ItemMania> list() throws Exception {
        return null;
    }

}
