package pl.karolska.homework;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class PizzaChecker {
    private final List<Pizza> pizzas;

    public PizzaChecker(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void getVegetarianPizzas() {
        pizzas.stream()
                .filter(Pizza::isVegetarian)
                .forEach(System.out::println);
    }

    public void getPizzasWithAllergens() {
        pizzas.stream()
                .filter(p -> p.getIngredients().contains(Ingredients.CELERY))
                .forEach(System.out::println);
    }

    public boolean getVegetarianPizzaWithTomatoAndPepper() {
        return pizzas.stream()
                .filter(Pizza::isVegetarian)
                .anyMatch(p -> p.getIngredients().contains(Ingredients.CELERY) && p.getIngredients().contains(Ingredients.PEPPER));
    }

    public boolean getPizzasWithMozzarella() {
        return pizzas.stream()
                .allMatch(p -> p.getIngredients().contains(Ingredients.MOZZARELLA));
    }

    public Pizza getHighestCaloriePizza() {
        return pizzas.stream()
                .max(Comparator.comparing(Pizza::getKcal))
                .orElseThrow(NoSuchElementException::new);
    }

    public Pizza getLowestCaloriePizza() {
        return pizzas.stream()
                .min(Comparator.comparing(Pizza::getKcal))
                .orElseThrow(NoSuchElementException::new);
    }
}