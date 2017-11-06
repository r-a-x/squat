package com.example.demo.dto;

import com.example.demo.enums.DietType;

import java.io.Serializable;

/**
 * Created by rahulb on 6/11/17.
 */
public class MacrosRequestDto implements Serializable{
    private int calories;
    private DietType dietType;

    public MacrosRequestDto() {
    }

    public MacrosRequestDto(int calories, DietType dietType) {
        this.calories = calories;
        this.dietType = dietType;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public DietType getDietType() {
        return dietType;
    }

    public void setDietType(DietType dietType) {
        this.dietType = dietType;
    }
}
