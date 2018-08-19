package com.main.designModel.builder;

import com.main.designModel.builder.goods.ChickenBurger;
import com.main.designModel.builder.goods.Coke;
import com.main.designModel.builder.goods.Pepsi;
import com.main.designModel.builder.goods.VegBurger;
import com.main.designModel.builder.meal.Meal;

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
