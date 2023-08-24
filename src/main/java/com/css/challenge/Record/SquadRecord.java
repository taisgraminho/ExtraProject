package com.css.challenge.Record;


import java.util.ArrayList;

public record SquadRecord(Long id,String name, ArrayList<String>Students) {

    public void printName(){
        System.out.println("Name: " + name);
    }

    public void printStudents(){
        System.out.println("List of students: " + Students);
    }
}

