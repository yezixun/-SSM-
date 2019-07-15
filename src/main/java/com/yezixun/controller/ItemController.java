package com.yezixun.controller;

import com.yezixun.domain.Item;
import com.yezixun.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/showItem/{id}")
    public String showItem(@PathVariable(value = "id") int id,Model model){
        Item item = itemService.findById(id);
        model.addAttribute("item",item);
        return "success";
    }

}
