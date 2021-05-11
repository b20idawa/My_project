package com.example.my_project;

public class Animals {

    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    private String auxdata;

    public String info() {
        return "Djur:   " + name + '\n' +
                "Vart:   " + location + '\n' +
                "Typ:    " + category + '\n' +
                "Vikt:   " + size + "kg";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
