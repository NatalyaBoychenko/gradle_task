package com.boichenko;

import com.google.gson.Gson;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> name = new LinkedHashMap<>();

        name.put("name", "Natalia");
        name.put("lastName", "Boichenko");

        String json = new Gson().toJson(name);
        System.out.println(json);
    }
}