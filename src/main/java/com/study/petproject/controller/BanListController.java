package com.study.petproject.controller;

import com.study.petproject.dao.BanList;
import com.study.petproject.service.BanListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Mariia_Lukianets on 22.09.2015.
 */
@Controller
@RequestMapping("/banlist")
public class BanListController {
    @Autowired
    private BanListService banListService;

    /**
     * @return All ban lists, stored in data storage
    */
    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String showAll(Model model) {
        List<BanList> banLists = banListService.getAllBanLists();
        model.addAttribute("listName", banLists.get(0).getName());
        return "all-ban-lists";
    }


    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public String create() {
        return "create-ban-list";
    }

    @RequestMapping(path = "/create",method = RequestMethod.POST)
    public void save(@RequestParam(name = "listName") String listName, Model model) {

    }
}
