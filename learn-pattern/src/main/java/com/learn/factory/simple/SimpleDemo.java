package com.learn.factory.simple;

public class SimpleDemo {
    public static void main(String[] args) {
        INoodles noodles = SimpleNoodlesFactory.createNoodles(SimpleNoodlesFactory.TYPE_GK);
        noodles.desc();
    }
}
