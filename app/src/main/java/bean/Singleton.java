package bean;

/**
 * 单例的设计模式
 */

public class Singleton {
    //静态，获取到该类的对象,使用volatitle修饰，表示不稳定，每次被线程访问，都强迫从内存中重新读取
    public static volatile Singleton instance = null;

    //私有化构造方法，防止调用
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {//再次判断防止不同线程对象不一致
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
