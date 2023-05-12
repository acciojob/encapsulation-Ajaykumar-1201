package com.driver;

public class Main {
    public static void main(String args[]) {
        RWOnly obj = new RWOnly();

        // Set the value of "name"
        obj.setName("Ajay");

        // Get the value of "name" and print it
        String str = obj.getName();
    }
}