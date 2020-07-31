package com.example.demo.service;

import com.example.demo.entity.Item;

import java.util.List;

public interface ItemService {
    public void ItemRegister(Item item) throws Exception;
    public List<Item> list() throws Exception;

}
