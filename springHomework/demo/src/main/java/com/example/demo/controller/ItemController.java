package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.entity.ItemMania;
import com.example.demo.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// Register
@Controller
public class ItemController {

    private static Logger log = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService service;

    @GetMapping("/getitemRegister")
    public String getitemRegister (Item item, Model model)
                                                     throws Exception {
        log.info("getitemRegister()");
        return "htmlItemRegister";
    }

    @PostMapping ("/postitemRegister")
    public String postitemRegister (Item item, Model model)
            throws Exception {
        log.info("postitemRegister()");
        service.ItemRegister(item);
        model.addAttribute("msg", "Register Success!");
        return "htmlItemSuccess";
    }

    @PostMapping("/itemList")
    public String itemList (Item item, Model model) throws Exception {
        log.info("itemList()");
        model.addAttribute("list", service.list());
        return "htmlItemList";
    }

}
