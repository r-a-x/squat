package com.example.demo.dto;

import com.example.demo.enums.LifeStyle;
import com.example.demo.enums.Sex;

import java.io.Serializable;

/**
 * Created by rahulb on 6/11/17.
 */

public class MeasurementsDto implements Serializable {

    private Float age;
    private Float weightInKilo;
    private Float heightInCm;
    private Float bodyFatPercentage;
    private Sex sex;
    private LifeStyle lifeStyle;

    public MeasurementsDto() {
    }

    public MeasurementsDto(Float age, Float weightInKilo, Float heightInCm, Float bodyFatPercentage, Sex sex, LifeStyle lifeStyle) {
        this.age = age;
        this.weightInKilo = weightInKilo;
        this.heightInCm = heightInCm;
        this.bodyFatPercentage = bodyFatPercentage;
        this.sex = sex;
        this.lifeStyle = lifeStyle;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public Float getWeightInKilo() {
        return weightInKilo;
    }

    public void setWeightInKilo(Float weightInKilo) {
        this.weightInKilo = weightInKilo;
    }

    public Float getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(Float heightInCm) {
        this.heightInCm = heightInCm;
    }

    public Float getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(Float bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public LifeStyle getLifeStyle() {
        return lifeStyle;
    }

    public void setLifeStyle(LifeStyle lifeStyle) {
        this.lifeStyle = lifeStyle;
    }
}
