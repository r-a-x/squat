package com.example.demo.dto;

import java.io.Serializable;

/**
 * Created by rahulb on 6/11/17.
 */
public class MacrosDto implements Serializable {
    private Double carbs;
    private Double fats;
    private Double protiens;

    public MacrosDto() {
    }

    public MacrosDto(Double carbs, Double protiens,Double fats) {
        this.carbs = carbs;
        this.fats = fats;
        this.protiens = protiens;
    }

    public Double getCarbs() {
        return carbs;
    }

    public void setCarbs(Double carbs) {
        this.carbs = carbs;
    }

    public Double getFats() {
        return fats;
    }

    public void setFats(Double fats) {
        this.fats = fats;
    }

    public Double getProtiens() {
        return protiens;
    }

    public void setProtiens(Double protiens) {
        this.protiens = protiens;
    }
}
