package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.entity.ItemMania;
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
    @GetMapping("/getsignup")
    public String getSignUp(){
        log.info("moveSignUp()");

        return "htmlSignUp";
    }

    @PostMapping ("/postsignup")
    public String postiSignUp (ItemMania itemMania, Model model)
            throws Exception {
        log.info("postiSignUp()");
         // service.signupInfo(itemMania);
        model.addAttribute("msg", "SignUp Success!");
        return "htmlSignUpSuccess";
    }

    @PostMapping("/")
    public String moveRegister (String id, String pw, String nickname) throws Exception {
        log.info("moveRegister()");
//        log.info("id : " + id);
//        log.info("pw : " + pw);
//        log.info("nick : " +nickname);
        service.signupInfo(id, pw, nickname);

        return "htmlMain";
    }

//    @PostMapping("/itemList")
//    public String itemList (Item item, Model model) throws Exception {
//        log.info("itemList()");
//        model.addAttribute("list", service.list());
//        return "htmlItemList";
//    }

    @GetMapping("/myinfo")
    public String moveMyInfo (Model model) throws Exception {
        log.info("myinfo()");
        //model.addAttribute("list", service.list());

        return "htmlMyItem";
    }
}

