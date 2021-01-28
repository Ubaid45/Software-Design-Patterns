package com.practice.creational.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEverydayDemo {

    public Statements Demo() {

        String sql = "select * from movies where title = ?";

        List<String> parameters = new ArrayList<>();

        parameters.add("Star wars");

        Record record = new Record();

        return new Statements(sql, parameters, record);



    }
}
