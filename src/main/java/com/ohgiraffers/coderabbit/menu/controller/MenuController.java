package com.ohgiraffers.coderabbit.menu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @GetMapping("/menuList")
    public String menuList() {
        return "menuList 메소드를 호출함.🙈";
    }
}
