package com.example.demo.controller;

import com.example.demo.service.SignupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemManiaController {
    static final Logger log =
            LoggerFactory.getLogger(ItemManiaController.class);

    @Autowired
    SignupService service;

    @GetMapping("/")
    public String moveIndex(){
        log.info("moveIndex()");

        return "htmlMain";
    }
    @GetMapping("/signup")
    public String moveSignUp(){
        log.info("moveSignUp()");

        return "htmlSignUp";
    }

    @PostMapping("/")
    public String moveRegister (String id, String pw, String nickname){
        log.info("moveRegister()");
//        log.info("id : " + id);
//        log.info("pw : " + pw);
//        log.info("nick : " +nickname);
        service.signupInfo(id, pw, nickname);

        return "htmlMain";
    }

    @GetMapping("/list")
    public String movelist (Model model) throws Exception {
        log.info("list()");
        //model.addAttribute("list", service.list());

        return "htmlItemList";
    }
    @GetMapping("/myinfo")
    public String moveMyInfo (Model model) throws Exception {
        log.info("myinfo()");
        //model.addAttribute("list", service.list());

        return "htmlMyItem";
    }
    @GetMapping("/itemlist")
    public String moveItemList (Model model) throws Exception {
        log.info("moveItemList()");
        //model.addAttribute("list", service.list());

        return "htmlItemList";
    }
    @PostMapping("/itemregister")
    public String itemRegister //(String id, String name, String price)
                                                     throws Exception {
        log.info("itemRegister()");
        service.itemRegister(id, name, price);

        return "htmlItemRegister";
    }

}
