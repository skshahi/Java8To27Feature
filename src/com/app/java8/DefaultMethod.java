package com.app.java8;

public class DefaultMethod implements DefaultMethodInterface{
    public static void main(String[] args) {
        DefaultMethod dm=new DefaultMethod();
        Runnable reward = dm::reward;
        reward.run();
        DefaultMethodInterface.welcomeMessage();


    }

}
