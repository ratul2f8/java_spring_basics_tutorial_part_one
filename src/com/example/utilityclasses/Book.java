package com.example.utilityclasses;

public class Book {
    private String Name;
    private String Type;

    public Book(String Name, String Type){
        this.Name = Name;
        this.Type = Type;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return Type;
    }
}
