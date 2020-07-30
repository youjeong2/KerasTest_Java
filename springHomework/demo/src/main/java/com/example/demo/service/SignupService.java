package com.example.demo.service;

import com.example.demo.entity.ItemMania;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SignupService {
    public void signupInfo(String id, String pw, String nick);
    // public List<ItemMania> list() throws Exception;

}
