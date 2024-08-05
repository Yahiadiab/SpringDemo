package com.example.demo.Controller;


import com.example.demo.Service.ItemService;
import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Item")
public class ItemAPIController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public String addItem(@RequestBody Item item) {
        itemService.addItem(item);
        return "Success";
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();

    }

    @GetMapping
    public Item getItemById(@RequestParam int id) {
        return itemService.getItemById(id);

    }

    @DeleteMapping ("/{ItemId}")
    public String deleteItemById(@PathVariable int ItemId) {
        itemService.deleteItemById(ItemId);
        return "Success";
    }








}
