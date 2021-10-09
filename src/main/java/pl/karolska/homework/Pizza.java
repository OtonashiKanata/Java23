package pl.karolska.homework;

import java.util.List;

public class Pizza {

    private final boolean isVegetarian;
    private final List<Ingredients> ingredients;
    private final int kcal;
    private final String pizzaName;

    public Pizza(boolean isVegetarian, List<Ingredients> ingredients, int kcal, String name) {
        this.isVegetarian = isVegetarian;
        this.ingredients = ingredients;
        this.kcal = kcal;
        this.pizzaName = name;

    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public int getKcal() {
        return kcal;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    @Override
    public String toString() {
        return "Pizza: " + pizzaName + ", is it vegetarian?: " + isVegetarian + ", ingredients?: " + ingredients + ", calories?: " + kcal;

    }
}