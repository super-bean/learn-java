package com.learn.delegate;

public class C implements I {

    I i = new A();
    public void f() {
        i.f();
    }
    public void g() {
        i.g();
    }
    public void toA() {
        i = new A();
    }
    public void toB() {
        i = new B();
    }

}
