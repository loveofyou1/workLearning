package com.main.learn.designModel.createDesignModel.builder;

import com.main.learn.designModel.createDesignModel.builder.goods.ChickenBurger;
import com.main.learn.designModel.createDesignModel.builder.goods.Coke;
import com.main.learn.designModel.createDesignModel.builder.goods.Pepsi;
import com.main.learn.designModel.createDesignModel.builder.goods.VegBurger;
import com.main.learn.designModel.createDesignModel.builder.meal.Meal;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItems(new VegBurger());
        meal.addItems(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItems(new ChickenBurger());
        meal.addItems(new Pepsi());
        return meal;
    }
}
