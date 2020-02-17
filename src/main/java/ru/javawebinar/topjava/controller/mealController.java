package ru.javawebinar.topjava.controller;

import ru.javawebinar.topjava.model.MealTo;
import ru.javawebinar.topjava.repository.inMemoryRepository;
import ru.javawebinar.topjava.repository.mealRepository;

import java.util.List;

public class mealController {

    mealRepository repository = new inMemoryRepository();

    public void addMeal(MealTo meal) {
        repository.addMeal(meal);
    }

    public void deleteMeal(int Id) {
        repository.deleteMeal(Id);
    }

    public void updateMeal(MealTo meal) {
        repository.updateMeal(meal);
    }

    public List<MealTo> getAllMeal() {
       return repository.getAllMeal();
    }
}
