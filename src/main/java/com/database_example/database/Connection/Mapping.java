package com.database_example.database.Connection;

import java.io.*;
import java.util.*;

public class Mapping {

    private static Mapping mapping;

    private HashMap<String, String> map;

    private Mapping() throws IOException {
        map = new HashMap<>();
        File file = new File("C:\\Users\\YASH\\IdeaProjects\\Database\\src\\main\\java\\com\\database_example\\database\\StaticData\\EQUITY_L.csv");
        System.out.println("File Found");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            String[] data = s.split(",");
            map.put(data[1], data[0]);
        }
    }

    public static String getInstance(String company) throws IOException {
        if (mapping == null) {
            mapping = new Mapping();
            return mapping.map.get(company);
        }
        return mapping.map.get(company);
    }

}
