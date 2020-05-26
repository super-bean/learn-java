package com.learn.singleton;

/**
 *
 * 优点：懒加载，线程安全。
 * 注：实例必须有 volatile 关键字修饰，其保证初始化完全。
 */

public class DoubleCheckLockSingleton {

    /**
     * 对保存实例的变量添加volatile的修饰
     */

    private volatile static DoubleCheckLockSingleton instance = null;

    private DoubleCheckLockSingleton(){

    }

    public static DoubleCheckLockSingleton getInstance(){

        //先检查实例是否存在，如果不存在才进入下面的同步块

        if(instance == null){

        //同步块，线程安全的创建实例

            synchronized(DoubleCheckLockSingleton.class){

        //再次检查实例是否存在，如果不存在才真的创建实例

                if(instance == null){

                    instance = new DoubleCheckLockSingleton();

                }

            }

        }

        return instance;

    }

}
