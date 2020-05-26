package com.learn.delegate;

public class Printer {
    RealPrinter p = new RealPrinter(); // 委派
    void print() {
        p.print();
    }
}
