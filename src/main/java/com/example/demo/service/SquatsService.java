package com.example.demo.service;

import com.example.demo.dto.BmrTdeeDto;
import com.example.demo.dto.MacrosDto;
import com.example.demo.dto.MacrosRequestDto;
import com.example.demo.dto.MeasurementsDto;
import com.example.demo.enums.DietType;
import com.example.demo.enums.LifeStyle;
import com.example.demo.enums.Sex;
import org.springframework.stereotype.Service;

/**
 * Created by rahulb on 6/11/17.
 */
@Service
public class SquatsService {
    public BmrTdeeDto getMeasurement(MeasurementsDto measurementsDto) {
        double bmr = 0.1f;
        Float leanWeight = measurementsDto.getWeightInKilo() - measurementsDto.getBodyFatPercentage()*measurementsDto.getWeightInKilo()/100;

        if ( measurementsDto.getSex() == Sex.women ) {
            bmr = 655 + (9.6 * leanWeight)+ (1.8 * measurementsDto.getHeightInCm()) - (4.7* measurementsDto.getAge() );
        }else{
            bmr = 66 + (13.7 * leanWeight)+ (5 * measurementsDto.getHeightInCm()) - (6.8* measurementsDto.getAge() );
        }

        double tdee = bmr ;
        if ( measurementsDto.getLifeStyle() == LifeStyle.sedentary){
            tdee *=1.2;
        }
        if (measurementsDto.getLifeStyle() == LifeStyle.lightly_active){
            tdee *=1.375 ;
        }
        if ( measurementsDto.getLifeStyle() == LifeStyle.moderately_active){
            tdee *=1.55 ;
        }
        if ( measurementsDto.getLifeStyle() == LifeStyle.very_active){
            tdee *= 1.725;
        }
        return new BmrTdeeDto(
            bmr,
            tdee
        );
    }

    public MacrosDto getMacros(MacrosRequestDto macrosRequestDto) {
    //      b (25:45:30) c:p:F
        if ( macrosRequestDto.getDietType() == DietType.LOW_CARB){
            // 25 *4*x + 45*4*x + 30*9*x =
            int totalCalories = macrosRequestDto.getCalories();
            Double x = 0.0 + totalCalories/(25*4 + 45*4 + 30*9.0  );
            return new MacrosDto( x * 25,x*45, x*30 );
        }
        if ( macrosRequestDto.getDietType() == DietType.KETO){
            //            (5:35:60 ) ,,
            int totalCalories = macrosRequestDto.getCalories();
            Double x = 0.0 + totalCalories/(5*4 + 35*4 + 60*9.0  );
            return new MacrosDto( x * 5,x*35, x*60 );

        }
        if ( macrosRequestDto.getDietType() == DietType.ZONE_DIET){
            //           (40:30:30)
            int totalCalories = macrosRequestDto.getCalories();
            Double x = 0.0 + totalCalories/(40*4 + 30*4 + 30*9.0  );
            return new MacrosDto( x * 40,x*30, x*30 );
        }
        return new MacrosDto(0.0,0.0,0.0);
    }
}
