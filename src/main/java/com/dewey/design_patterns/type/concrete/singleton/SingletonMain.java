package com.dewey.design_patterns.type.concrete.singleton;

/**
 * @auther dewey
 * @date 2022/5/16 12:20
 */
public class SingletonMain {
}

/**
 * 懒汉式 线程不安全
 * 默认使用第一种也很好
 * 稍有瑕疵： 不管用到与否，类装载时就实例化了 ，所有有懒加载 lazy loading
 */
class SingletonV1 {
    private SingletonV1() {
    }

    private static final SingletonV1 instance = new SingletonV1();

    public static SingletonV1 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonV1 instance = SingletonV1.getInstance();
        SingletonV1 instance2 = SingletonV1.getInstance();
        System.out.println(instance == instance2);
    }
}

/**
 * 懒汉式 线程不安全
 */
class SingletonV2 {
    private SingletonV2() {
    }

    private static SingletonV2 instance;

    public static SingletonV2 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new SingletonV2();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //很多个 singleton 实例 so 线程不安全
            new Thread(() -> System.out.println(SingletonV2.getInstance().hashCode())).start();
        }
    }
}

/**
 * 加锁（锁的是类） 线程安全
 */
class SingletonV3 {
    private SingletonV3() {
    }

    private static SingletonV3 instance;

    public static synchronized SingletonV3 getInstance() {
        if (instance == null) {
            instance = new SingletonV3();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //一个 singleton 实例 但是效率低
            new Thread(() -> System.out.println(SingletonV3.getInstance().hashCode())).start();
        }
    }
}

/**
 * 加锁
 */
class SingletonV4 {
    private SingletonV4() {
    }
    private volatile static SingletonV4 instanceV4;

    public static SingletonV4 getInstance() {
        if (instanceV4 == null) {
            synchronized (SingletonV4.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instanceV4 = new SingletonV4();
            }
        }
        return instanceV4;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //多个 singleton 实例 if 和 synchronized 不是原子操作
            new Thread(() -> System.out.println(SingletonV4.getInstance().hashCode())).start();
        }
    }
}
/**
 * 双重检验锁 double check
 */
class SingletonV5 {
    private SingletonV5() {
    }
    private volatile static SingletonV5 instanceV5;

    public static SingletonV5 getInstance() {
        if (instanceV5 == null) {
            synchronized (SingletonV5.class) {
                if (instanceV5 == null){
                    instanceV5 = new SingletonV5();
                }
            }
        }
        return instanceV5;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //多个 singleton 实例 if 和 synchronized 不是原子操作
            new Thread(() -> System.out.println(SingletonV4.getInstance().hashCode())).start();
            new Thread(() -> System.out.println(SingletonV5.getInstance().hashCode())).start();
        }
    }
}

/**
 * 匿名静态内部类
 * SingletonV6被JVM加载的时候，SingletonV6Holder 匿名静态内部类 不会被加载，所有比第一种要好
 */
class SingletonV6 {
    private SingletonV6() {
    }

    private static class SingletonV6Holder {
        private static final SingletonV6 INSTANCE = new SingletonV6();
    }
    public static final SingletonV6 getInstance() {
        return SingletonV6Holder.INSTANCE;
    }
}

/**
 * 枚举 单例 不能序列化
 */
enum SingletonV7 {
    INSTANCE7;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(SingletonV7.INSTANCE7.hashCode())).start();
        }
    }
}
