package com.study.petproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Mariia_Lukianets on 22.09.2015.
 */
@Controller
@RequestMapping("/banlist")
public class BanListController {
    @RequestMapping(method = RequestMethod.GET)
    public String showForm() {
        return "create-ban-list";
    }

    @RequestMapping(method = RequestMethod.POST)
    public void saveBanList(@RequestParam(name = "listName") String listName, Model model) {

    }
}
