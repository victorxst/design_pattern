package com.example.design_pattern.pattern.behavioral.strategy;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class Data {
    static Map<String, String> map = new HashMap<>();
    public void load(){
        map.put("test", "success");
    }
    public String find(){
        return map.get("test");
    }
}
