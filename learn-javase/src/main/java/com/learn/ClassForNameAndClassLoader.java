package com.learn;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Java是如何加载到jvm里面然后被识别的呢，其实分为三步：
 * 装载：（loading）找到class对应的字节码文件。
 * 连接：（linking）将对应的字节码文件读入到JVM中。
 * 初始化：（initializing）对class做相应的初始化动作。
 */
public class ClassForNameAndClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         *
         *Class.forName("className");其实这种方法调运的是：
         *Class.forName(className, true,ClassLoader.getCallerClassLoader())方法
         *参数一：className，需要加载的类的名称。
         *参数二：true，是否对class进行初始化（需要initialize）
         *参数三：classLoader，对应的类加载器
         */
        Class klass=Class.forName("com.learn.ClassForNameAndClassLoader");
        System.out.println(klass);
        klass=Class.forName("com.learn.ClassForNameAndClassLoader",true,ClassLoader.getSystemClassLoader());
        System.out.println(klass);
        /**
         *
         * ClassLoader.loadClass("className"); 其实这种方法调运的是ClassLoader.loadClass(name, false)方法：
         * 参数一：name,需要加载的类的名称
         * 参数二：false，这个类加载以后是否需要去连接（不需要linking）
         */
        ClassLoader classLoader=ClassForNameAndClassLoader.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
        /**
         *
         * 两种方式的区别：
         * Class.forName除了将类的.class文件加载到jvm中之外，还会对类进行解释，执行类中的static块。
         * 而classloader只干一件事情，就是将.class文件加载到jvm中，不会执行static中的内容，只有在newInstance才会去执行static块。
         * forName("")得到的class是已经初始化完成的
         * loadClass("")得到的class是还没有连接的
         * 一般情况下，这两个方法效果一样，都能装载Class。但如果程序依赖于Class是否被初始化，就必须用Class.forName(name)了。
         * 最重要的区别是 forName 会初始化Class，而 loadClass 不会。
         * 因此如果要求加载时类的静态变量被初始化或静态块里的代码被执行就只能用 forName，而用 loadClass 只有等创建类实例时才会进行这些初始化。
         *
         *
         */
    }

}
