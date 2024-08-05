package com.example.demo.Service;

import com.example.demo.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ItemService implements ItemInterface {

    private List<Item> items = new ArrayList<>();


    @Override
    public Item addItem(Item item) {
        items.add(item);
        return item;

    }

    @Override
    public Item getItemById(Integer ItemId) {
        for (Item item : items) {
            if ( item.getItemId() == ItemId ){
                return item;
            }return null;
        }

        return null;
    }

    @Override
    public List<Item> getAllItems() {

        return new ArrayList<>(items);
    }

    @Override
    public void deleteItemById(Integer ItemID) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemId() == ItemID) {
                items.remove(i);

                i--;
            }
        }
    }
}
