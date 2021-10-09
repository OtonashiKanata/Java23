package pl.karolska.homework;

import java.util.*;

public class MainPizza {
    public static void main(String[] args) {

        List<Pizza> pizzas = Arrays.asList(
                new Pizza(true, Arrays.asList(Ingredients.MUSHROOM), 2111, "Funghi"),
                new Pizza(false, Arrays.asList(Ingredients.CELERY, Ingredients.SALAMI), 2222, "Green pizza"),
                new Pizza(false, Arrays.asList(Ingredients.MOZZARELLA, Ingredients.ONION), 2333, "Cheesy"),
                new Pizza(false, Arrays.asList(Ingredients.TOMATO), 2444, "Italian"),
                new Pizza(false, Arrays.asList(Ingredients.CELERY, Ingredients.PEPPER), 2555, "Vegetarian green pizza"),
                new Pizza(true, Arrays.asList(Ingredients.PEPPER, Ingredients.ONION), 2666, "Jalapeno"),
                new Pizza(false, Arrays.asList(Ingredients.CELERY, Ingredients.MOZZARELLA, Ingredients.SALAMI), 2777, "Uno dos tres"),
                new Pizza(false, Arrays.asList(Ingredients.SALAMI, Ingredients.SALAMI, Ingredients.PEPPER, Ingredients.ONION), 2888, "Diablo"),
                new Pizza(true, Arrays.asList(Ingredients.MUSHROOM, Ingredients.PEPPER, Ingredients.ONION), 2999, "Vegetariano"),
                new Pizza(false, Arrays.asList(Ingredients.MUSHROOM, Ingredients.SALAMI, Ingredients.ONION, Ingredients.MOZZARELLA, Ingredients.CELERY, Ingredients.PEPPER, Ingredients.TOMATO), 3000, "Pizza challenge")

    );

        PizzaChecker pizzaChecker = new PizzaChecker(pizzas);

        System.out.println("Vegetarian pizzas: ");
        pizzaChecker.getVegetarianPizzas();

        System.out.println("\n" + "Pizzas with allergens (celery): ");
        pizzaChecker.getPizzasWithAllergens();

        System.out.println("\n" + "Is there at least one vegetarian pizza with tomato and pepper?");
        System.out.println(pizzaChecker.getVegetarianPizzaWithTomatoAndPepper());

        System.out.println("\n" + "Do all pizzas have mozzarella?");
        System.out.println(pizzaChecker.getPizzasWithMozzarella());

        System.out.println("\n" + "The most calorie rich pizza is: ");
        System.out.println(pizzaChecker.getHighestCaloriePizza());

        System.out.println("\n" + "The least calorie rich pizza is: ");
        System.out.println(pizzaChecker.getLowestCaloriePizza());
    }
}
