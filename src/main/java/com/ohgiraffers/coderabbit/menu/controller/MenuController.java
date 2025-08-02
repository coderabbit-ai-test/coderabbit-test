package com.ohgiraffers.coderabbit.menu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MenuController {

    private final List<String> menuList = new ArrayList<>();;

    public MenuController() {
        //menuList =
        menuList.add("Menu 1");
        menuList.add("Menu 2");
        menuList.add("Menu 3");
        menuList.add("Menu 4");
        menuList.add("Menu 5");
    }

    @GetMapping("/menuList")
    public String menuList() {
        return "menuList 메소드를 호출함.🙈";
    }

    @GetMapping("/menuCount")
    public int menuCount() {
        return menuList.size();
    }
}
