package com.main.learn.designModel.createDesignModel.builder.meal;

import com.main.learn.designModel.createDesignModel.builder.service.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItems(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }

        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item:" + item.name());
            System.out.print(",Packing:" + item.paching().pack());
            System.out.println(",Price" + item.price());
        }
    }
}
