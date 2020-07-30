package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.repository.itemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class itemServiceImpl implements itemService{

    @Autowired
    private itemRepo itemRepository;

    @Override
    public void register(Item itemMania)
}
