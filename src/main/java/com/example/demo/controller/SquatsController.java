package com.example.demo.controller;

import com.example.demo.dto.BmrTdeeDto;
import com.example.demo.dto.MacrosDto;
import com.example.demo.dto.MacrosRequestDto;
import com.example.demo.dto.MeasurementsDto;
import com.example.demo.service.SquatsService;
import org.jcp.xml.dsig.internal.MacOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rahulb on 6/11/17.
 */
@RestController
public class  SquatsController  {
    @Autowired
    private SquatsService squatsService;

    @RequestMapping(value = "/measure",method = RequestMethod.POST)
    public BmrTdeeDto getMeasurements(@RequestBody MeasurementsDto measurementsDto){
        return squatsService.getMeasurement(measurementsDto);
    }

    @RequestMapping(value = "/macros",method = RequestMethod.POST)
    public MacrosDto getMacros(@RequestBody MacrosRequestDto macrosRequestDto){
        return squatsService.getMacros(macrosRequestDto);
    }
}
