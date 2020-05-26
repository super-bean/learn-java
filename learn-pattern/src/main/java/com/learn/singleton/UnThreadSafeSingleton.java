package com.learn.singleton;
/*
 *优点：懒加载启动快，资源占用小，使用时才实例化，无锁。
 *
 *缺点：非线程安全。
 */
public class UnThreadSafeSingleton {
    private static UnThreadSafeSingleton singleton = null;
    private UnThreadSafeSingleton() {
    }
    public static UnThreadSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new UnThreadSafeSingleton();
        }
        return singleton;
    }
}
