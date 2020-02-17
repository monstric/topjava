package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.MealTo;

import java.util.List;

public interface mealRepository {
    public void addMeal(Meal meal);
    public void deleteMeal(int Id) ;
    public void updateMeal(Meal meal);
    public List<Meal> getAllMeal();
}
