package cn.xin11.controller;

import cn.xin11.domain.Items;
import cn.xin11.service.ItemsService;
import cn.xin11.service.impl.ItemsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;


    @RequestMapping("/showDetail")
    public String findById(Model model){
        Items items = itemsService.findById(1);
        System.out.println(items);
        model.addAttribute("item",items);
        return "itemDetail";
    }

}
