package com.example.demo.Service;

import com.example.demo.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  ItemInterface {


    Item addItem(Item item);

    Item getItemById(Integer ItemID);

    List<Item> getAllItems();

    void deleteItemById(Integer ItemID);





}
