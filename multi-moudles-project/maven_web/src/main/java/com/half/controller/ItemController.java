package com.half.controller;

import com.half.domain.Item;
import com.half.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Hui-min Lu
 * @Date 2020/12/22 17:38
 * @Version 1.0
 * @Description
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Integer id, Model model) {
        Item item = itemService.findById(id);
        System.out.println(item);
        model.addAttribute("item", item);

        return "success";
    }
}
