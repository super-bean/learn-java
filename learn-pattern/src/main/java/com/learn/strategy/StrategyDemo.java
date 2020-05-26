package com.learn.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
//        Strategy stra = new SHA1Strategy();
//        stra.encrypt();
        Context context = new Context(new MD5Strategy());
        context.encrypt();
        context = new Context(new SHA1Strategy());
        context.encrypt();
    }
}
