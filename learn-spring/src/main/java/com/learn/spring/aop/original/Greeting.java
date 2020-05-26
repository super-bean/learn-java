package com.learn.spring.aop.original;

/*
  1.before() 与 after() 方法写死在 sayHello() 方法体中
  2.我们要统计每个方法的执行时间，以对性能作出评估，那是不是要在每个方法的一头一尾都做点手脚呢
  3.我们要写一个 JDBC 程序，那是不是也要在方法的开头去连接数据库，方法的末尾去关闭数据库连接
 */
public interface Greeting {
    void sayHello(String name);
}
