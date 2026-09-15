package com.app.java8;

public interface DefaultMethodInterface {

    public default void reward()
    {
        System.out.println("Your are getting 100 rewards.");
    }

    public static void welcomeMessage()
    {
        System.out.println("Welcome to Globant...");
    }
}
