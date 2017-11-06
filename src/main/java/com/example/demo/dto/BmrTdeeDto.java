package com.example.demo.dto;

import java.io.Serializable;

/**
 * Created by rahulb on 6/11/17.
 */
public class BmrTdeeDto implements Serializable {

    private Double bmr;
    private Double tdee;

    public BmrTdeeDto() {
    }

    public BmrTdeeDto(Double bmr, Double tdee) {
        this.bmr = bmr;
        this.tdee = tdee;
    }

    public Double getBmr() {
        return bmr;
    }

    public void setBmr(Double bmr) {
        this.bmr = bmr;
    }

    public Double getTdee() {
        return tdee;
    }

    public void setTdee(Double tdee) {
        this.tdee = tdee;
    }
}

