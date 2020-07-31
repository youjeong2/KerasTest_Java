package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepo itemRepository;

    @Override
    public void ItemRegister(Item item ) throws Exception {
        itemRepository.create(item);
    }
    @Override
    public List<Item> list() throws Exception {
        return itemRepository.list();
    }
}
