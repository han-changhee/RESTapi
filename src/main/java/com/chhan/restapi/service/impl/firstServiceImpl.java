package com.chhan.restapi.service.impl;

import com.chhan.restapi.service.firstService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class firstServiceImpl implements firstService
{
    Map<String, Object> firstData = new HashMap<>();
    Map<String, Object> secondData = new HashMap<>();
    @Override
    public Map<String, Object> getFirstData()
    {
        firstData.put("label1", "check1");
        firstData.put("label2", "check2");
        firstData.put("label3", "check3");

        return firstData;
    }

    @Override
    public Map<String, Object> getSecondData()
    {
        secondData.put("label4", "check4");
        secondData.put("label5", "check5");
        secondData.put("label6", "check6");
        return secondData;
    }


}
