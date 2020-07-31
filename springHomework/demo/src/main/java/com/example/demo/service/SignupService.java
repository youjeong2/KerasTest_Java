package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.entity.ItemMania;

import java.util.List;

// 인터페이스(인간특성) -> 클래스(사람들)
public interface SignupService {
    public void signupInfo(String id, String pw, String nick) throws Exception;
     public List<ItemMania> list() throws Exception;


}
