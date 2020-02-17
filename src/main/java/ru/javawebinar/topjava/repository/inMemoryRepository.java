package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.util.MealsUtil;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class inMemoryRepository implements mealRepository {
    private List<Meal> meal;
    AtomicInteger idx;

    public inMemoryRepository() {
        meal = MealsUtil.meals;
        this.idx = new AtomicInteger(meal.size());
    }

    @Override
    public void addMeal(Meal meal) {
        if (meal != null) {
            this.meal.add(meal);
            idx.getAndAdd(1);
        }
    }

    @Override
    public void deleteMeal(int Id) {
        meal.remove(idx);
        idx.getAndDecrement();
    }

    @Override
    public void updateMeal(Meal meal) {
    }

    @Override
    public List<Meal> getAllMeal() {
        return meal;
    }
}
