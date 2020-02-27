package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.User;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


public class MealTestData {

    public static final Meal meal1 = new Meal(100002,LocalDateTime.of(2020,Month.JANUARY,30,12,55),"Ланч",100 );
    public static final Meal meal2 = new Meal(100003,LocalDateTime.of(2020,Month.JANUARY,30,14,55),"Обед",500 );
    public static final Meal meal3 = new Meal(100004,LocalDateTime.of(2020,Month.JANUARY,30,16,55),"Ужин",500 );
    public static final Meal meal4 = new Meal(100005,LocalDateTime.of(2020,Month.JANUARY,31,12,55),"Ланч",100 );
    public static final Meal meal5 = new Meal(100006,LocalDateTime.of(2020,Month.JANUARY,31,14,55),"Обед",500 );
    public static final Meal meal6 = new Meal(100007,LocalDateTime.of(2020,Month.JANUARY,31,16,55),"Ужин",500 );

    public static void assertMatch(Meal actual, Meal expected) {
        assertThat(actual).isEqualToIgnoringGivenFields(expected, "registered", "roles");
    }

    public static void assertMatch(Iterable<Meal> actual, Meal... expected) {
        assertMatch(actual, Arrays.asList(expected));
    }

    public static void assertMatch(Iterable<Meal> actual, Iterable<Meal> expected) {
        assertThat(actual).isEqualTo(expected);
    }


}
